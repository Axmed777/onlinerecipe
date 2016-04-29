/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recipes.dao;

import com.mysql.jdbc.Driver;
import com.recipes.entity.Comment;
import com.recipes.entity.Dictionary;
import com.recipes.entity.Likes;
import com.recipes.entity.Orders;
import com.recipes.entity.Recipe;
import com.recipes.entity.Tips;
import com.recipes.entity.UserComment;
import com.recipes.entity.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DAO {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void connected() {
        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipes?useEncoding=true&characterEncoding=UTF-8", "root", "root");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void close() {
        try {
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

 

  

   

    public Recipe findRecipe(int id) { ///her hanis reseptin uzerine vuranda id  gore axtarir conntellerre gonderir
        try {
            connected();
            String sql = "Select * from recipes where id=" + id + " and visible=1 ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                Recipe pp = new Recipe();
                pp.setId(rs.getInt("id"));
                pp.setTitle(rs.getString("title"));
                pp.setArticle(rs.getString("article"));
                pp.setImage(rs.getString("image"));
                pp.setPrepared_rules(rs.getString("prepared_rules"));
                pp.setComposition(rs.getString("composition"));
                pp.setInsert_date(rs.getString("insert_date"));
                pp.setUser_id(rs.getInt("user_id"));
                pp.setVisible(rs.getInt("visible"));
                pp.setCategory(rs.getString("category"));
                pp.setCook_time(rs.getString("cook_time"));
                pp.setPrep_time(rs.getString("prep_time"));
                pp.setTotal_time(rs.getString("total_time"));
                return pp;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        } finally {
            close();
        }
    }

   

    public List<Recipe> recipeList() { /// admin panelde reseptlerin siyahisi
        try {
            connected();
            List<Recipe> list = new ArrayList<Recipe>();
            String sql = "Select * from recipes where visible=1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Recipe pp = new Recipe();
                pp.setId(rs.getInt("id"));
                pp.setTitle(rs.getString("title"));
                pp.setArticle(rs.getString("article"));
                pp.setImage(rs.getString("image"));
                pp.setPrepared_rules(rs.getString("prepared_rules"));
                pp.setComposition(rs.getString("composition"));
                pp.setInsert_date(rs.getString("insert_date"));
                pp.setUser_id(rs.getInt("user_id"));
                pp.setVisible(rs.getInt("visible"));
                pp.setCategory(rs.getString("category"));
                list.add(pp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        } finally {
            close();
        }
    }
    
    public List<Recipe> waitingRecipeList() {   /// vsibilt 0 olarn tesdilenmmemis resepler 
        try {
            connected();
            List<Recipe> list = new ArrayList<Recipe>();
            String sql = "Select * from recipes where visible=0";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Recipe pp = new Recipe();
                pp.setId(rs.getInt("id"));
                pp.setTitle(rs.getString("title"));
                pp.setArticle(rs.getString("article"));
                pp.setImage(rs.getString("image"));
                pp.setPrepared_rules(rs.getString("prepared_rules"));
                pp.setComposition(rs.getString("composition"));
                pp.setInsert_date(rs.getString("insert_date"));
                pp.setUser_id(rs.getInt("user_id"));
                pp.setVisible(rs.getInt("visible"));
                pp.setCategory(rs.getString("category"));
                list.add(pp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        } finally {
            close();
        }
    }
    
  
   
    public List<Recipe> searchProduct(String name, String category, String cook_time, String composition) { //
        try {
            connected();
            List<Recipe> list = new ArrayList<Recipe>();
            String sql = "";
            if(name.isEmpty() && category.isEmpty() && cook_time.isEmpty() && composition.isEmpty()){
                sql = "SELECT * FROM recipes order by id desc";
            }else{
                sql = "Select * from recipes where visible=1 ";
                if(!name.isEmpty())
                    sql += " and title like '%"+name+"%' ";
                if(!category.isEmpty())
                    sql += " and category = '"+category+"' ";
                if(!cook_time.isEmpty())
                    sql += " and cook_time like '%"+cook_time+"%' ";
                if(!composition.isEmpty())
                    sql += " and composition like '%"+composition+"%' ";
            }
            pst = conn.prepareStatement(sql);
            
            rs = pst.executeQuery();
            while (rs.next()) {
                Recipe pp = new Recipe();
                pp.setId(rs.getInt("id"));
                pp.setTitle(rs.getString("title"));
                pp.setArticle(rs.getString("article"));
                pp.setImage(rs.getString("image"));
                pp.setPrepared_rules(rs.getString("prepared_rules"));
                pp.setComposition(rs.getString("composition"));
                pp.setInsert_date(rs.getString("insert_date"));
                pp.setUser_id(rs.getInt("user_id"));
                pp.setVisible(rs.getInt("visible"));
                pp.setCategory(rs.getString("category"));
                list.add(pp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        } finally {
            close();
        }
    }

   
    public void insertUser(User up) {  /// registertion ve admini user elave etmesi
        try {
            connected();
            String sql = "Insert into users(id,firstname,lastname,email,password,address,gender,visible, admin, image) values (0,'" + up.getFirstname().replace("<", "&#60;").replace(">", "&#62;") + "','" + up.getLastname().replace("<", "&#60;").replace(">", "&#62;") + "','" + up.getEmail().replace("<", "&#60;").replace(">", "&#62;") + "','" + up.getPassword().replace("<", "&#60;").replace(">", "&#62;") + "','" + up.getAddress().replace("<", "&#60;").replace(">", "&#62;") + "','" + up.getGender().replace("<", "&#60;").replace(">", "&#62;") + "',1, "+up.getAdmin()+", '"+up.getImage()+"')";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            close();
        }
    }
    
    public void deleteUser(String id){   //adminin deletei
        connected();
        try {

            String sql = "update users set visible = 0 where id="+id;
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (Exception e) {
            
        } finally {
            close();
        }
    }
    
    public void deleteRecipe(String id){   ///admin dlete recipe
        connected();
        try {

            String sql = "delete from recipes where id="+id;
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (Exception e) {
            
        } finally {
            close();
        }
    }
    
    public void approveRecipe(String id){  //admin approve
        connected();
        try {

            String sql = "update recipes set visible = 1 where id="+id;
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (Exception e) {
            
        } finally {
            close();
        }
    }


    
    public boolean checkLikeWithConnection(int user_id, int recipe_id){   
        try {
            connected();
            String sql = "select id from likes where user_id = "+user_id+" and recipe_id="+recipe_id;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs.next();
                        
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            close();
        }
    }
    
    public boolean checkLike(int user_id, int recipe_id){  // iof user ikeed
        try {
            String sql = "select id from likes where user_id = "+user_id+" and recipe_id="+recipe_id;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs.next();
                        
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean insertLike(Likes lp) { /// if unlkie
        boolean liked = false;
        try {
            connected();
            String sql;
            if(!checkLike(lp.getUser_id(), lp.getRecipe_id())){
                sql = "Insert into likes(recipe_id,user_id) values(" + lp.getRecipe_id() + "," + lp.getUser_id() + ")";
                liked = true;
            } else
                sql = "DELETE FROM likes WHERE recipe_id=" + lp.getRecipe_id() + " and user_id=" + lp.getUser_id() + "";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            return liked;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        } finally {
            close();
        }
    }

    public User checkUser(String username, String password) {  //check user if correct
        try {
            User up = null;
            connected();
            String sql = "Select id, firstname, lastname, image,address, registr_date from users where email='" + username + "' and password='" + password + "' and visible=1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                up = new User();
                up.setId(rs.getInt(1));
                up.setFirstname(rs.getString(2));
                up.setLastname(rs.getString(3));
                up.setImage(rs.getString(4));
                up.setAddress(rs.getString(5));
                up.setRegistr_date(rs.getString(6));

            }
            return up;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        } finally {
            close();
        }
    }
    
    public User checkAdmin(String username, String password) {  ///admin login parol
        try {
            User up = null;
            connected();
            String sql = "Select id, firstname, lastname, image,address, registr_date from users where email='" + username + "' and password='" + password + "' and visible=1 and admin=1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                up = new User();
                up.setId(rs.getInt(1));
                up.setFirstname(rs.getString(2));
                up.setLastname(rs.getString(3));
                up.setImage(rs.getString(4));
                up.setAddress(rs.getString(5));
                up.setRegistr_date(rs.getString(6));

            }
            return up;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        } finally {
            close();
        }
    }

  
    public User findUsersByRecipe(int id) {  //posted by user
        try {
            connected();
            String sql = "SELECT CONCAT(users.firstname, ' ', users.lastname), users.registr_date, users.id, users.email FROM users join recipes where users.id = recipes.user_id and recipes.id=" + id;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                User up = new User();
                up.setFirstname(rs.getString(1));
                up.setRegistr_date(rs.getString(2));
                up.setId(rs.getInt(3));
                up.setEmail(rs.getString(4));
                return up;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return null;
        } finally {
            close();
        }
    }
    
  

    public int likeCount(int pid) {
        try {
            connected();
            String sql = "Select count(id) from likes where recipe_id=" + pid;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        } finally {
            close();
        }
    }


    public void insertRecipe(Recipe p) {
        try {
            connected();
            String sql = "Insert into recipes(id,title,article,image,prepared_rules,composition,user_id,category,visible, prep_time, cook_time, total_time) values(0,'" + p.getTitle().replace("<", "&#60;").replace(">", "&#62;") + "','" + p.getArticle().replace("<", "&#60;").replace(">", "&#62;") + "','" + p.getImage() + "','" + p.getPrepared_rules().replace("<", "&#60;").replace(">", "&#62;") + "','" + p.getComposition().replace("<", "&#60;").replace(">", "&#62;") + "'," + p.getUser_id() + ",'" + p.getCategory().replace("<", "&#60;").replace(">", "&#62;") + "',0,'"+p.getPrep_time()+"','"+p.getCook_time()+"','"+p.getTotal_time()+"')";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            close();
        }
    }


    
    
    public List<UserComment> userComment(int p_id){  
        try {
            connected();
            List<UserComment> list=new ArrayList<UserComment>();
            String sql="SELECT users.firstname, users.lastname,users.image,comments.comment,comments.date_created, comments.id, users.id FROM users JOIN comments WHERE users.id=comments.user_id AND comments.recipe_id="+p_id+"  ORDER BY comments.date_created DESC";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {                
                UserComment up=new  UserComment();
                up.setFirstname(rs.getString(1));
                up.setLastname(rs.getString(2));
                up.setImage(rs.getString(3));
                up.setComment(rs.getString(4));
                up.setInsert_date(rs.getString(5));
                up.setComment_id(rs.getInt(6));
                up.setUser_id(rs.getInt(7));
                list.add(up);
            }return list;
        } catch (Exception e) {
           e.printStackTrace(System.out);
           return null;
        }finally{
        close();
        }
    }
    
    public List<User> users(){  ///adminin user  
        try {
            connected();
            List<User> list=new ArrayList<User>();
            String sql="select * from users where visible = 1";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {                
                User up=new  User();
                up.setId(rs.getInt("id"));
                up.setFirstname(rs.getString("firstname"));
                up.setLastname(rs.getString("lastname"));
                up.setImage(rs.getString("image"));
                up.setGender(rs.getString("gender"));
                up.setAdmin(rs.getInt("admin"));
                up.setEmail(rs.getString("email"));
                up.setRegistr_date(rs.getString("registr_date"));
                
                list.add(up);
            }return list;
        } catch (Exception e) {
           e.printStackTrace(System.out);
           return null;
        }finally{
        close();
        }
    }
    
    public void insertComment(Comment cp){   
        try {
            connected();
            String sql = "Insert into comments(comment, user_id, recipe_id) values('" + cp.getComments().replace("<", "&#60;").replace(">", "&#62;") + "'," + cp.getUser_id() + "," + cp.getRecipe_id() + ")";
            pst=conn.prepareStatement(sql);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }finally{
        close();
        }
    }
    

    
    public List<Dictionary> dictionary(){  
        try {
            connected();
            List<Dictionary> list=new ArrayList();
            String sql="select * from dictionary";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {                
                Dictionary d=new  Dictionary();
                d.setId(rs.getInt("id"));
                d.setWord(rs.getString("word"));
                d.setAbout(rs.getString("about"));
                list.add(d);
            }
            return list;
        } catch (Exception e) {
           e.printStackTrace(System.out);
           return null;
        }finally{
        close();
        }
    }
    
    public void deleteDictionary(String id){
        connected();
        try {

            String sql = "delete from dictionary where id="+id;
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (Exception e) {
            
        } finally {
            close();
        }
    }
    
    public String generateCode() { // wekle ad verirki birden eyni adli imageler upload edende ust uste  yazmasin, tekrarsiz kodlar qaytarir
        try {
            connected();
            String a = "";
            String sql = "SELECT SUBSTRING(MD5(RAND()) FROM 1 FOR 10) AS password";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                a = rs.getString(1);
            }
            return a;
        } catch (Exception e) {
            return null;
        } finally {
            close();
        }
    }

       

    public void insertDictionary(Dictionary dic) {
        try {
            connected();
            String sql = "Insert into dictionary(word,about) values ('" + dic.getWord().replace("<", "&#60;").replace(">", "&#62;") + "','" + dic.getAbout().replace("<", "&#60;").replace(">", "&#62;") + "')";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            close();
        }
    }
    
    public void insertTips(Tips tips) {
        try {
            connected();
            String sql = "Insert into tips(who,tip) values ('" + tips.getFrom().replace("<", "&#60;").replace(">", "&#62;") + "','" + tips.getTips().replace("<", "&#60;").replace(">", "&#62;") + "')";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            close();
        }
    }
    
    public void deleteTips(String id){
        connected();
        try {

            String sql = "delete from tips where id="+id;
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (Exception e) {
            
        } finally {
            close();
        }
    }
    
    public List<Tips> tips(){
        try {
            connected();
            List<Tips> list=new ArrayList();
            String sql="select * from tips";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {                
                Tips d=new  Tips();
                d.setId(rs.getInt("id"));
                d.setFrom(rs.getString("who"));
                d.setTips(rs.getString("tip"));
                list.add(d);
            }
            return list;
        } catch (Exception e) {
           e.printStackTrace(System.out);
           return null;
        }finally{
        close();
        }
    }

    public void insertOrder(Orders o) {
        try {
            connected();
            String sql = "Insert into orders(category, post, address, phone, recipes, user_id, fullname) values ('" + o.getCategory().replace("<", "&#60;").replace(">", "&#62;") + "','" + o.getPost().replace("<", "&#60;").replace(">", "&#62;") + "','" + o.getAddress().replace("<", "&#60;").replace(">", "&#62;") + "','" + o.getPhone().replace("<", "&#60;").replace(">", "&#62;") + "','" + o.getRecipes().replace("<", "&#60;").replace(">", "&#62;") + "','" + o.getUser_id().replace("<", "&#60;").replace(">", "&#62;") + "','" + o.getFullname().replace("<", "&#60;").replace(">", "&#62;") + "')";
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            close();
        }
    }
    
    
    public List<Orders> orders(){
        try {
            connected();
            List<Orders> list=new ArrayList();
            String sql="select * from orders order by id desc";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {                
                Orders o=new  Orders();
                o.setId(rs.getInt("id"));
                o.setAddress(rs.getString("address"));
                o.setCategory(rs.getString("category"));
                o.setFullname(rs.getString("fullname"));
                o.setPhone(rs.getString("phone"));
                o.setPost(rs.getString("post"));
                o.setRecipes(rs.getString("recipes"));
                o.setUser_id(rs.getString("user_id"));
                list.add(o);
            }
            return list;
        } catch (Exception e) {
           e.printStackTrace(System.out);
           return null;
        }finally{
        close();
        }
    }
    
}