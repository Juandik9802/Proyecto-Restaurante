/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.Serializable;

/**
 *
 * @author Juan Diego
 */
public class platosEntregados implements Serializable {

    private int numMesas;
    private String plato;
    private String bebida;
    private String Postre;
    private String fecha;
    private String entregado;
    private String nombreMesero;

    public platosEntregados(int numMesas, String plato, String bebida, String Postre, String fecha, String entregado, String nombreMesero) {
        this.numMesas = numMesas;
        this.plato = plato;
        this.bebida = bebida;
        this.Postre = Postre;
        this.fecha = fecha;
        this.entregado = entregado;
        this.nombreMesero = nombreMesero;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getPostre() {
        return Postre;
    }

    public void setPostre(String Postre) {
        this.Postre = Postre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEntregado() {
        return entregado;
    }

    public void setEntregado(String entregado) {
        this.entregado = entregado;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

}
