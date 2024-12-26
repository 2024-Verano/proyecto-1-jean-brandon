/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_1;

import java.util.ArrayList;

/**
 *
 * @author brand
 */
public class Billing {
    private int Invoice_Number; 
    private int Customer_Number;
    private int Receipt_Date; //cambiar luego
    private boolean Status; 
    private ArrayList List_Article;
    private int Subtotal;
    private int Item_Quantity;
    private int Tax;
    private int Total;

    public Billing() {
    }

    public int getInvoice_Number() {
        return Invoice_Number;
    }

    public void setInvoice_Number(int Invoice_Number) {
        this.Invoice_Number = Invoice_Number;
    }

    public int getCustomer_Number() {
        return Customer_Number;
    }

    public void setCustomer_Number(int Customer_Number) {
        this.Customer_Number = Customer_Number;
    }

    public int getReceipt_Date() {
        return Receipt_Date;
    }

    public void setReceipt_Date(int Receipt_Date) {
        this.Receipt_Date = Receipt_Date;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public ArrayList getList_Article() {
        return List_Article;
    }

    public void setList_Article(ArrayList List_Article) {
        this.List_Article = List_Article;
    }

    public int getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(int Subtotal) {
        this.Subtotal = Subtotal;
    }

    public int getItem_Quantity() {
        return Item_Quantity;
    }

    public void setItem_Quantity(int Item_Quantity) {
        this.Item_Quantity = Item_Quantity;
    }

    public int getTax() {
        return Tax;
    }

    public void setTax(int Tax) {
        this.Tax = Tax;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    
}
