/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recipes.controller;

import com.recipes.dao.DAO;
import com.recipes.entity.Recipe;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * 
 */
@WebServlet(name = "Recipes", urlPatterns = {"/Recipes"})
public class Recipes extends HttpServlet {

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
        DAO dao = new DAO();
        HttpSession session = request.getSession(true);
        if(request.getParameter("add")!=null){
            response.sendRedirect("addRecipe.jsp");
        }else if(request.getParameter("insert")!=null){
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            try {
                List<FileItem> fields = upload.parseRequest(request);

                Iterator<FileItem> it = fields.iterator();
                if (!it.hasNext()) {
                    // fayl yoxdur mesaj
                    return;
                }


            String title = "";//String deyiwenleri gotururuy
            String article = "";
            String category = "";
            String prepareRules = "";
            String image = "";
            List<String> composition = new ArrayList<>();
            String cook_time = "";
            String total_time = "";
            String prep_time = "";

            while (it.hasNext()) { // eger file varsa
                FileItem fileItem = it.next(); // iteratorun next metodu cagrilir
                boolean isFormField = fileItem.isFormField(); // isformField-input yoxlanilirki 
                if (isFormField) { // eger isFormFIelddise
                    switch (fileItem.getFieldName()) {
                        case "title":
                            title = fileItem.getString("UTF-8").trim();
                            break;
                        case "category":
                            category = fileItem.getString("UTF-8").trim();
                            break;
                        case "article":
                            article = fileItem.getString("UTF-8").trim();
                            break;
                        case "prepareRules":
                            prepareRules = fileItem.getString("UTF-8").trim();
                            break;
                        case "image":
                            image = fileItem.getString("UTF-8").trim();
                            break;
                        case "tags":
                            composition.add(fileItem.getString("UTF-8").trim());
                            break;
                        case "prep_time":
                            prep_time = fileItem.getString("UTF-8").trim();
                            break;
                        case "cook_time":
                            cook_time = fileItem.getString("UTF-8").trim();
                            break;
                        case "total_time":
                            total_time = fileItem.getString("UTF-8").trim();
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
            
            Recipe recipe = new Recipe();
            recipe.setArticle(article);
            recipe.setCategory(category);
            String comps="";
            for(String c : composition)
                comps+= c +",";
            if(comps.contains(","))
                comps = comps.substring(0, comps.length()-1);
            recipe.setComposition(comps);
            if(image.isEmpty()){
                image = "defaultrecipe.jpg";
            }
            recipe.setImage(image);
            recipe.setLike_count(0);
            recipe.setPrepared_rules(prepareRules);
            recipe.setTitle(title);
            recipe.setUser_id(Integer.parseInt(session.getAttribute("user_id").toString()));
            recipe.setVisible(1);
            recipe.setPrep_time(prep_time);
            recipe.setCook_time(cook_time);
            recipe.setTotal_time(total_time);
            dao.insertRecipe(recipe);
            response.sendRedirect("addRecipe.jsp?success=");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
           
        }else if(request.getParameter("id")!=null){
            response.sendRedirect("recipeDetails.jsp?id="+request.getParameter("id"));
        }
        
        
        
        else{
            response.sendRedirect("index.jsp");
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
