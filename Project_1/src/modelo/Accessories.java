/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author brand
 */
public class Accessories extends Product_type{
    private String easeOfInstallation;
    private String durability;
    private Integer maxWeightCapacity; 
    private String specificUse;
    private boolean customizable;

    public Accessories() {
    }

    public Accessories(Integer code_type, String name_type, Integer article_code, String article_name, String product_brand, Integer amount, Integer price_article) {
        super(code_type, name_type, article_code, article_name, product_brand, amount, price_article);
    }

    public String getEaseOfInstallation() {
        return easeOfInstallation;
    }

    public void setEaseOfInstallation(String easeOfInstallation) {
        this.easeOfInstallation = easeOfInstallation;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }

    public Integer getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    public void setMaxWeightCapacity(Integer maxWeightCapacity) {
        this.maxWeightCapacity = maxWeightCapacity;
    }

    public String getSpecificUse() {
        return specificUse;
    }

    public void setSpecificUse(String specificUse) {
        this.specificUse = specificUse;
    }

    public boolean isCustomizable() {
        return customizable;
    }

    public void setCustomizable(boolean customizable) {
        this.customizable = customizable;
    }
    
    
}
