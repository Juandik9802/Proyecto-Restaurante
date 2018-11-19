/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces_administrador;

import codigo.archivoMenus;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Juan Diego Pachón
 */
public class menuDia extends javax.swing.JPanel {
    
    ArrayList<String> almuerzo= new ArrayList();
    ArrayList<String> cena= new ArrayList();
    ArrayList<String> Bebidas= new ArrayList();
    ArrayList<String> Postre= new ArrayList();
    archivoMenus archivo=new archivoMenus();
    
    /** Creates new form menuDisa */
    public menuDia() {
        initComponents();
        actualizar();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        primerAlmuerzo = new javax.swing.JComboBox<>();
        segundoAlmuerzo = new javax.swing.JComboBox<>();
        tercerAlmuerzo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cenaUno = new javax.swing.JComboBox<>();
        cenaDos = new javax.swing.JComboBox<>();
        cenaTres = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        primeraBebida = new javax.swing.JComboBox<>();
        segundaBebida = new javax.swing.JComboBox<>();
        trecerBebida = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        postreUno = new javax.swing.JComboBox<>();
        prostreDos = new javax.swing.JComboBox<>();
        postreTres = new javax.swing.JComboBox<>();
        diaMenu = new javax.swing.JComboBox<>();
        editar_plato = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Editar el menu del dia:");

        jLabel7.setText("Almuerzo");

        primerAlmuerzo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        primerAlmuerzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primerAlmuerzoMouseClicked(evt);
            }
        });

        segundoAlmuerzo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        segundoAlmuerzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segundoAlmuerzoMouseClicked(evt);
            }
        });

        tercerAlmuerzo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        tercerAlmuerzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tercerAlmuerzoMouseClicked(evt);
            }
        });

        jLabel8.setText("Cena");

        cenaUno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cenaUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cenaUnoMouseClicked(evt);
            }
        });

        cenaDos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cenaDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cenaDosMouseClicked(evt);
            }
        });

        cenaTres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cenaTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cenaTresMouseClicked(evt);
            }
        });

        jLabel9.setText("Bebidas");

        primeraBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        primeraBebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primeraBebidaMouseClicked(evt);
            }
        });

        segundaBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        segundaBebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segundaBebidaMouseClicked(evt);
            }
        });

        trecerBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        trecerBebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trecerBebidaMouseClicked(evt);
            }
        });

        jLabel1.setText("Postres");

        postreUno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        postreUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postreUnoMouseClicked(evt);
            }
        });

        prostreDos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        prostreDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prostreDosMouseClicked(evt);
            }
        });

        postreTres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        postreTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postreTresMouseClicked(evt);
            }
        });

        diaMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "MIercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));

        editar_plato.setText("Editar Plato");
        editar_plato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_platoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cenaUno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cenaDos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cenaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(primerAlmuerzo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(segundoAlmuerzo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tercerAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(postreTres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prostreDos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(primeraBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(segundaBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trecerBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(postreUno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(diaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editar_plato, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(primeraBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(segundaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trecerBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(postreUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prostreDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postreTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(primerAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(segundoAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tercerAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(cenaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cenaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cenaTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(editar_plato)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void primerAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerAlmuerzoMouseClicked
       actualizar();
    }//GEN-LAST:event_primerAlmuerzoMouseClicked

    private void segundoAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundoAlmuerzoMouseClicked
        actualizar();
        segundoAlmuerzo.removeItem((String)primerAlmuerzo.getSelectedItem());
    }//GEN-LAST:event_segundoAlmuerzoMouseClicked

    private void tercerAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tercerAlmuerzoMouseClicked
        actualizar();
    }//GEN-LAST:event_tercerAlmuerzoMouseClicked

    private void cenaUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cenaUnoMouseClicked
        actualizar();        // TODO add your handling code here:
    }//GEN-LAST:event_cenaUnoMouseClicked

    private void cenaDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cenaDosMouseClicked
        actualizar();
    }//GEN-LAST:event_cenaDosMouseClicked

    private void cenaTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cenaTresMouseClicked
        actualizar();
    }//GEN-LAST:event_cenaTresMouseClicked

    private void primeraBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeraBebidaMouseClicked
        actualizar();
    }//GEN-LAST:event_primeraBebidaMouseClicked

    private void segundaBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundaBebidaMouseClicked
        actualizar();
    }//GEN-LAST:event_segundaBebidaMouseClicked

    private void trecerBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trecerBebidaMouseClicked
        actualizar();
    }//GEN-LAST:event_trecerBebidaMouseClicked

    private void postreUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postreUnoMouseClicked
        actualizar();
    }//GEN-LAST:event_postreUnoMouseClicked

    private void prostreDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prostreDosMouseClicked
        actualizar();
    }//GEN-LAST:event_prostreDosMouseClicked

    private void postreTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postreTresMouseClicked
        actualizar();
    }//GEN-LAST:event_postreTresMouseClicked

    private void editar_platoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_platoActionPerformed
        if (primerAlmuerzo.getSelectedItem()=="Seleccionar"||segundoAlmuerzo.getSelectedItem()=="Seleccionar"|| tercerAlmuerzo.getSelectedItem()=="Seleccionar"
                ||cenaUno.getSelectedItem()=="Seleccionar"||cenaDos.getSelectedItem()=="Seleccionar"||cenaTres.getSelectedItem()=="Seleccionar"
                ||primeraBebida.getSelectedItem()=="Seleccionar"||segundaBebida.getSelectedItem()=="Seleccionar"||trecerBebida.getSelectedItem()=="Seleccionar"
                ||postreUno.getSelectedItem()=="Seleccionar"||prostreDos.getSelectedItem()=="Seleccionar"||postreTres.getSelectedItem()=="Seleccionar"){
            JOptionPane.showMessageDialog(null, "Error de Seleccion");
        }else{
            cargarArryList();
            cargar();
            /* cotrol de añadir a la semana*/
        }  
        
        //codigo.archivoMenus.añadirModificacion(tipo, almuerzo, cena, Bebidas, Postre);
    }//GEN-LAST:event_editar_platoActionPerformed
    
    private void actualizar(){
        codigo.archivoPlatos.mostrar();
        almuerzoActualizar();
        cenaActualizar();
        bebidasActualizar();
        postresActualizar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cenaDos;
    private javax.swing.JComboBox<String> cenaTres;
    private javax.swing.JComboBox<String> cenaUno;
    private javax.swing.JComboBox<String> diaMenu;
    private javax.swing.JButton editar_plato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> postreTres;
    private javax.swing.JComboBox<String> postreUno;
    private javax.swing.JComboBox<String> primerAlmuerzo;
    private javax.swing.JComboBox<String> primeraBebida;
    private javax.swing.JComboBox<String> prostreDos;
    private javax.swing.JComboBox<String> segundaBebida;
    private javax.swing.JComboBox<String> segundoAlmuerzo;
    private javax.swing.JComboBox<String> tercerAlmuerzo;
    private javax.swing.JComboBox<String> trecerBebida;
    // End of variables declaration//GEN-END:variables
    String tipo,nombre;
    
    

    private void almuerzoActualizar() {        
        int contador = 0;
        boolean control;
        for (codigo.platillo object : codigo.archivoPlatos.platos) {
            control=false;
            String datosRevisar = codigo.archivoPlatos.platos.get(contador).getNombre();
            for (int j=0;j< primerAlmuerzo.getItemCount();j++) {
                String comparar= primerAlmuerzo.getItemAt(j);
                if  (comparar.equals(datosRevisar)){
                    control=true;
                }
            }
            if(control==false){
                String evaluar=codigo.archivoPlatos.platos.get(contador).getTipo();
                if (evaluar.equals("Almuerzo") ){
                    primerAlmuerzo.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                    segundoAlmuerzo.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                    tercerAlmuerzo.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                }
            }
            contador++;
        }
    }

    private void cenaActualizar() {
        int contador = 0;
        boolean control;
        for (codigo.platillo object : codigo.archivoPlatos.platos) {
            control=false;
            String datosRevisar = object.getNombre();
            for (int j=0;j< cenaUno.getItemCount();j++) {
                String comparar= cenaUno.getItemAt(j); 
                if  (comparar.equals(datosRevisar)){
                    control=true;
                }
            }
            if(control==false){
                String evaluar=codigo.archivoPlatos.platos.get(contador).getTipo();
                if (evaluar.equals("Cena") ){
                    cenaUno.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                    cenaDos.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                    cenaTres.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                }
            } 
            contador++;
        }
    }

    private void bebidasActualizar() {
        int contador = 0;
        boolean control;
        for (codigo.platillo object : codigo.archivoPlatos.platos) {
            control=false;
            String datosRevisar = codigo.archivoPlatos.platos.get(contador).getNombre();
            for (int j=0;j< primeraBebida.getItemCount();j++) {
                String comparar= primeraBebida.getItemAt(j); 
                if  (comparar.equals(datosRevisar)){
                    control=true;
                }
            }
            if(control==false){
                String evaluar=codigo.archivoPlatos.platos.get(contador).getTipo();
                if (evaluar.equals("Bebidas") ){
                    primeraBebida.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                    segundaBebida.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                    trecerBebida.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                }
            }
            contador++;
        }
    }

    private void postresActualizar() {
        int contador = 0;
        boolean control;
        for (codigo.platillo object : codigo.archivoPlatos.platos) {
            control=false;
            String datosRevisar = codigo.archivoPlatos.platos.get(contador).getNombre();
            for (int j=0;j< postreUno.getItemCount();j++) {
                String comparar= postreUno.getItemAt(j); 
                if  (comparar.equals(datosRevisar)){
                    control=true;
                }
            }
            if(control==false){
                String evaluar=codigo.archivoPlatos.platos.get(contador).getTipo();
                if (evaluar.equals("Postres") ){
                    postreUno.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                    prostreDos.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                    postreTres.addItem(codigo.archivoPlatos.platos.get(contador).getNombre());
                }
            }
            contador++;
        }
    }
    
    private void cargarArryList(){
            almuerzo.add((String) primerAlmuerzo.getSelectedItem());
            almuerzo.add((String) segundoAlmuerzo.getSelectedItem());
            almuerzo.add((String) tercerAlmuerzo.getSelectedItem());
            cena.add((String) cenaUno.getSelectedItem());
            cena.add((String) cenaDos.getSelectedItem());
            cena.add((String) cenaTres.getSelectedItem());
            Bebidas.add((String) primeraBebida.getSelectedItem());
            Bebidas.add((String) segundaBebida.getSelectedItem());
            Bebidas.add((String) trecerBebida.getSelectedItem());
            Postre.add((String) postreUno.getSelectedItem());
            Postre.add((String) prostreDos.getSelectedItem());
            Postre.add((String) postreTres.getSelectedItem());
    }
    
    private void cargar(){
            archivoMenus.añadirModificacion((String) diaMenu.getSelectedItem(), almuerzo, cena, Bebidas, Postre);
            almuerzo.clear();cena.clear();Bebidas.clear();Postre.clear();
    }  
}
