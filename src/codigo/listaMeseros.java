/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Diego
 */
public class listaMeseros {
    public static ArrayList<datosMesero> meseros = new ArrayList();
    
    public static void añadirMesero(String nombre,String apellido,int codigo){
        meseros.add(new datosMesero(nombre,apellido,codigo));        
    }
    
    public  static void crear(){        
        FileWriter fichero = null;  //objeto principal (archivo)
        PrintWriter linea;   //objeto de contenido de archivo
        try{
            fichero = new FileWriter("src/ficheros/Meseros.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //apunta el PrintWriter al archivo creado
            // Inicia           
                String cadena=meseros.get(meseros.size()-1).getCodigo()+";"+meseros.get(meseros.size()-1).getNombre()+";"+meseros.get(meseros.size()-1).getApellido()+";";
                linea.println(cadena);                        
             //escribiendo en el archivo            
      }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error creando archivo");
        }
        finally{
            try{
                if(fichero != null){
                    fichero.close();
                }
            }catch(IOException e1){
                JOptionPane.showMessageDialog(null,"Error cerrando archivo");
            }
        }       
    }
    
    public static void llenarArray(){    
        File archivo;  //apuntar al archivo almancenado DD
        FileReader contenido = null ;  //acceder a todo el contenido del archivo
        BufferedReader linea ; //accede linea a linea al contenido
        try { 
            String nombre,apellido;
            int codigo;
            archivo = new File("src/ficheros/Meseros.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            String cadena; 
            while((cadena=linea.readLine()) != null){
                String dato[] = cadena.split(";");
                codigo=Integer.parseInt(dato[0]);
                nombre=dato[1];
                apellido=dato[2];                
                añadirMesero(nombre,apellido,codigo);
            } 
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer archivo: "+e.getMessage());
        }catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Error al leer archivo: "+e.getMessage());
        }
    }
    
    public static boolean isCodigo(int codigo){
        boolean existe=false;
        for (datosMesero mesero : meseros) {
           if (mesero.getCodigo()==codigo){
               existe=true;
           } 
        }
        return existe;
    }
    
    
    
}

