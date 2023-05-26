/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoPromedio;

import javax.swing.JFrame;

/**
 *
 * @author Ana Cristina
 */
//SINGLETON
public class Instancia {
    
    private static JFrame jf;
    
    public Instancia() {
    }
    
    public static JFrame getInstance() {
        
        if(jf==null){
            jf= new LstaEstudiantes();
        }
        return jf;
    } 
    
}
