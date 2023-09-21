/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DepartmentDAO;
import dal.EmployeeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Department;
import model.Employee;


public class SearchServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SearchServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchServlet at " + request.getContextPath() + "</h1>");
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
        DepartmentDAO dDB = new DepartmentDAO();
        List<Department> depts = dDB.getAllDepts();
        request.setAttribute("depts", depts);
        String raw_id = request.getParameter("id");
        String name = request.getParameter("name");
        String raw_gender = request.getParameter("gender");
        if(raw_gender ==null)
            raw_gender = "both";
        String raw_from = request.getParameter("from");
        String raw_to = request.getParameter("to");
        String raw_did = request.getParameter("did");
        Integer id;
        int did;
        try{
             id = (raw_id == null || raw_id.equals(""))
                ? null : Integer.parseInt(raw_id);
        Boolean gender = (raw_gender.equals("both"))
                ? null : (raw_gender.equals("male"));
        Date from = (raw_from == null || raw_from.equals(""))
                ? null : Date.valueOf(raw_from);
        Date to = (raw_to == null || raw_to.equals(""))
                ? null : Date.valueOf(raw_to);
        did = (raw_did == null || raw_did.equals(""))
                ? 0 : Integer.parseInt(raw_did);
        
        EmployeeDAO empDB = new EmployeeDAO();
        List<Employee> emps = empDB.search(id, name, gender,
                from, to, did); 
        request.setAttribute("emps", emps);
        request.getRequestDispatcher("search.jsp").forward(request, response);
        }catch(IOException e){
            
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
