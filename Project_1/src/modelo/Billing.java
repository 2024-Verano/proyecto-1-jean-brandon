/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author brand
 */
public class Billing {
    private int invoice_number; 
    private int customer_number;
    private int receipt_date; //cambiar luego
    private boolean status; 
    private ArrayList list_article;
    private int subtotal;
    private int item_quantity;
    private int tax;
    private int total;

    public Billing() {
    }

    public int getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(int invoice_number) {
        this.invoice_number = invoice_number;
    }

    public int getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(int customer_number) {
        this.customer_number = customer_number;
    }

    public int getReceipt_date() {
        return receipt_date;
    }

    public void setReceipt_date(int receipt_date) {
        this.receipt_date = receipt_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList getList_article() {
        return list_article;
    }

    public void setList_article(ArrayList list_article) {
        this.list_article = list_article;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

 
}
