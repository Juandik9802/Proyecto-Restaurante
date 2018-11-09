/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.restaurante;

import java.io.File;

/**
 *
 * @author josep
 */
public class ProyRestaurante {
    
    static  File nuevo=new File("src/ficheros/Menu.txt");
    static  File mesero=new File("src/ficheros/Meseros.txt");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (nuevo.exists()){
            codigo.archivoMenus.llenarArray();
        }
        if(mesero.exists()){
            codigo.listaMeseros.llenarArray();
        }
        Principal obt =new Principal();
        obt.setVisible(true);
        
        
    }
    
}
