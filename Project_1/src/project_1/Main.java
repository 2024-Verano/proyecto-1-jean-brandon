/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_1;

import controlador.Controlador;
import modelo.Customers;
import vista.Dashboard;

        

/**
 *
 * @author brand
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customers mod = new Customers();
        Dashboard view = new Dashboard();
        Controlador ctr = new Controlador(view,mod);
        ctr.iniciar();
        view.setVisible(true);
        
               
        
        
        
        //Dashboard screen = new Dashboard();
        //screen.setVisible(true);
        //screen.setLocationRelativeTo(null);
    }
    
}
