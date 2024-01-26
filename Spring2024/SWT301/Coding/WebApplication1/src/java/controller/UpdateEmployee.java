/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import dal.EmployeeDAO;
import models.Employee;

/**
 *
 * @author Dan
 */
@WebServlet(name = "UpdateEmployee", urlPatterns = {"/update-employee"})
public class UpdateEmployee extends HttpServlet {

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
        String name = request.getParameter("name");
        String image = request.getParameter("image");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        boolean gender = true;
        if (request.getParameter("gender").equals("male")) {
            gender = false;
        }
        String birthDate = request.getParameter("birthDate");
        String hireDate = request.getParameter("hireDate");
        String idParameter = request.getParameter("id");
        //int id = Integer.parseInt(idParameter);
        EmployeeDAO dao = new EmployeeDAO();
        dao.updateEmployee(name, phoneNumber, address, email, gender, image, birthDate, hireDate, idParameter);
        response.sendRedirect("list-employee");

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
        request.getRequestDispatcher("update-employee.jsp").forward(request, response);
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
String name = request.getParameter("name");
        String image = request.getParameter("image");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        boolean gender = true;
        if (request.getParameter("gender").equals("male")) {
            gender = false;
        }
        String birthDate = request.getParameter("birthDate");
        String hireDate = request.getParameter("hireDate");
        String idParameter = request.getParameter("id");
        //int id = Integer.parseInt(idParameter);
        EmployeeDAO dao = new EmployeeDAO();
        dao.updateEmployee(name, phoneNumber, address, email, gender, image, birthDate, hireDate, idParameter);
        response.sendRedirect("list-employee");
        
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
