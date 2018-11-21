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

    static File nuevo = new File("src/ficheros/Menu.txt");
    static File pedido = new File("src/ficheros/pedidos.txt");
    static File mesero = new File("src/ficheros/Meseros.txt");
    static File general = new File("src/ficheros/mesas.txt");
    static File cocina = new File("src/ficheros/cocina.txt");
    static File platos = new File("src/ficheros/platos.txt");
    static File entregados = new File("src/ficheros/entregados.bin");
    static File facturados = new File("src/ficheros/Facturados.bin");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (nuevo.exists()) {
            codigo.archivoMenus.llenarArray();
        }
        if (mesero.exists()) {
            codigo.listaMeseros.llenarArray();
        }
        if (pedido.exists()) {
            codigo.archivoPedido.iniciarArray();
        }
        if (cocina.exists()) {
            codigo.archivoCocina.iniciarArray();
        }
        if (platos.exists()) {
            codigo.archivoPlatos.mostrar();
        }if (entregados.exists()){
            codigo.archivoEntregados.leer();
        }
        if (facturados.exists()){
            codigo.archivoFacturados.leer();
        }
        
        codigo.archivoGeneral.numeroMesas = codigo.archivoGeneral.buscar();
        Principal obt = new Principal();
        obt.setVisible(true);
    }

}