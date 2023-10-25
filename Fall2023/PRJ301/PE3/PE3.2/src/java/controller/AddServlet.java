/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.AuthorDAO;
import dal.Author_PaperDAO;
import dal.DAO;
import dal.PaperDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import model.Author;
import model.Paper;

/**
 *
 * @author 1112v
 */
@WebServlet(name="AddServlet", urlPatterns={"/add"})
public class AddServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        DAO d= new DAO();
        List<Author> author_list= d.getAllAuthors();
        request.setAttribute("author_list", author_list);
        
       request.getRequestDispatcher("add.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String paperid_raw=request.getParameter("paperid");
        String title_raw= request.getParameter("title");
        Date date = Date.valueOf(request.getParameter("date"));
        String[] author_id_raw= request.getParameterValues("auid");
       
        int author_id;
        int paperid;
       
        try {
            paperid=Integer.parseInt(paperid_raw);
            // Convert the String[] array to an int[] array using Java 8 streams.
        int[] authorId = Arrays.stream( author_id_raw).mapToInt(Integer::parseInt).toArray();            
            // set object Paper
            Paper p= new Paper();
            p.setPaperid(paperid);
            p.setTitle(title_raw);
            p.setPublishedDate(date);
            PaperDAO pDao= new PaperDAO();
             Author_PaperDAO a_pDao = new Author_PaperDAO();
            try {
                
                pDao.addPaper(p);
                for (int i = 0; i < authorId.length; i++) {
                a_pDao.addAuthor_Paper(paperid, authorId[i]);
            }
            } catch (SQLException e) {
                System.out.println(e);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        //back to add.jsp
        AuthorDAO authorDao = new AuthorDAO();
        List<Author> authors = authorDao.getAuthors();

        request.setAttribute("author_list", authors);
        request.getRequestDispatcher("add.jsp").forward(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
