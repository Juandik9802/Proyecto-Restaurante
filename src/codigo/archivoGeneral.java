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
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Diego
 */
public class archivoGeneral {
    private static File file = new File("src/ficheros/mesas.txt");
    private static FileWriter archivo_pedidos=null;
    private static PrintWriter linea=null;
    public static int numeroMesas;
    
    public static void crear(int mesas){
        try {
            archivo_pedidos= new FileWriter("src/ficheros/mesas.txt",true);
            linea=new PrintWriter(archivo_pedidos);            
            linea.println(mesas+";");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error creando el archivo");
        } finally{
            try{
                if(archivo_pedidos != null){
                    archivo_pedidos.close();
                }
            }catch(IOException e1){
                    JOptionPane.showMessageDialog(null, "Error cerrando el archivo");
            }
        }
    }
    
    public static  void archivoCrear(int mesas){
        borrar(file);
        crear(mesas);
        archivoGeneral.numeroMesas=mesas;
    }
    
    private  static void borrar (File Ffichero){
        try
        {
           // Comprovamos si el fichero existe  de ser así procedemos a borrar el archivo
            if(Ffichero.exists())
            {
                Ffichero.delete();
            }

        }catch(Exception e){
        }
    }
    /**
     * busca la cantidad de mesas
     * @return 
     */
    public static int buscar(){
        int retorno = 10;
        File archivo;  //apuntar al archivo almancenado DD
        FileReader contenido = null ;  //acceder a todo el contenido del archivo
        BufferedReader linea ; //accede linea a linea al contenido
        try{
            archivo = new File("src/ficheros/mesas.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            String cadena; //variable captura los datos del archivo
            while((cadena=linea.readLine()) != null){ //recorre todo el archivo
                String dato[] = cadena.split(";");
                retorno=Integer.parseInt(dato[0]);
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
