/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author brand
 */
public class Food_supplements extends Product_type {
    private String mainBenefit;
    private String format; 
    private String dietaryRestrictions; 
    private Integer shelfLife; 
    private String certifications;

    public Food_supplements(Integer code_type, String name_type, Integer article_code, String article_name, String product_brand, Integer amount, Integer price_article) {
        super(code_type, name_type, article_code, article_name, product_brand, amount, price_article);
    }
    
    
    public Food_supplements() {
    }

    public String getMainBenefit() {
        return mainBenefit;
    }

    public void setMainBenefit(String mainBenefit) {
        this.mainBenefit = mainBenefit;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(String dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public Integer getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Integer shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }
     
}
