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
public class platillo {
    private String tipo;
    private String nombre;
    private int precio;
    private ArrayList<String> porcion;

    public platillo() {
    }
    
    public platillo(String tipo, String nombre, short precio) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void porcion(String p){
        porcion.add(p);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<String> getPorcion() {
        return porcion;
    }

    public void setPorcion(ArrayList<String> porcion) {
        this.porcion = porcion;
    }
    
}
