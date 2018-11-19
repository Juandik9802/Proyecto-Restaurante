/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Diego
 */
public class archivoEntregados {

    private static File file = new File("src/ficheros/entregados.bin");
    public static ArrayList<platosEntregados> entregados = new ArrayList();
    private static FileOutputStream fileOutputStream;
    private static ObjectOutputStream objectOutputStream;
    private static FileInputStream fileInputStream;
    private static ObjectInputStream inputStream;

    public static void escribir() {
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(entregados);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(archivoEntregados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(archivoEntregados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void leer() {
        try {
            fileInputStream = new FileInputStream(file);
            inputStream = new ObjectInputStream(fileInputStream);
            Object data = inputStream.readObject();
            entregados = (ArrayList<platosEntregados>) data;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(archivoEntregados.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(archivoEntregados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void añadir(int numero,String plato,String bebida,String postre,String fecha,String entregado,String nombreMesero){
        entregados.add(new platosEntregados(numero, plato, bebida, postre, fecha, entregado, nombreMesero));
    }
}
