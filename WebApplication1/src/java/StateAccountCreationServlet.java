import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StateAccountCreationServlet extends HttpServlet {
    
    private Connection con;
    private PreparedStatement ps;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");

            String uid = request.getParameter("uid");
            String password = request.getParameter("password");
            String state = request.getParameter("state");

            PrintWriter out = response.getWriter();

            try {
                // Log the incoming values for debugging
                System.out.println("Received UID: " + uid);
                System.out.println("Received Password: " + password);
                System.out.println("Received State: " + state);

                ps.setString(1, uid);
                ps.setString(2, password);
                ps.setString(3, state);

                int result = ps.executeUpdate();

                out.println("<html>");
                out.println("<body>");
                out.println("Registered successfully! <a href=state-account.jsp >Add more</a>");
                out.println("</body>");
                out.println("</html>");
            } catch (Exception e) {
                e.printStackTrace();  // Log the exception to the server logs
                out.println("<html>");
                out.println("<body>");
                out.println("Error: " + e.getMessage());  // Output the error message to the client
                out.println("</body>");
                out.println("</html>");
            }
        }


    @Override
    public void init(ServletConfig config) throws ServletException {
        try{
            con = myPkg.Utility.connectDB();

            String sql = "INSERT INTO stateAdmin VALUES (?,?,?,null,null,null,null,'disabled')";

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
