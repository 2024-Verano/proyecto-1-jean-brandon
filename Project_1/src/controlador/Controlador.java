/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import modelo.Customers;
import vista.Dashboard;
import vista.Page1;
import vista.Page2;

/**
 *
 * @author brand
 */
public class Controlador implements ActionListener{
    
    private Dashboard view;
    
    private Customers model;
    
    public Controlador(Dashboard view, Customers model){
        this.view = view;
        this.model = model;
        this.view.nextbtn.addActionListener(this);
        
    }
    public void iniciar(){
        view.setLocationRelativeTo(null);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Accion")) {
   
        System.out.println("Acción realizada correctamente.");
        } else {
        System.out.println("Acción no reconocida.");
        
    }
    }
    
}
