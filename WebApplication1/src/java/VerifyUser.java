/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
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

public class VerifyUser extends HttpServlet {
     
    private Connection con;
    private PreparedStatement ps1,ps2;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        try{
            con = myPkg.Utility.connectDB();

            ps1 = con.prepareStatement("SELECT * FROM users WHERE email=? AND password=?");
            ps2 = con.prepareStatement("SELECT * FROM stateAdmin WHERE userid=? AND password=?");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    HttpSession session;

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
        
        String uid = request.getParameter("email");
        String password = request.getParameter("password");
        String userType = request.getParameter("user-type");
        
        if(userType.equals("user")){
            try{
                ps1.setString(1, uid);
                ps1.setString(2, password);
                ResultSet rs = ps1.executeQuery();
                
                boolean found = rs.next();
                if(found){
                    response.sendRedirect("userDashboard.jsp");
                }else{
                    out.println("<html><body>");
                    out.println("<h2>Invalid User Account</h2>");
                    out.println("<a href=index.jsp >Try Again</a>");
                    out.println("</body></html>");
                }
            }catch(Exception e){
                out.println(e);
            }
        }else if(userType.equals("state-admin")){
            try{
                ps2.setString(1, uid);
                ps2.setString(2, password);
                ResultSet rs = ps2.executeQuery();
                
                boolean found = rs.next();
                if(found){
                    String status = rs.getString("status");
                    String userid = rs.getString("userid");
                    if(status.equals("disabled")){
                        out.println("<html>");                        
                        out.println("<body>");
                        out.println("<h1>profile complition form</h1>");
                        out.println("<form action=UpdateStateAdminProfile method=POST>");                        
                        // userid, password , uname, email , address , mobile
                        out.println("<pre>");
                        out.println("userid     : <input name=userid value="+userid+">");
                        
                        out.println("Password   : <input type=password name=password>");
                        
                        out.println("Username   : <input name=uname>");
                        
                        out.println("Email      : <input type=email name=email>");
                        
                        out.println("Address    : <input name=address>");

                        out.println("Mobile     : <input name=mobile>");

                        out.println("             <input type=submit value=Update>");

                        out.println("</pre>");
                        out.println("</form>");                        
                        out.println("</body>");
                        out.println("</html>");
                    }else{ 
                        // storing id and state in session object
                         session = request.getSession();
                         session.setAttribute("userid", userid);
                         session.setAttribute("sname", rs.getString("sname"));
                         
                        response.sendRedirect("stateAdminDashboard.jsp");
                    }
                }else{
                    out.println("<html><body>");
                    out.println("<h2>Invalid User Account</h2>");
                    out.println("<a href=index.jsp >Try Again</a>");
                    out.println("</body></html>");
                }
            }catch(Exception e){
                out.println(e);
            }
        }else if(userType.equals("admin")){
            if(uid.equals("simsim") && password.equals("hiUtsav")){            
                //response.sendRedirect("superAdminDashboard.jsp");
                session = request.getSession();
                session.setAttribute("userid", "superAdmin");
                
                RequestDispatcher rd = request.getRequestDispatcher("superAdminDashboard.jsp");
                rd.forward(request, response);
            }else{
                out.println("<html><body>");
                out.println("<h2>Invalid User Account</h2>");
                out.println("<a href=index.jsp >Try Again</a>");
                out.println("</body></html>");
            }
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
