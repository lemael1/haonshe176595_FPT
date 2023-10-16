/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Major;
import model.Student;

/**
 *
 * @author 1112v
 */
@WebServlet(name = "AddServlet", urlPatterns = {"/add"})
public class AddServlet extends HttpServlet {

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
            out.println("<title>Servlet AddServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddServlet at " + request.getContextPath() + "</h1>");
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
        String rollCode_raw = request.getParameter("rollCode");
        String fullName_raw = request.getParameter("fullName");
        String dob_raw = request.getParameter("dob");
        String gender_raw = request.getParameter("gen");
        String major_raw = request.getParameter("major");
        DAO d = new DAO();
        int rollCode;
        String gender = null;
        String major = null;
        try {
            rollCode = Integer.parseInt(rollCode_raw);
            Student s = new Student();
            if (gender_raw.equals("0")) {
                gender = "Nam";
            } else if (gender_raw.equals("1")) {
                gender = "Nu";
            }
            if (major_raw.equals("SE")) {
                major = "SE";
            } else if (major_raw.equals("AI")) {
                major = "AI";
            } else if (major_raw.equals("IS")) {
                major = "IS";
            }
            s.setRollCode(rollCode);
            s.setFullName(fullName_raw);
            s.setDoB(dob_raw);
            s.setGender(gender);
            Major m = new Major();
            m.setMajor(major);
            m.setRollCode(rollCode);
            s.setMajor(m);
            boolean success = d.addStudent(s);
            if (success) {
                response.sendRedirect("list");  
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (SQLException ex) {
            Logger.getLogger(AddServlet.class.getName()).log(Level.SEVERE, null, ex);
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
