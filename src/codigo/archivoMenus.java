/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

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
    public static ArrayList<menusCarga> mostrarMenu= new ArrayList();
    public static ArrayList<menusCarga> modificar= new ArrayList();
    static  File nuevo=new File("src/ficheros/Menu.txt");
    
    /**
     * crea el archivo
     * @param p 
     */
    public static void crear(ArrayList<menusCarga> p){        
        FileWriter fichero = null;  //objeto principal (archivo)
        PrintWriter linea;   //objeto de contenido de archivo
        try{
            fichero = new FileWriter("src/ficheros/Menu.txt",true); //crea el archivo 
            linea = new PrintWriter(fichero); //apunta el PrintWriter al archivo creado
            // Inicia            
            for (menusCarga carga : p) {
                String cadena; 
                cadena = carga.getDia()+";";
                for (String alm : carga.almuerzos) {
                    cadena+=alm+";";
                }
                for (String alm : carga.cenas) {
                    cadena+=alm+";";
                }
                for (String alm : carga.bebidas) {
                    cadena+=alm+";";
                }                
                for (String alm : carga.postres) {
                    cadena+=alm+";";
                }
                linea.println(cadena);
            }            
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
    
    /**
     * metodo para añadir al array el menu
    */
   public static void añadirMenu(String Dia,ArrayList<String> Almuerzo,ArrayList<String> cena,ArrayList<String> bebida, ArrayList<String> postre){
        mostrarMenu.add(new menusCarga(Dia));
        int cont=mostrarMenu.size()-1;
        for (String string : postre) {
            mostrarMenu.get(cont).postres.add(string);
        }        
        for (String string :bebida) {
            mostrarMenu.get(cont).bebidas.add(string);            
        }
        for (String string :cena) {
            mostrarMenu.get(cont).cenas.add(string);            
        }
        for (String string :Almuerzo) {
            mostrarMenu.get(cont).almuerzos.add(string);
        }
    }
   
   /**
    * Añade al array que va a modificar el repectivo el menu
    * @param Dia
    * @param Almuerzo
    * @param cena
    * @param bebida
    * @param postre 
    */
   public static void añadirModificacion(String Dia,ArrayList<String> Almuerzo,ArrayList<String> cena,ArrayList<String> bebida, ArrayList<String> postre){
        modificar.add(new menusCarga(Dia));
        int cont=modificar.size()-1;
        for (String string : postre) {
            modificar.get(cont).postres.add(string);
        }
        for (String string :bebida) {
            modificar.get(cont).bebidas.add(string);            
        }
        for (String string :cena) {
            modificar.get(cont).cenas.add(string);            
        }
        for (String string :Almuerzo) {
            modificar.get(cont).almuerzos.add(string);
        }
        crearModificacion();
    }
     
   public static void crearModificacion(){
       Modificacion();
       archivoCrear();
   }
   
    public static void Modificacion() {
        if (mostrarMenu.isEmpty()|| modificar.isEmpty()){
            JOptionPane.showMessageDialog(null, "Elemeto se encuentra vacio");
        }else{
           for (menusCarga carga : modificar) {
                for (menusCarga modifica : mostrarMenu) {
                    if (carga.Dia.equals(modifica.getDia())){
                        modifica.setAlmuerzos(carga.almuerzos);
                        modifica.setBebidas(carga.bebidas);
                        modifica.setCenas(carga.cenas);
                        modifica.setPostres(carga.postres);
                    }
                }
            }  
        }
    }
    
    public static  void archivoCrear(){
        borrar(nuevo);
        crear(mostrarMenu);
    }
    
    public static void borrar (File Ffichero){
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
    
    public static String leerArchivo(){
    String cadena = null;
    FileReader entrada;
    try {
        entrada = new FileReader("src/ficheros/Menu.txt");
        int c;
        while((c = entrada.read()) != -1){
            cadena += (char)c;
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al leer archivo: "+e.getMessage());
    }
    return cadena;
}

    public static ArrayList<menusCarga> getMostrarPlato() {
        return mostrarMenu;
    }
    
}
