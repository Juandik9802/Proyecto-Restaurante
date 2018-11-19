/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import interfaces_caja.verPedido;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Action;
import javax.swing.Icon;

/**
 *
 * @author Juan Diego
 */
public class boton extends javax.swing.JButton implements ActionListener {

    int numeroMesa;
    boolean estadoMesa;
    private Timer timer;
    private TimerTask tarea;

    public boton(int numeroMesa, boolean estadoMesa, String text, Icon icon) {
        super(text, icon);
        this.numeroMesa = numeroMesa;
        this.estadoMesa = estadoMesa;
        this.addActionListener(this);

        tarea = new TimerTask() {
            @Override
            public void run() {
                if (codigo.archivoPedido.buscar(numeroMesa)) {
                    estado();
                }else{
                    estado2();
                }
                for (platosEntregados entregado : codigo.archivoEntregados.entregados) {
                    if (entregado.getNumMesas() == numeroMesa) {
                        estado1();
                    }
                }
            }
        };
        //this.setIcon(icon);
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, 2000, 2000);
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(boolean estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        verPedido ver = new verPedido(this.numeroMesa,estadoMesa);
        ver.setVisible(true);
    }

    private void estado() {
        this.setBackground(Color.BLUE);
        estadoMesa=false;
    }

    private void estado1() {
        this.setBackground(Color.GREEN);
        estadoMesa=true;
    }
    private void estado2(){
        this.setBackground(null);
        estadoMesa=false;
    }
}
