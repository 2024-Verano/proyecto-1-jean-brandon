/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author brand
 */
public class Bicycle extends Product_type{
    private Integer size;
    private String usageType; 
    private Integer gears;
    private String gearSystem; 
    private Integer wheelSize; 
    private String ergonomics; 

    public Bicycle() {
    }

    public Bicycle(Integer code_type, String name_type, Integer article_code, String article_name, String product_brand, Integer amount, Integer price_article) {
        super(code_type, name_type, article_code, article_name, product_brand, amount, price_article);
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public Integer getGears() {
        return gears;
    }

    public void setGears(Integer gears) {
        this.gears = gears;
    }

    public String getGearSystem() {
        return gearSystem;
    }

    public void setGearSystem(String gearSystem) {
        this.gearSystem = gearSystem;
    }

    public Integer getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(Integer wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getErgonomics() {
        return ergonomics;
    }

    public void setErgonomics(String ergonomics) {
        this.ergonomics = ergonomics;
    }
    
    
}
