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

/**
 *
 * @author 1112v
 */
@WebServlet(name = "Toan3Servlet", urlPatterns = {"/toan2"})
public class Toan3Servlet extends HttpServlet {

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
            out.println("<title>Servlet Toan1Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Toan1Servlet at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("Toan2.html").forward(request, response);
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
       PrintWriter out=response.getWriter();
        String num1_raw = request.getParameter("num1");
        String num2_raw = request.getParameter("num2");
        String op = request.getParameter("op");
        try {
            double num1 = Double.parseDouble(num1_raw);
            double num2 = Double.parseDouble(num2_raw);
           String msg= tinhtoan(num1, num2, op);
            out.println(msg);

        } catch (NumberFormatException e) {
            System.out.println("Nhap lai");
        }
    }

    public String tinhtoan(double num1, double num2, String op) {
        String msg = "";
        switch (op) {
            case "+":
                msg = "Tong =" + (num1 + num2);
                break;
            case "-":
                msg = "Hieu =" + (num1 - num2);
                break;
            case "*":
                msg = " Tich =" + (num1 * num2);
            case "/":
                if (num2 == 0) {
                    msg = "Khong the chia cho 0";
                } else {
                    msg = " Thuong bang" + (num1 / num2);
                }

        }
       return msg;
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
