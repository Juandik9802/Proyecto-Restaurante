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

    public boton() {
       
    }

    public boton(Icon icon) {
        super(icon);
    }

    public boton(String text) {
        super(text);
    }

    public boton(Action a) {
        super(a);
    }

    public boton(String text, Icon icon) {
        super(text, icon);
    }
    
}
