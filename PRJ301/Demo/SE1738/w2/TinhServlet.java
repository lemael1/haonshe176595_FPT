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
 * @author ADMIN
 */
@WebServlet(name="TinhServlet", urlPatterns={"/tinh"})
public class TinhServlet extends HttpServlet {
   
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
            out.println("<title>Servlet TinhServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TinhServlet at " + request.getContextPath () + "</h1>");
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
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
    throws ServletException, IOException {
        //processRequest(request, response);
        //lay duoc dai va rong tu form
        String num1_raw=request.getParameter("num1");
        String num2_raw=request.getParameter("num2");
        String op=request.getParameter("op");
        PrintWriter out=response.getWriter();
        double num1,num2;
        try{
            num1=Double.parseDouble(num1_raw);
            num2=Double.parseDouble(num2_raw);
            String result=tinh(num1, num2, op);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TinhServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            
            out.print("<h2 style='color:blue'>Ket qua:"+result+"</h2>");
            
            out.println("</body>");
            out.println("</html>");
            
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    } 
    private String tinh(double x,double y,String o){
        String s="";
        switch (o) {
            case "+":
                s="tong:"+(x+y);
                break;
            case "-":
                s="hieu:"+(x-y);
                break;
            case "x":
                s="tich:"+(x*y);
                break;
            case ":":
                if(y==0)
                    s="khong chia cho 0";
                else
                    s="thuong:"+(x/y);
                break;    
        }
        return s;
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
        //tu form
        String u=request.getParameter("user");
        String p=request.getParameter("pass");
        //tu web.xml
        String context_u=getServletContext().getInitParameter("user");
        String context_p=getServletContext().getInitParameter("pass");
        
        
        PrintWriter out=response.getWriter();
        if(u.equalsIgnoreCase(context_u) && p.equals(context_p)){
            out.print("Hello "+u);
        }else{
            //sai
            //out.print("nhap sai!!!");
            response.sendRedirect("index.html");
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
