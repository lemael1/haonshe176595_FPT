/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.time.Year;

/**
 *
 * @author 1112v
 */
public class RegisterServlet extends HttpServlet {

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
            out.println("<title>Servlet RegisterServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("register.jsp").forward(request, response);
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
        PrintWriter out = response.getWriter();
        String studentcode_raw = request.getParameter("studentcode");
        String studentname_raw = request.getParameter("studentname");
        String date_raw = request.getParameter("dob");
        String msg = "";

        if (studentcode_raw == null || studentname_raw == null || date_raw == null) {
            msg = "Register failed: Missing input";
        } else {
            String check = studentcode_raw.substring(0, 3);
            int date;
            try {
                date = Integer.parseInt(date_raw.substring(0, 4));
            } catch (NumberFormatException e) {
                msg = "Register failed: Invalid date format";
                out.println(msg);
                return;
            }
            int year = Year.now().getValue();
            if (!check.equals("FPT")) {
                msg = "Register failed: Student code must start with 'FPT'";
            } else if (studentcode_raw.length() > 9) {
                msg = "Register failed: Student code must not exceed 9 characters";
            } else if (studentname_raw.length() < 6 || studentname_raw.length() > 32) {
                msg = "Register failed: Student name must be between 6 and 32 characters";
            } else if (year - date < 18) {
                msg = "Register failed: Student must be at least 18 years old";
            } else {
                msg = "Student registered successful";
            }
        }
        out.println(msg);
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
