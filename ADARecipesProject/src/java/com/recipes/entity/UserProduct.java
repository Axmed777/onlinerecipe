/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recipes.entity;

/**
 *
 * @author user
 */
public class UserProduct {
    private int product_id;
    private int user_id;

    public UserProduct() {
    }

    public UserProduct(int product_id, int user_id) {
        this.product_id = product_id;
        this.user_id = user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
}
