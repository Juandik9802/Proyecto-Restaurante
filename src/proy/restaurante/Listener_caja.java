/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.restaurante;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author josep
 */
public class Listener_caja implements ActionListener {
     proy.restaurante.mesero obt=new proy.restaurante.mesero();
    
    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        obt.setVisible(true);
    }
}
