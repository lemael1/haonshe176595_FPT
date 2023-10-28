/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.CommentDAO;
import dal.ThreadDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Comment;

/**
 *
 * @author 1112v
 */
public class DiscussServlet extends HttpServlet {
   
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
            out.println("<title>Servlet DiscussServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DiscussServlet at " + request.getContextPath () + "</h1>");
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
     HttpSession session = request.getSession();
      String result =(String) session.getAttribute("result");
      if(result==null || result.equals("Login failed")){
      PrintWriter out= response.getWriter();
      out.println("Accessdenied");
      }else{
             Account a =(Account) session.getAttribute("account");
             // Send all Threads to /discuss
             ThreadDAO thDAO= new ThreadDAO();
             List<model.Thread> Thread_list=thDAO.GetAllThread();
             request.setAttribute("Thread_list",Thread_list);
             CommentDAO cmtDAO= new CommentDAO();
             List<Comment> Comment_list=cmtDAO.GetAllComment();
             request.setAttribute("Comment_list", Comment_list);
             
             
            
             
      }
      request.getRequestDispatcher("discuss.jsp").forward(request, response);
        
   
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
      CommentDAO cmtDAO= new CommentDAO();
      String ctitle_raw=request.getParameter("ctitle");
      int cid=cmtDAO.nextid();
      String tid_raw=request.getParameter("threadid1");
      int tid = 0;
        try {
            tid=Integer.parseInt(tid_raw);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
      
    
        try {
            cmtDAO.insertComment(cid, ctitle_raw, userid,tid);
        } catch (SQLException ex) {
            Logger.getLogger(DiscussServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
