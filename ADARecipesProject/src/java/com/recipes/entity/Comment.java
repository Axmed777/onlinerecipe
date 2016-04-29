/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recipes.entity;

/**
 *
 * @author user
 */
public class Comment {
    private int id;
    private String comments;
    private int user_id;
    private int recipe_id;
    private String inser_date;
    private int visible;

    public Comment() {
    }

    public Comment(int id, String comments, int user_id, int recipe_id, String inser_date, int visible) {
        this.id = id;
        this.comments = comments;
        this.user_id = user_id;
        this.recipe_id = recipe_id;
        this.inser_date = inser_date;
        this.visible = visible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
    }

    
    public String getInser_date() {
        return inser_date;
    }

    public void setInser_date(String inser_date) {
        this.inser_date = inser_date;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }
    
}
