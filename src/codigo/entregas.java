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
public class entregas implements Serializable{

    String mesa;
    ArrayList<String> platos;
    String fechaPedido;
    String fechaDespacho;
    String fechaCaja;
    String nombreMesero;

    public entregas(String mesa, ArrayList<String> platos, String fechaPedido, String fechaDespacho, String fechaCaja, String nombreMesero) {
        this.mesa = mesa;
        this.platos = platos;
        this.fechaPedido = fechaPedido;
        this.fechaDespacho = fechaDespacho;
        this.fechaCaja = fechaCaja;
        this.nombreMesero = nombreMesero;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
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

    public String getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(String fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public String getFechaCaja() {
        return fechaCaja;
    }

    public void setFechaCaja(String fechaCaja) {
        this.fechaCaja = fechaCaja;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

}
