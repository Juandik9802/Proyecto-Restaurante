/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Juan Diego
 */
public class pedido {
    int numMesas;
    String plato;
    String bebida;
    String Postre;
    String añadirPorcion;
    String quitarPotcion;
    int precio;
    String fecha;

    public pedido(int numMesas, String plato, String bebida, String Postre, String añadirPorcion, String quitarPotcion, int precio, String fecha) {
        this.numMesas = numMesas;
        this.plato = plato;
        this.bebida = bebida;
        this.Postre = Postre;
        this.añadirPorcion = añadirPorcion;
        this.quitarPotcion = quitarPotcion;
        this.precio = precio;
        this.fecha = fecha;
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

    public String getAñadirPorcion() {
        return añadirPorcion;
    }

    public void setAñadirPorcion(String añadirPorcion) {
        this.añadirPorcion = añadirPorcion;
    }

    public String getQuitarPotcion() {
        return quitarPotcion;
    }

    public void setQuitarPotcion(String quitarPotcion) {
        this.quitarPotcion = quitarPotcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
