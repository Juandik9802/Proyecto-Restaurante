/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Diego
 */
 //public static platos = new File("src/Archivos_Planos/platos.txt");
    //SE CREA EL ARRAYLISY
   // public static Arraylist nombre_de_Arraylist = new Arraylist<>();
public class archivoPlatos {
    
    public static void crear(ArrayList<platillo> p){
        String cadena = null; //tipo;nombre;precio;porcion
        FileWriter fichero = null;  //objeto principal (archivo)
        PrintWriter linea = null;   //objeto de contenido de archivo
        /*
          try {
            //SE CREA UN OBJETO DE TIPO BUFFEREDWRITER PARA PODER ESCRIBIR DENTRO DEL ARCHIVO
 
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombre_de_objeto_fichero));
 
            //DEPENDIENDO DEL TIPO DE OBJETOS QUE ESTE GUARDANDO DENTRO DEL ARRAYLIST, RECORRES EL 
            //ARRAY Y SEPARAS CADA ATRIBUTO POR TABULACION O COMO QUIERAS.
            //Y AL FINAL DE CADA LINEA HACES UN SALTO.
              for (platillo object : p) {
               
                bw.write(p.get(0).getNombre() + "\t" + p.get(0).getPrecio() + "\t" + p.get(0).getTipo() +"\r\n");   
              }
            
            bw.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }*/

        try{
            fichero = new FileWriter("src/ficheros/platos.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //apunta el PrintWriter al archivo creado
            // Inicia captura de datos del usuario           
            for (platillo object : p) {
                cadena = object.getTipo()+";"+object.getNombre()+";"+object.getPrecio()+";"+object.getPorcion()+";";
            }
            linea.println(cadena); //escribiendo en el archivo
            
      }catch(IOException e){
           System.out.print("Error creando archivo");
        }
        finally{
            try{
                if(fichero != null){
                    fichero.close();
                }
            }catch(IOException e1){
                System.out.print("Error cerrando archivo");
            }
        }
       
    }
     
    static void mostrar(){
        File archivo = null;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
        
        try{
            archivo = new File("C:\\Users\\EDUARDO JIMENEZ\\Documents\\NetBeansProjects\\proyecto\\src\\ficheros\\platos.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            
            String cadena=""; //variable captura los datos del archivo
            while((cadena=linea.readLine()) != null){ //recorre todo el archivo
                String dato[] = cadena.split(";");
                System.out.print("Nombre: "+ dato[0]);
                System.out.println(" Apellido: "+ dato[1]);  

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
   /*
    public static void main(String[] args) {
        crear();
        crear();
        crear();
        mostrar();
        System.out.println("================");
        buscar("juan",0);
        System.out.println("================");
        buscar("perez",1);
    }
*/
}
