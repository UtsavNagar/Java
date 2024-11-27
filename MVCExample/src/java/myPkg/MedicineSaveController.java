/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package myPkg;

import Services.MedicineService;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MedicineSaveController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            // get data form request object
            int code = Integer.parseInt(request.getParameter("code"));
            String name = request.getParameter("name");
            String type = request.getParameter("type");
            int price = Integer.parseInt(request.getParameter("price"));
            
            // save data in the db
            // create a object of medicine service class
            MedicineService medService = new MedicineService();
            
            // create a object of medicine class couse save methode of medicine service object accept object of medicine in param
            Medicine med = new Medicine();
            med.setCode(code);                  // set values of varibles
            med.setName(name);
            med.setPrice(price);
            med.setType(type);
            
            // save data with save method of service object for medicine
            medService.save(med);
            
            // forward your request to the view part
            response.sendRedirect("saveConfirm.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(MedicineSaveController.class.getName()).log(Level.SEVERE, null, ex);
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
