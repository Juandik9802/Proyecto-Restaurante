/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces_administrador;

/**
 *
 * @author Juan Diego Pachón
 */
public class menuDia extends javax.swing.JPanel {

    /** Creates new form menuDisa */
    public menuDia() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Dia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setText("Nombre del plato");
        add(jLabel1);
        jLabel1.setBounds(30, 110, 200, 14);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1);
        jTextField1.setBounds(30, 130, 230, 50);

        jLabel2.setText("Precio");
        add(jLabel2);
        jLabel2.setBounds(350, 110, 69, 14);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(350, 130, 167, 50);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "almuerzo", "comida" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1);
        jComboBox1.setBounds(13, 47, 182, 33);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingredientes");
        add(jLabel3);
        jLabel3.setBounds(10, 190, 106, 47);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3);
        jTextField3.setBounds(30, 230, 230, 47);

        jButton1.setText("Agregar");
        add(jButton1);
        jButton1.setBounds(70, 300, 120, 23);

        jButton2.setText("Aceptar");
        add(jButton2);
        jButton2.setBounds(227, 334, 139, 43);

        jLabel4.setText("Dia:");
        add(jLabel4);
        jLabel4.setBounds(320, 200, 70, 30);

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel5.setText("Comidas");
        add(jLabel5);
        jLabel5.setBounds(285, 11, 133, 63);

        Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));
        add(Dia);
        Dia.setBounds(350, 230, 180, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/ingredientes.jpg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(410, 270, 170, 130);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Dia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
