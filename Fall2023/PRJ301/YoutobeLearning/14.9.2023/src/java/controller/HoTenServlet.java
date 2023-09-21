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
@WebServlet(name="HoTenServlet", urlPatterns={"/hoten"})
public class HoTenServlet extends HttpServlet {
   
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
            out.println("<title>Servlet HoTenServlet</title>");  
            out.println("meta charset=\"UTF-8\"");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HoTenServlet at " + request.getContextPath () + "</h1>");
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
       request.getRequestDispatcher("index.html").forward(request, response);
    } 

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String hoten_raw=request.getParameter("hoten");
        String gioitinh_raw=request.getParameter("d");
        String diem_raw=request.getParameter("diem");
        String msg="";
        if (hoten_raw.equals("")||diem_raw.equals("")) {
            msg="khong duoc de trong ten";           
        }else{
            try {
                double diem=Double.parseDouble(diem_raw);
                msg=Hoten(hoten_raw, gioitinh_raw, diem);
            } catch (NumberFormatException e) {
                out.println("Khong hop le");
            }
        }
        out.println(msg);
    }
    public String Hoten(String ten,String gioitinh,double diem){
        String msg="";
        if(gioitinh.equals("0")){
        msg+="hello Mr "+ten;
        }else if(gioitinh.equals("1")){
            msg+="hello Miss "+ten;
        }
        if(diem>=5){
            msg+=". Chuc mung "+ten+" đã pass môn";
        }else{
             msg+=". Chia buồn , chúc bạn may mắn kì sau";
        }
        return msg;
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
