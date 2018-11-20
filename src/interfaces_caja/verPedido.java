/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_caja;

import codigo.pedido;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Diego
 */
public class verPedido extends javax.swing.JFrame {

    private final int numero;
    public JComboBox jcb;

    /**
     * Creates new form verPedido
     *
     * @param num
     */
    public verPedido(int num,boolean estado) {
        this.numero = num;
        initComponents();
        numeroMesa.setText(String.valueOf(numero));
        iniciarTabla();
        llenarTabla();
        //obtener_tabla();
        codigo.archivoPedido.lista.clear();
        this.setLocationRelativeTo(null);
        if (estado){
            eliminarPedido.setEnabled(false);
        }else{
            facturar.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();
        facturar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numeroMesa = new javax.swing.JTextField();
        eliminarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPedido.setEnabled(false);
        tablaPedido.setFocusable(false);
        tablaPedido.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablaPedido);

        facturar.setText("Facturar");
        facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturarActionPerformed(evt);
            }
        });

        jLabel1.setText("Mesa:");

        numeroMesa.setEditable(false);
        numeroMesa.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        eliminarPedido.setText("Eliminar ");
        eliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(eliminarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(facturar)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facturar)
                    .addComponent(eliminarPedido))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturarActionPerformed
        String[] list = {"Seleccionar","Efectivo", "Targeta de credito", "Targeta de Debito"};
        jcb = new JComboBox(list);
        jcb.setEditable(true);
        JOptionPane.showMessageDialog(null, jcb, "Tipo de Pago", JOptionPane.QUESTION_MESSAGE);
        if (jcb.getSelectedItem() == "Efectivo") {
            pago_efectivo efectivo = new pago_efectivo(tablaPedido);
            efectivo.setVisible(true);
        } else {
            if (jcb.getSelectedItem() == "Targeta de credito") {
                System.err.println("2");
            } else {
                if (jcb.getSelectedItem() == "Targeta de Debito") {
                    System.err.println("3");
                }
            }
        }
    }//GEN-LAST:event_facturarActionPerformed

    private void eliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPedidoActionPerformed
        for (int i = 0; i < codigo.archivoPedido.pedidos.size(); i++) {
            if (codigo.archivoPedido.pedidos.get(i).getNumMesas() == numero) {
                codigo.archivoPedido.pedidos.remove(i);
                codigo.archivoPedido.modificar();
                this.dispose();
            }
        }
    }//GEN-LAST:event_eliminarPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarPedido;
    private javax.swing.JButton facturar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numeroMesa;
    public javax.swing.JTable tablaPedido;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel model = new DefaultTableModel();

    private void iniciarTabla() {
        model.addColumn("Nombre");
        model.addColumn("Precio");
        tablaPedido.setModel(model);
    }

    private void llenarTabla() {
        codigo.archivoPedido.busqueda(numero);
        for (pedido object : codigo.archivoPedido.lista) {
            int cont = 0;
            model.insertRow(cont, new Object[]{});
            model.setValueAt(object.getPlato(), cont, 0);
            model.setValueAt(object.getPrecio(), cont, 1);
            model.insertRow(cont, new Object[]{});
            model.setValueAt(object.getBebida(), cont, 0);
            model.setValueAt(Integer.parseInt(codigo.archivoPlatos.busqueda(object.getBebida())), cont, 1);
            model.insertRow(cont, new Object[]{});
            model.setValueAt(object.getPostre(), cont, 0);
            model.setValueAt(Integer.parseInt(codigo.archivoPlatos.busqueda(object.getPostre())), cont, 1);
        }
    }

    private void obtener_tabla() {
        int fila = tablaPedido.getRowCount();
        int i;
        String valores = "";
        for (i = 0; i < fila; i++) {
            int valor = (int) tablaPedido.getValueAt(i, 1);
            valores += valor;
            // Con esta condición solo ponemos comas hasta el penúltimo valor :)
            if (i < (fila - 1)) {
                valores += ", ";
            }
        }
        JOptionPane.showMessageDialog(null, "valores de la columna1: " + valores);
    }

    public JTable getTablaPedido() {
        return tablaPedido;
    }

    public void setTablaPedido(JTable tablaPedido) {
        this.tablaPedido = tablaPedido;
    }

}
