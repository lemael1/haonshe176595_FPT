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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //lay dai,rong o form
//        String dai_raw=request.getParameter("dai");
//        String rong_raw=request.getParameter("rong");
//        double d,r;
//        PrintWriter out=response.getWriter();
//        try{
//            d=Double.parseDouble(dai_raw);
//            r=Double.parseDouble(rong_raw);
//            double s=d*r;
//            out.print("Dien tich:"+s);
//        }catch(NumberFormatException e){
//            System.out.println(e);
//        }   
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
        //lay dai,rong o form
        String dai_raw=request.getParameter("dai");
        String rong_raw=request.getParameter("rong");
        String cv=request.getParameter("cv");
        String dt=request.getParameter("dt");
        double d,r;
        PrintWriter out=response.getWriter();
        try{
            d=Double.parseDouble(dai_raw);
            r=Double.parseDouble(rong_raw);
            if(cv==null && dt==null){
                out.print("khong tinh gi a?");
            }
            if(cv!=null && dt==null){
                double s=(d+r)*2;
            out.print("chu vi:"+s);
            }
            if(dt!=null && cv==null){
                double s=d*r;
            out.print("dien tich:"+s);
            }
            if(cv!=null && dt!=null){
                double s=(d+r)*2;
            out.print("chu vi:"+s+" dien tich:"+(d*r));
            }
            
        }catch(NumberFormatException e){
            System.out.println(e);
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
