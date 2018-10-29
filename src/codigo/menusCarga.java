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
public class menusCarga {
    String Dia;
    ArrayList<String> almuerzos=new ArrayList();
    ArrayList<String> cenas=new ArrayList();
    ArrayList<String> bebidas=new ArrayList();
    ArrayList<String> postres =new ArrayList();

    public menusCarga(String Dia) {
        this.Dia = Dia;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public ArrayList<String> getAlmuerzos() {
        return almuerzos;
    }

    public void setAlmuerzos(ArrayList<String> almuerzos) {
        this.almuerzos = almuerzos;
    }

    public ArrayList<String> getCenas() {
        return cenas;
    }

    public void setCenas(ArrayList<String> cenas) {
        this.cenas = cenas;
    }

    public ArrayList<String> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<String> bebidas) {
        this.bebidas = bebidas;
    }

    public ArrayList<String> getPostres() {
        return postres;
    }

    public void setPostres(ArrayList<String> postres) {
        this.postres = postres;
    }
    public void añadirAlmuerzo(String almuerzo){
        almuerzos.add(almuerzo);
    }
    
    public void añadirCena(String cena){
        cenas.add(cena);
    }
    public void añadirBebida(String bebida){
        bebidas.add(bebida);
    }
    
    public void añadirPostre(String postre){
        almuerzos.add(postre);
    }
}
