/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Piramide {
    public static boolean serie(int numero){
        
        boolean resp= true;
        for (int i = 2; i < numero; i++) {
            if (numero % i==0) {
                resp=false;
               
            }
             //System.out.println("es primo");
        }
    
    return resp;
    }
    public static void rangoPrimos(){
        int rg=Integer.parseInt(JOptionPane.showInputDialog("ingrese el rango"));
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 2; i < rg; i++) {
            if (serie(i)== true) {
                array.add(i);
                
            }
            
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(array.toArray()));
        
    }
    public static void triangulo(){
      
        int rg=Integer.parseInt(JOptionPane.showInputDialog("ingrese el rango"));
        ArrayList<Integer> array = new ArrayList<>();
        int d=0;
        for (int i = 2; i < rg; i++) {
            if (serie(i)== true) {
               // array.add(i);
               
                for (int j = 0; j < i; j++) {
                   array.add(i);
                    d=i+0;
                    System.out.print("   "+d);
                    
                }
                System.out.println(""); 
                
            }
            
            
        }
       // JOptionPane.showMessageDialog(null, Arrays.toString(array.toArray()));
        
    
    
    }
}
