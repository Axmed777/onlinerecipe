package com.recipes.entity;

public class Recipe {
    private int id;
    private String title;
    private String article;
    private String image;
    private String prepared_rules;
    private String composition;
    private String insert_date;
    private int user_id;
    private int visible;
    private String category;
    private int like_count;
    private String prep_time;
    private String cook_time;
    private String total_time;

    public Recipe() {
    }

    public Recipe(int id, String title, String article, String image, String prepared_rules, String composition, String insert_date, int user_id, int visible, String category, int like_count, String prep_time, String cook_time, String total_time) {
        this.id = id;
        this.title = title;
        this.article = article;
        this.image = image;
        this.prepared_rules = prepared_rules;
        this.composition = composition;
        this.insert_date = insert_date;
        this.user_id = user_id;
        this.visible = visible;
        this.category = category;
        this.like_count = like_count;
        this.prep_time = prep_time;
        this.cook_time = cook_time;
        this.total_time = total_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrepared_rules() {
        return prepared_rules;
    }

    public void setPrepared_rules(String prepared_rules) {
        this.prepared_rules = prepared_rules;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getInsert_date() {
        return insert_date;
    }

    public void setInsert_date(String insert_date) {
        this.insert_date = insert_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public String getPrep_time() {
        return prep_time;
    }

    public void setPrep_time(String prep_time) {
        this.prep_time = prep_time;
    }

    public String getCook_time() {
        return cook_time;
    }

    public void setCook_time(String cook_time) {
        this.cook_time = cook_time;
    }

    public String getTotal_time() {
        return total_time;
    }

    public void setTotal_time(String total_time) {
        this.total_time = total_time;
    }

    
}