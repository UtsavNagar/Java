/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author utsav
 */
public class DataForAllState extends HttpServlet {
    private Connection con;
    private PreparedStatement ps;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        try{
            con = myPkg.Utility.connectDB();

            String sql = "SELECT * FROM caseInfo";

            ps = con.prepareStatement(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        try{
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        ResultSet rs;
        
        try (PrintWriter out = response.getWriter()) {
            rs = ps.executeQuery();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Data For All States</h1>");
            out.println("<a href=stateAdminDashboard.jsp>Back</a>");
            out.println("<hr>");
            out.println("<table border=2>");
            out.println("<tr>");
              out.println("<th>Sno.</th><th>State</th><th>Date</th><th>Total</th><th>Active</th><th>Deaths</th>");
            out.println("</tr>");
            while(rs.next()){
                String sno = rs.getString("sno");
                String stateName = rs.getString("state");
                String date = rs.getString("idate");
                String total = rs.getString("total");
                String active = rs.getString("active");
                String deaths = rs.getString("deaths");
                out.println("<tr>");
                    out.println("<td>"+sno+"</td><td>"+stateName+"</td><td>"+date+"</td><td>"+total+"</td><td>"+active+"</td><td>"+deaths+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");            
            out.println("</body>");
            out.println("</html>");
        }catch(SQLException e){
            e.printStackTrace();
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
        processRequest(request, response);
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
