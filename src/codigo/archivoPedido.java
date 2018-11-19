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
public class archivoPedido {

    private static FileWriter archivo_pedidos = null;
    private static PrintWriter linea = null;
    public static ArrayList<pedido> pedidos = new ArrayList();
    private static File file = new File("src/ficheros/pedidos.txt");

    /**
     * crea los archivos de pedido y de cocina
     */
    public static void crear() {
        String pedido;
        int cont = pedidos.size() - 1;

        try {
            archivo_pedidos = new FileWriter("src/ficheros/pedidos.txt", true);
            linea = new PrintWriter(archivo_pedidos);
            pedido = pedidos.get(cont).getNumMesas() + ";" + pedidos.get(cont).getPlato() + ";" + pedidos.get(cont).getBebida() + ";" + pedidos.get(cont).getPostre() + ";" + pedidos.get(cont).getAñadirPorcion() + ";" + pedidos.get(cont).getQuitarPotcion() + ";" + pedidos.get(cont).getPrecio() + ";" + pedidos.get(cont).getFecha() + ";" + pedidos.get(cont).getNombreMesero() + ";" + pedidos.get(cont).isEstado() + ";";
            linea.println(pedido);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error creando el archivo");
        } finally {
            try {
                if (archivo_pedidos != null) {
                    archivo_pedidos.close();
                }
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(null, "Error cerrando el archivo");
            }
        }
        // crea 
        try {
            archivo_pedidos = new FileWriter("src/ficheros/cocina.txt", true);
            linea = new PrintWriter(archivo_pedidos);
            pedido = pedidos.get(cont).getNumMesas() + ";" + pedidos.get(cont).getPlato() + ";" + pedidos.get(cont).getBebida() + ";" + pedidos.get(cont).getPostre() + ";" + pedidos.get(cont).getAñadirPorcion() + ";" + pedidos.get(cont).getQuitarPotcion() + ";" + pedidos.get(cont).getPrecio() + ";" + pedidos.get(cont).getFecha() + ";" + pedidos.get(cont).getNombreMesero() + ";" + pedidos.get(cont).isEstado() + ";";
            linea.println(pedido);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error creando el archivo");
        } finally {
            try {
                if (archivo_pedidos != null) {
                    archivo_pedidos.close();
                }
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(null, "Error cerrando el archivo");
            }
        }
    }

    /**
     * hace las modificaciones en el archivo
     */
    public static void crearModificacion() {
        String pedido;
        try {
            archivo_pedidos = new FileWriter("src/ficheros/pedidos.txt", true);
            linea = new PrintWriter(archivo_pedidos);
            for (pedido pedido1 : pedidos) {
                pedido = pedido1.getNumMesas() + ";" + pedido1.getPlato() + ";" + pedido1.getBebida() + ";" + pedido1.getPostre() + ";" + pedido1.getAñadirPorcion() + ";" + pedido1.getQuitarPotcion() + ";" + pedido1.getPrecio() + ";" + pedido1.getFecha() + ";" + pedido1.getNombreMesero() + ";" + pedido1.isEstado() + ";";
                linea.println(pedido);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error creando el archivo");
        } finally {
            try {
                if (archivo_pedidos != null) {
                    archivo_pedidos.close();
                }
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(null, "Error cerrando el archivo");
            }
        }
    }

    /**
     * llena el arreglo <pedidos>
     *
     * @param numMesas
     * @param plato
     * @param bebida
     * @param Postre
     * @param añadirPorcion
     * @param quitarPotcion
     * @param precio
     * @param fecha
     * @param nombreMesero
     * @param estado
     */
    public static void añadirArray(int numMesas, String plato, String bebida, String Postre, String añadirPorcion, String quitarPotcion, int precio, String fecha, String nombreMesero, boolean estado) {
        pedidos.add(new pedido(numMesas, plato, bebida, Postre, añadirPorcion, quitarPotcion, precio, fecha, nombreMesero, estado));
    }

    /**
     * llena el arreglo cuando se inicia el programa
     */
    public static void iniciarArray() {
        File archivo;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea; //accede linea a linea al contenido
        try {
            int numeroMesa, precio;
            String nombre, bebida, postre, añadir, quitar, hora, nombreMesero;
            boolean estado;
            archivo = new File("src/ficheros/pedidos.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            String cadena;
            while ((cadena = linea.readLine()) != null) {
                String dato[] = cadena.split(";");
                numeroMesa = Integer.parseInt(dato[0]);
                nombre = dato[1];
                bebida = dato[2];
                postre = dato[3];
                añadir = dato[4];
                quitar = dato[5];
                precio = Integer.parseInt(dato[6]);
                hora = dato[7] + ";" + dato[8];
                nombreMesero = dato[9];
                estado = Boolean.parseBoolean(dato[10]);
                añadirArray(numeroMesa, nombre, bebida, postre, añadir, quitar, precio, hora, nombreMesero, estado);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer archivo: " + e.getMessage());
        }
    }

    /**
     * validar si la mesa esta ocupada
     *
     * @param numMesa
     * @return
     */
    public static boolean buscar(int numMesa) {
        boolean retorno = false;
        File archivo;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea; //accede linea a linea al contenido
        try {
            archivo = new File("src/ficheros/pedidos.txt");
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            String cadena; //variable captura los datos del archivo
            while ((cadena = linea.readLine()) != null) { //recorre todo el archivo
                String dato[] = cadena.split(";");
                int mesaEvaluar = Integer.parseInt(dato[0]);
                if (mesaEvaluar == numMesa) {
                    if (Boolean.parseBoolean(dato[10])) {
                        retorno = true;
                    }
                }
            }
        } catch (IOException e) {

        } finally {
            try {
                if (contenido != null) {
                    contenido.close();
                }
            } catch (IOException e1) {
                System.out.print("Error cerrando archivo");
            }
        }
        return retorno;
    }

    /**
     * busqueda de pedido en una mesa
     */
    public static ArrayList<pedido> lista = new ArrayList();

    public static void busqueda(int index) {
        for (pedido pedido : pedidos) {
            int numero = pedido.getNumMesas();
            if (index == numero) {
                lista.add(new codigo.pedido(pedido.getNumMesas(), pedido.getPlato(), pedido.getBebida(), pedido.getPostre(), pedido.getAñadirPorcion(), pedido.getQuitarPotcion(), pedido.getPrecio(), pedido.getFecha(), pedido.getNombreMesero(), pedido.isEstado()));
            }
        }
    }

    public static String busquedaPedido(int numero) {
        String pedido = "";
        for (pedido pedido1 : pedidos) {
            if (pedido1.getNumMesas() == numero) {
                pedido = pedido1.getAñadirPorcion() + ";" + pedido1.getQuitarPotcion() + ";" + pedido1.getBebida() + ";" + pedido1.getPostre() + ";" + pedido1.getPlato() + ";" + pedido1.getNumMesas() + ";" + pedido1.getFecha() + ";" + pedido1.getNombreMesero();
                System.out.println(pedido);
            }
        }
        return pedido;
    }

    /**
     * intrucciones de modificaciones
     */
    public static void modificar() {
        codigo.archivoMenus.borrar(file);
        crearModificacion();
    }
}
