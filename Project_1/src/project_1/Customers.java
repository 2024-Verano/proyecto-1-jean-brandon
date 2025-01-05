/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_1;

/**
 *
 * @author brand
 */
public class Customers {
    private Integer costumer_code;
    private String costumer_name;
    private String last_namec;
    private Integer phone_number; 
    private String costumer_email;
    private String costumer_province;
    private String costumer_canton;
    private String costumer_distict;
    private Integer birth_date;

    public Customers(Integer costumer_code, String costumer_name, String last_namec, Integer phone_number, String costumer_email, String costumer_province, String costumer_canton, String costumer_distict, Integer birth_date) {
        this.costumer_code = costumer_code;
        this.costumer_name = costumer_name;
        this.last_namec = last_namec;
        this.phone_number = phone_number;
        this.costumer_email = costumer_email;
        this.costumer_province = costumer_province;
        this.costumer_canton = costumer_canton;
        this.costumer_distict = costumer_distict;
        this.birth_date = birth_date;
    }

    public Customers() {
    }

    public void setCostumer_code(Integer costumer_code) {
        this.costumer_code = costumer_code;
    }

    public void setCostumer_name(String costumer_name) {
        this.costumer_name = costumer_name;
    }

    public void setLast_namec(String last_namec) {
        this.last_namec = last_namec;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public void setCostumer_email(String costumer_email) {
        this.costumer_email = costumer_email;
    }

    public void setCostumer_province(String costumer_province) {
        this.costumer_province = costumer_province;
    }

    public void setCostumer_canton(String costumer_canton) {
        this.costumer_canton = costumer_canton;
    }

    public void setCostumer_distict(String costumer_distict) {
        this.costumer_distict = costumer_distict;
    }

    public void setBirth_date(Integer birth_date) {
        this.birth_date = birth_date;
    }
    
    
    @Override
    public String toString() {
        return "Customers{" + "costumer_code=" + costumer_code + ", costumer_name=" + costumer_name + ", last_namec=" + last_namec + ", phone_number=" + phone_number + ", costumer_email=" + costumer_email + ", costumer_province=" + costumer_province + ", costumer_canton=" + costumer_canton + ", costumer_distict=" + costumer_distict + ", birth_date=" + birth_date + '}';
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
