/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Juan Diego
 */
public class facturacion implements Serializable{
    int numero;
    String tipo;
    ArrayList<String> platos;
    String fechaPedido;
    String fechaEntregado;
    String FechaFacturado;
    String nombre;
    int cantidadPaga;

    public facturacion(int numero, String tipo, ArrayList<String> platos, String fechaPedido, String fechaEntregado, String FechaFacturado, String nombre, int cantidadPaga) {
        this.numero = numero;
        this.tipo = tipo;
        this.platos = platos;
        this.fechaPedido = fechaPedido;
        this.fechaEntregado = fechaEntregado;
        this.FechaFacturado = FechaFacturado;
        this.nombre = nombre;
        this.cantidadPaga = cantidadPaga;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getCantidadPaga() {
        return cantidadPaga;
    }

    public void setCantidadPaga(int cantidadPaga) {
        this.cantidadPaga = cantidadPaga;
    }

}
