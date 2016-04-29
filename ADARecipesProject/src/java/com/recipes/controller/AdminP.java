/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recipes.controller;

import com.recipes.dao.DAO;
import com.recipes.entity.Dictionary;
import com.recipes.entity.Tips;
import com.recipes.entity.User;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;


@WebServlet(name = "AdminP", urlPatterns = {"/AdminP"})
public class AdminP extends HttpServlet {

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
        if(request.getParameter("createUser") != null){
            
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            try {
                List<FileItem> fields = upload.parseRequest(request);

                Iterator<FileItem> it = fields.iterator();
                if (!it.hasNext()) {
                    // fayl yoxdur mesaj
                    return;
                }


            String firstname = "";//String deyiwenleri gotururuy
            String lastname = "";
            String email = "";
            String password = "";
            String image = "";
            String address = "";
            String gender = "";
            String admin = "";

            while (it.hasNext()) { // eger file varsa
                FileItem fileItem = it.next(); // iteratorun next metodu cagrilir
                boolean isFormField = fileItem.isFormField(); // isformField-input yoxlanilirki 
                if (isFormField) { // eger isFormFIelddise
                    switch (fileItem.getFieldName()) {
                        case "name":
                            firstname = fileItem.getString("UTF-8").trim();
                            break;
                        case "surname":
                            lastname = fileItem.getString("UTF-8").trim();
                            break;
                        case "address":
                            address = fileItem.getString("UTF-8").trim();
                            break;
                        case "email":
                            email = fileItem.getString("UTF-8").trim();
                            break;
                        case "password":
                            password = fileItem.getString("UTF-8").trim();
                            break;
                        case "gender":
                            gender = fileItem.getString("UTF-8").trim();
                            break;
                        case "admin":
                            admin = fileItem.getString("UTF-8").trim();
                            break;
                    }
                } else {
                     if(fileItem.getFieldName().equals("image")){
                            if(!fileItem.getString("UTF-8").trim().equals("")){
                        image = fileItem.getName();
                        image = dao.generateCode() + image;
                        String relativeWebPath = "photos";
                        String absoluteDiskPath = getServletContext().getRealPath(relativeWebPath);
                        File file = new File(absoluteDiskPath + "/", image);
                        fileItem.write(file);
                            }
                    }
                }
            }
            
            User up = new User();
            up.setAddress(address);
            up.setEmail(email);
            up.setFirstname(firstname);
            up.setLastname(lastname);
            up.setGender(gender);
            up.setPassword(password);
            up.setImage("photos/"+image);
            if(admin.equals("on"))
                up.setAdmin(1);
            else
                up.setAdmin(0);
            
            dao.insertUser(up);
                
                response.sendRedirect("admin/users.jsp");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
            
            
        }else if(request.getParameter("delete") != null){
            dao.deleteUser(request.getParameter("id"));
            response.sendRedirect("admin/users.jsp");
        }else if(request.getParameter("approveRecipe")!=null){
            String id = request.getParameter("approveRecipe");
            dao.approveRecipe(id);
            response.sendRedirect("admin/recipes.jsp");
        }else if(request.getParameter("deleteRecipe")!=null){
            String id = request.getParameter("deleteRecipe");
            dao.deleteRecipe(id);
            response.sendRedirect("admin/recipes.jsp");
        }else if(request.getParameter("deleteDictionary")!=null){
            dao.deleteDictionary(request.getParameter("deleteDictionary"));
            response.sendRedirect("admin/dictionary.jsp");
        }else if(request.getParameter("createWord")!=null){
            Dictionary dic = new Dictionary();
            dic.setWord(request.getParameter("word"));
            dic.setAbout(request.getParameter("about"));
            dao.insertDictionary(dic);
            response.sendRedirect("admin/dictionary.jsp");
        }else if(request.getParameter("createTips")!=null){
            Tips tips = new Tips();
            tips.setFrom(request.getParameter("from"));
            tips.setTips(request.getParameter("tips"));
            dao.insertTips(tips);
            response.sendRedirect("admin/tips.jsp");
        }else if(request.getParameter("deleteTips")!=null){
            dao.deleteTips(request.getParameter("deleteTips"));
            response.sendRedirect("admin/tips.jsp");
        }else{
            response.sendRedirect("admin/users.jsp");
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
