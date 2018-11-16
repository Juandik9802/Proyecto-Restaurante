/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import static codigo.archivoPedido.pedidos;
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
public class archivoCocina {
    public static void añadirArray(int numMesas, String plato, String bebida, String Postre, String añadirPorcion, String quitarPotcion, int precio, String fecha, boolean entregado,boolean estado){
        pedidos.add(new pedido(numMesas,plato,bebida,Postre,añadirPorcion,quitarPotcion,precio,fecha,entregado,estado));
    }
    
    public static void iniciarArray(){
        File archivo;  //apuntar al archivo almancenado DD
        FileReader contenido = null ;  //acceder a todo el contenido del archivo
        BufferedReader linea ; //accede linea a linea al contenido
        try {
            int numeroMesa,precio;
            String nombre,bebida,postre,añadir,quitar,hora;
            boolean entrega,estado;
            archivo = new File("src/ficheros/cocina.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            String cadena; 
            while((cadena=linea.readLine()) != null){
                String dato[] = cadena.split(";");
                numeroMesa=Integer.parseInt(dato[0]);
                nombre=dato[1];
                bebida=dato[2];
                postre=dato[3];
                añadir=dato[4];
                quitar=dato[5];
                precio=Integer.parseInt(dato[6]);
                hora=dato[7]+";"+dato[8];
                entrega=Boolean.parseBoolean(dato[9]);
                estado=Boolean.parseBoolean(dato[10]);
                añadirArray(numeroMesa, nombre, bebida, postre, añadir, quitar, precio, hora, entrega,estado);
            }   
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer archivo: "+e.getMessage());
        }
    }
    
    
    
    //public static ArrayList<pedido> lista =new ArrayList();
    
    public static ArrayList<pedido> pedidos=new ArrayList();
    private static File borrarCocina=new File("src/ficheros/cocina.txt");
      
    public static void borrar (File Ffichero){
        try{
           // Comprovamos si el fichero existe  de ser así procedemos a borrar el archivo
            if(Ffichero.exists()){
                Ffichero.delete();
                System.out.println("hola");
            }
        }catch(Exception e){
            System.out.println("no se borro el archivo");
        }
    }
      
      public static void moficar(){
          borrar(borrarCocina);
          crear();
      }

    private static FileWriter archivo_pedidos=null;      
    private static PrintWriter linea=null;
    
    private static void crear() {
        String pedido;
        try {
            archivo_pedidos= new FileWriter("src/ficheros/cocina.txt",true);
            linea=new PrintWriter(archivo_pedidos);
            for (pedido pedido1 : pedidos) {
                pedido=pedido1.getNumMesas()+";"+pedido1.getPlato()+";"+pedido1.getBebida()+";"+pedido1.getPostre()+";"+pedido1.getAñadirPorcion()+";"+pedido1.getQuitarPotcion()+";"+pedido1.getPrecio()+";"+pedido1.getFecha()+";"+pedido1.isEntregado()+";"+pedido1.isEstado()+";";
                System.out.println(pedido);
                linea.println(pedido);
            }
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
}
