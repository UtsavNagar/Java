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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VerifyUser extends HttpServlet {
     
    private Connection con;
    private PreparedStatement ps1;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        try{
            con = myPkg.Utility.connectDB();

            String sql = "SELECT * FROM users WHERE email=? AND password=?";

            ps1 = con.prepareStatement(sql);
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
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String userType = request.getParameter("user-type");
        
        if(userType.equals("user")){
            try{
                ps1.setString(1, email);
                ps1.setString(2, password);
                ResultSet rs = ps1.executeQuery();
                
                boolean found = rs.next();
                if(found){
                    out.println("Wellcom User");
                }else{
                    out.println("Invalid Data");
                }
            }catch(Exception e){
                out.println(e);
            }
        }else if(userType.equals("state-admin")){
            out.println("state-admin!");
        
        }else if(userType.equals("admin")){
            out.println("admin");
            
        }
        
        out.close();           
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
