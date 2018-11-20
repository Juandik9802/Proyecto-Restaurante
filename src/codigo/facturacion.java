/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;

/**
 *
 * @author Juan Diego
 */
public class facturacion {
    int numero;
    ArrayList<String> platos;
    String fechaPedido;
    String fechaEntregado;
    String FechaFacturado;
    String nombre;

    public facturacion(int numero, ArrayList<String> platos, String fechaPedido, String fechaEntregado, String FechaFacturado, String nombre) {
        this.numero = numero;
        this.platos = platos;
        this.fechaPedido = fechaPedido;
        this.fechaEntregado = fechaEntregado;
        this.FechaFacturado = FechaFacturado;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<String> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<String> platos) {
        this.platos = platos;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(String fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    public String getFechaFacturado() {
        return FechaFacturado;
    }

    public void setFechaFacturado(String FechaFacturado) {
        this.FechaFacturado = FechaFacturado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
