/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recipes.controller;

import com.recipes.dao.DAO;
import com.recipes.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * 
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
        HttpSession session = request.getSession(true);
        DAO dao = new DAO();
        if (request.getParameter("adminlogin") != null) {
            User user = dao.checkAdmin(request.getParameter("email"), request.getParameter("password"));
            if (user != null) {
                session.setAttribute("user_id", user.getId());
                session.setAttribute("email", request.getParameter("email"));
                session.setAttribute("pass", request.getParameter("pass"));
                session.setAttribute("firstname", user.getFirstname());
                session.setAttribute("lastname", user.getLastname());
                session.setAttribute("address", user.getAddress());
                session.setAttribute("image", user.getImage());
                session.setAttribute("admin", "1");
                session.setMaxInactiveInterval(1000000);
                response.sendRedirect("admin/users.jsp");
            } else {
                
                //RequestDispatcher requestDispatcher;
                //requestDispatcher = request.getRequestDispatcher("admin/login.jsp");
                //requestDispatcher.forward(request, response);
                response.sendRedirect("admin/login.jsp?error=0");
            }
        }else if(request.getParameter("login") != null){
            User user = dao.checkUser(request.getParameter("email"), request.getParameter("password"));
            if (user != null) {
                session.setAttribute("user_id", user.getId());
                session.setAttribute("user", request.getParameter("user"));
                session.setAttribute("pass", request.getParameter("pass"));
                session.setAttribute("firstname", user.getFirstname());
                session.setAttribute("lastname", user.getLastname());
                session.setAttribute("address", user.getAddress());
                session.setAttribute("image", user.getImage());
                session.setMaxInactiveInterval(1000000);
                response.sendRedirect("index.jsp");
            } else {
                
                //RequestDispatcher requestDispatcher;
                //requestDispatcher = request.getRequestDispatcher("admin/login.jsp");
                //requestDispatcher.forward(request, response);
                response.sendRedirect("login.jsp?error=0");
            }
        }else if(request.getParameter("register")!=null){
            User user = new User();
            user.setAddress("");
            user.setAdmin(0);
            user.setEmail(request.getParameter("email"));
            user.setFirstname(request.getParameter("name"));
            user.setLastname(request.getParameter("surname"));
            user.setImage("ohotos/avatar.jpg");
            user.setPassword(request.getParameter("password"));
            user.setVisible(1);
            user.setGender("");
            dao.insertUser(user);
            response.sendRedirect("login.jsp?success=");
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
