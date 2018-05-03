/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaz_v1.servlets;

import com.Interfaz_v1.MySQL.Conectar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Neto
 */
public class datosdb extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<title>Servlet datosdb</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //CODIGO CONEXION
            String server = request.getParameter("server");
            String bd = request.getParameter("bd");
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            
            Conectar c = new Conectar(server,bd,user,pass);
            
            out.println("<h1>Selección de datos</h1>");
                out.println("<table>");
                    out.println("<tr>");
                    out.println("<th>Servidor :</th><th>"+server+"</th>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<th>Nombre BD :</th><th>"+bd+"</th>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<th>Usuario :</th><th>"+user+"</th>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<th>Contraseña :</th><th>"+pass+"</th>");
                    out.println("</tr>");
                out.println("</table>");
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
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
