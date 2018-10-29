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
public class archivoMenus {
    public static ArrayList<menusCarga> mostrarPlato= new ArrayList();;

    public archivoMenus() {
    }
    
    /**
     * crea el archivo
     * @param p 
     */
    public static void crear(ArrayList<menusCarga> p){
        String cadena = null; //tipo;nombre;precio;porcion
        FileWriter fichero = null;  //objeto principal (archivo)
        PrintWriter linea = null;   //objeto de contenido de archivo
        try{
            fichero = new FileWriter("src/ficheros/Menu.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //apunta el PrintWriter al archivo creado
            // Inicia            
            for (menusCarga carga : p) {
                cadena = carga.getDia()+";"+carga.getAlmuerzos()+";"+carga.getCenas()+";"+carga.getBebidas()+";"+carga.getPostres()+";";
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
        File archivo = null;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido        
        try{
            archivo = new File("src/ficheros/Menu.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            
            String cadena=""; //variable captura los datos del archivo
            while((cadena=linea.readLine()) != null){ //recorre todo el archivo
                String dato[] = cadena.split(";");
               // mostrarPlato.add(new cargarCombos(dato[0],dato[1]));

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
                JOptionPane.showMessageDialog(null,"Error cerrando archivo");
            }
        }
        //return mostrarPlato;
    }
    
    static void buscar(String filtro, int index){
        File archivo = null;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
        
        try{
            archivo = new File("d:/ejemplo.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            
            String cadena=""; //variable captura los datos del archivo
            while((cadena=linea.readLine()) != null){ //recorre todo el archivo
                String dato[] = cadena.split(";");
                if(dato[index].equals(filtro)){
                    System.out.print("Nombre: "+ dato[0]);
                    System.out.println(" Apellido: "+ dato[1]);  
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
    }
    
    public static void añadirMenu(String Dia,ArrayList<String> Almuerzo,ArrayList<String> cena,ArrayList<String> bebida, ArrayList<String> postre){
        mostrarPlato.add(new menusCarga(Dia));
        int cont=mostrarPlato.size()-1;
        for (String string : postre) {
            mostrarPlato.get(cont).postres.add(string);
        }
        
        for (String string :bebida) {
            mostrarPlato.get(cont).bebidas.add(string);            
        }
        for (String string :cena) {
            mostrarPlato.get(cont).cenas.add(string);            
        }
        for (String string :Almuerzo) {
            mostrarPlato.get(cont).almuerzos.add(string);
        }
    }

    public static ArrayList<menusCarga> getMostrarPlato() {
        return mostrarPlato;
    }
    
}
