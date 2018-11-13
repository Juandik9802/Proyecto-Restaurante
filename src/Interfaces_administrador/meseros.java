/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_administrador;


import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Jimenez
 */
public class meseros extends javax.swing.JPanel {
public static int codi_mesero;
public static String nom_mesero,apellido;
    /**
     * Creates new form meseros
     */
    public meseros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre_mesero = new javax.swing.JTextField();
        aceptar_meseros = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigo_mesero = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(null);

        jLabel1.setText("Nombre del mesero");
        add(jLabel1);
        jLabel1.setBounds(10, 50, 170, 30);

        nombre_mesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_meseroKeyTyped(evt);
            }
        });
        add(nombre_mesero);
        nombre_mesero.setBounds(130, 50, 140, 30);

        aceptar_meseros.setText("Aceptar");
        aceptar_meseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar_meserosActionPerformed(evt);
            }
        });
        add(aceptar_meseros);
        aceptar_meseros.setBounds(60, 270, 150, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/meseros-1.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(340, 10, 470, 390);

        jLabel2.setText("Codigo");
        add(jLabel2);
        jLabel2.setBounds(10, 150, 160, 30);

        codigo_mesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigo_meseroKeyTyped(evt);
            }
        });
        add(codigo_mesero);
        codigo_mesero.setBounds(130, 150, 140, 30);

        Apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoKeyTyped(evt);
            }
        });
        add(Apellido);
        Apellido.setBounds(130, 100, 140, 30);

        jLabel4.setText("Apellido del mesero");
        add(jLabel4);
        jLabel4.setBounds(10, 104, 120, 20);
    }// </editor-fold>//GEN-END:initComponents
/***
 * 
                
 * @param evt 
 */
    private void aceptar_meserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar_meserosActionPerformed
        if (codigo_mesero.getText().equals("")||nombre_mesero.getText().equals("")||Apellido.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        }else{       
            codi_mesero=Integer.parseInt(codigo_mesero.getText());
            if(codigo.listaMeseros.isCodigo(codi_mesero)){
                JOptionPane.showMessageDialog(null, "Codigo ya asignado");
            } else {                
                nom_mesero=nombre_mesero.getText();
                apellido=Apellido.getText();
                codigo.listaMeseros.añadirMesero(nom_mesero, apellido, codi_mesero);
                codigo.listaMeseros.crear();
                codigo_mesero.setText(null);
                nombre_mesero.setText(null);
                Apellido.setText(null);
            }        
        }
    }//GEN-LAST:event_aceptar_meserosActionPerformed

    private void codigo_meseroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo_meseroKeyTyped
        char c =evt.getKeyChar();
        if (c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_codigo_meseroKeyTyped

    private void ApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoKeyTyped
        char c =evt.getKeyChar();
        if (c<'a'||c>'z')evt.consume();
    }//GEN-LAST:event_ApellidoKeyTyped

    private void nombre_meseroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_meseroKeyTyped
        char c =evt.getKeyChar();
        if (c<'a'||c>'z')evt.consume();
    }//GEN-LAST:event_nombre_meseroKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton aceptar_meseros;
    private javax.swing.JTextField codigo_mesero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombre_mesero;
    // End of variables declaration//GEN-END:variables
    
    
}
