/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author brand
 */
public class Product_type {
    private Integer code_type;
    private String name_type;
    private Integer article_code;
    private String article_name;
    private String product_brand;
    private Integer amount;
    private Integer price_article;

    public Product_type(Integer code_type, String name_type, Integer article_code, String article_name, String product_brand, Integer amount, Integer price_article) {
        this.code_type = code_type;
        this.name_type = name_type;
        this.article_code = article_code;
        this.article_name = article_name;
        this.product_brand = product_brand;
        this.amount = amount;
        this.price_article = price_article;
    }

    public Product_type() {
    }

    public Integer getCode_type() {
        return code_type;
    }

    public void setCode_type(Integer code_type) {
        this.code_type = code_type;
    }

    public String getName_type() {
        return name_type;
    }

    public void setName_type(String name_type) {
        this.name_type = name_type;
    }

    public Integer getArticle_code() {
        return article_code;
    }

    public void setArticle_code(Integer article_code) {
        this.article_code = article_code;
    }

    public String getArticle_name() {
        return article_name;
    }

    public void setArticle_name(String article_name) {
        this.article_name = article_name;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrice_article() {
        return price_article;
    }

    public void setPrice_article(Integer price_article) {
        this.price_article = price_article;
    }
     
    
    public void serch(){
    
    }
    public void add(){
        
    }
    public void alter(){
        
    }
    public void remove(){
        
    }
            
}
