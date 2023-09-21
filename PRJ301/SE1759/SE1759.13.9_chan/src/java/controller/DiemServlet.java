/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import com.sun.corba.se.spi.orbutil.fsm.FSMTest;
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
@WebServlet(name = "DiemServlet", urlPatterns = {"/diem"})
public class DiemServlet extends HttpServlet {

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
            out.println("<title>Servlet DiemServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DiemServlet at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("Diem.html").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String toan_raw = request.getParameter("Toan");
        String ly_raw = request.getParameter("Ly");
        String hoa_raw = request.getParameter("Hoa");
        String van_raw = request.getParameter("Van");
        String anh_raw = request.getParameter("Anh");
        String truong_raw = request.getParameter("truong");
        String[] khoi = request.getParameterValues("khoi");
        String DiemUT = request.getParameter("d");
       
        if (toan_raw.equals("") || ly_raw.equals("") || hoa_raw.equals("") || van_raw.equals("") || anh_raw.equals("")) {
            out.println("Nhap day du thong tin");
        } else {
            try {
                double toan = Double.parseDouble(toan_raw);
                double ly = Double.parseDouble(ly_raw);
                double hoa = Double.parseDouble(hoa_raw);
                double van = Double.parseDouble(van_raw);
                double anh = Double.parseDouble(anh_raw);
                double diemUT = diemUT(DiemUT);                
                String[] msg = khoi(toan, ly, hoa, van, anh, khoi, diemUT);
                for (int i = 0; i < msg.length; i++) {
                    out.println(msg[i]);
                }
                double DA = toan + ly + hoa + diemUT;
                double DA1 = toan + ly + anh + diemUT;
                double DD = toan + anh + van + diemUT;
                out.println(CongBo(truong_raw, DA, DA1, DD));
            } catch (NumberFormatException e) {
                out.println("Nhap thong tin day du");
            }
        }
        
    }
    
    public String[] khoi(double toan, double ly, double hoa, double van, double anh, String[] khoi, double diemUT) {
        String[] msg2 = new String[khoi.length];
        
        for (int i = 0; i < khoi.length; i++) {
            String msg = "";
            switch (khoi[i]) {
                case "0":
                    msg = "Diem khoi A la :" + (toan + ly + hoa + diemUT);
                    break;
                case "1":
                    msg = "Diem khoi A1 la :" + (toan + ly + anh + diemUT);
                    break;
                case "2":
                    msg = "Diem khoi D la :" + (toan + anh + van + diemUT);
                
            }
            msg2[i] = msg;
        }
        return msg2;
    }
    
    public double diemUT(String diemUT) {
        double diem = 0;
        if (diemUT.equals("a")) {
            diem = 0;
        } else if (diemUT.equals("b")) {
            diem = 0.5;
        } else if (diemUT.equals("c")) {
            diem = 1;
        }
        return diem;
    }

    public String CongBo(String truong_raw, double DA, double DA1, double DD) {
        String msg = "";
        String k = "";
        switch (truong_raw) {
            case "FPT":
                if (DA > 20.5) {
                    k += "A ";
                }
                if (DA1 > 20.5) {
                    k += "A1 ";
                }
                if (DD > 21.5) {
                    k += "D ";
                }
                msg = "Chuc mung ban da do " + truong_raw + "khoi" + k;
                break;
            case "HUST":
                if (DA > 22) {
                    k += "A ";
                }
                if (DA1 > 22) {
                    k += "A1 ";
                }
                if (DD > 22) {
                    k += "D ";
                }
                msg = "Chuc mung ban da do " + truong_raw + "khoi" + k;
                break;
            case "UET":
                if (DA > 20) {
                    k += "A ";
                }
                if (DA1 > 22) {
                    k += "A1 ";
                }
                if (DD > 22) {
                    k += "D ";
                }
                msg = "Chuc mung ban da do " + truong_raw + "khoi" + k;
                break;
            
        }
        return msg;
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
