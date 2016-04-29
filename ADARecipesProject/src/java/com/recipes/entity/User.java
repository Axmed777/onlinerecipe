package com.recipes.entity;

public class User {
   private int id;
   private String firstname;
   private String lastname;
   private String image;
   private String email;
   private String password;
   private String address;
   private String registr_date;
   private String gender;
   private int visible;
   private int admin;

    public User() {
    }

    public User(int id, String firstname, String lastname, String image, String email, String password, String address, String registr_date, String gender, int visible, int admin) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.image = image;
        this.email = email;
        this.password = password;
        this.address = address;
        this.registr_date = registr_date;
        this.gender = gender;
        this.visible = visible;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistr_date() {
        return registr_date;
    }

    public void setRegistr_date(String registr_date) {
        this.registr_date = registr_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
   
    

}