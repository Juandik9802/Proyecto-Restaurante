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
 
public class archivoPlatos {
    public static void llenarplatos(){
    
    
    }
    
    public static ArrayList<cargarCombos> mostrarPlato= new ArrayList();
    
    
    /**
     * crea el archivo
     * @param p 
     */
    public static void crear(ArrayList<platillo> p){
        String cadena = null; //tipo;nombre;precio;porcion
        FileWriter fichero = null;  //objeto principal (archivo)
        PrintWriter linea;   //objeto de contenido de archivo
        try{
            fichero = new FileWriter("src/ficheros/platos.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //apunta el PrintWriter al archivo creado
            // Inicia
            for (platillo object : p) {
                cadena = object.getTipo()+";"+object.getNombre()+";"+object.getPrecio()+";";
                for (String string : object.getPorcion()) {
                    cadena+=string+";";
                }                
            }
            linea.println(cadena); //escribiendo en el archivo
            
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
     
    public static void mostrar(){
        File archivo;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea; //accede linea a linea al contenido        
        try{
            archivo = new File("src/ficheros/platos.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            
            String cadena; //variable captura los datos del archivo
            while((cadena=linea.readLine()) != null){ //recorre todo el archivo
                String dato[] = cadena.split(";");
                mostrarPlato.add(new cargarCombos(dato[0],dato[1]));

            }
         }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error lectutra de datos. Achivo esta vacio");
        }
        finally{
            try{
                if(contenido != null){
                    contenido.close();
                }
            }catch(IOException e1){
                JOptionPane.showMessageDialog(null,"Error cerrando archivo");
            }
        }
        //return mostrarPlato;
    }
    
    public static String buscar(String filtro){
        String retorno = null;
        File archivo;  //apuntar al archivo almancenado DD
        FileReader contenido = null ;  //acceder a todo el contenido del archivo
        BufferedReader linea ; //accede linea a linea al contenido
        try{
            archivo = new File("src/ficheros/platos.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            String cadena; //variable captura los datos del archivo
            while((cadena=linea.readLine()) != null){ //recorre todo el archivo
                String dato[] = cadena.split(";");
                if(dato[1].equals(filtro)){
                    retorno=dato[2];  
                }
    
 }
         }catch(IOException e){
           System.out.print("Error creando archivo");
        }
        finally{
            try{
                if(contenido != null){
                    contenido.close();
                }
            }catch(IOException e1){
                System.out.print("Error cerrando archivo");
            }
        }
    return retorno;
    }
}
