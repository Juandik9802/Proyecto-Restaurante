/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.swing.Action;
import javax.swing.Icon;

/**
 *
 * @author Juan Diego
 */
public class boton extends  javax.swing.JButton{
    
    int numero;

    public boton(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
