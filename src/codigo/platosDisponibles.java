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
public class platosDisponibles {
    ArrayList<platillo> listaPlatos;

    public platosDisponibles(ArrayList<platillo> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }
    
    public platosDisponibles(platillo palto) {
       listaPlatos.add(palto);
    }

    public ArrayList<platillo> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(ArrayList<platillo> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }
    
}
