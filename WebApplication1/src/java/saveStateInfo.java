/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author utsav
 */
public class saveStateInfo extends HttpServlet {

    private Connection con;
    private PreparedStatement ps;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            
//        String state = request.getParameter("state");
//        String userid = request.getParameter("userid");

        // reading data from session object 
        HttpSession session = request.getSession();
        String state = (String) session.getAttribute("sname");
        String userid = (String) session.getAttribute("userid");
        
        int active = Integer.parseInt(request.getParameter("active"));
        int total = Integer.parseInt(request.getParameter("total"));
        int deaths = Integer.parseInt(request.getParameter("deaths"));
        
        java.util.Date dt = new java.util.Date();
        long val = dt.getTime();
        java.sql.Date idate = new java.sql.Date(val );
        
        
        PrintWriter out = response.getWriter(); 
        
        try{
            
            ps.setString(1, state);
            ps.setInt(2, total);
            ps.setInt(3, active);
            ps.setInt(4, deaths);
            ps.setString(5, userid);
            
            int result = ps.executeUpdate();            
            
            out.println("<html>");
            out.println("<body>");
            out.println("Information Updated! <a href=stateAdminDashboard.jsp > dashboard </a>");
            out.println("</body>");
            out.println("</html>");
        }catch(Exception e){
            out.println(e);
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        try{
            //con = myPkg.Utility.connectDB();
            
            ServletContext cntx = getServletContext();
            
            con  =  (Connection) cntx.getAttribute("DB_CONNECTION");

            String sql = "INSERT INTO caseInfo(idate,state,total,active,deaths,userid) VALUES (now(),?,?,?,?,?)";

            ps = con.prepareStatement(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        try{
         }catch(Exception e){
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
