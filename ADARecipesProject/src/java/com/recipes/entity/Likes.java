/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recipes.entity;

/**
 *
 * @author user
 */
public class Likes {
    private int id;
    private int recipe_id;
    private int user_id;
    private String insert_date;

    public Likes() {
    }

    
    public Likes(int id, int recipe_id, int user_id, String insert_date) {
        this.id = id;
        this.recipe_id = recipe_id;
        this.user_id = user_id;
        this.insert_date = insert_date;
    }

    public String getInsert_date() {
        return insert_date;
    }

    public void setInsert_date(String insert_date) {
        this.insert_date = insert_date;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(int product_id) {
        this.recipe_id = product_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
}
