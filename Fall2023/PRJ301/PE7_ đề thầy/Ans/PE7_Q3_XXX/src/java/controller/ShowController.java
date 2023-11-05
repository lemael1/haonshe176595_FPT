/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.DBContext;
import dto.StudentDTO;
import dto.SubjectDTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duongpv
 */
public class ShowController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShowController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            if (request.getParameter("id_sbj") != null ) {
                DBContext db = new DBContext();
                ArrayList<SubjectDTO> lst_sbjs = db.getAllSubjects();
                ArrayList<StudentDTO> lst_stds = db.getStudentBySb(request.getParameter("id_sbj"));
                request.setAttribute("lst_sbjs", lst_sbjs);
                request.setAttribute("lst_stds", lst_stds);
                request.setAttribute("id_subject", request.getParameter("id_sbj"));
                request.getRequestDispatcher("show.jsp").forward(request, response);
            } else if (request.getParameter("id_student") != null) {
                DBContext db = new DBContext();
                ArrayList<StudentDTO> lst_stds = null;
                if (request.getParameter("id_subject_dt") != null) {
                    lst_stds = db.getStudentBySb(request.getParameter("id_subject_dt"));
                    request.setAttribute("id_subject", request.getParameter("id_subject_dt"));
                } else {
                    lst_stds = db.getAllStudents();
                }
                ArrayList<SubjectDTO> lst_sbjs = db.getAllSubjects();
                StudentDTO detail_std = db.getStudentByID(request.getParameter("id_student"));
                request.setAttribute("lst_sbjs", lst_sbjs);
                request.setAttribute("lst_stds", lst_stds);
                request.setAttribute("detail_std", detail_std);
                request.getRequestDispatcher("show.jsp").forward(request, response);
            } else {
                DBContext db = new DBContext();
                ArrayList<SubjectDTO> lst_sbjs = db.getAllSubjects();
                ArrayList<StudentDTO> lst_stds = db.getAllStudents();
                request.setAttribute("lst_sbjs", lst_sbjs);
                request.setAttribute("lst_stds", lst_stds);
                request.getRequestDispatcher("show.jsp").forward(request, response);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ShowController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
