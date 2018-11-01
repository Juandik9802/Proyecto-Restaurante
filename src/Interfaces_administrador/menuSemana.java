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
public class menuSemana extends javax.swing.JPanel {
    
    ArrayList<String> almuerzo= new ArrayList();
    ArrayList<String> cena= new ArrayList();
    ArrayList<String> Bebidas= new ArrayList();
    ArrayList<String> Postre= new ArrayList();
    archivoMenus archivo=new archivoMenus();
    /**
     * Creates new form menuSemana
     */
    public menuSemana() {
        initComponents();
        dia.setText("Lunes");
        Aceptar.setEnabled(!true);
        cargarListas();//cargar los combobox
        codigo.archivoPlatos.mostrarPlato.clear();//limpiar el ArrayList        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        primerAlmuerzo = new javax.swing.JComboBox<>();
        segundoAlmuerzo = new javax.swing.JComboBox<>();
        tercerAlmerzo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cenaUno = new javax.swing.JComboBox<>();
        cenaDos = new javax.swing.JComboBox<>();
        cenaTres = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        primeraBebida = new javax.swing.JComboBox<>();
        segundaBebida = new javax.swing.JComboBox<>();
        trecerBebida = new javax.swing.JComboBox<>();
        postreUno = new javax.swing.JComboBox<>();
        prostreDos = new javax.swing.JComboBox<>();
        postreTres = new javax.swing.JComboBox<>();
        dia = new javax.swing.JLabel();
        agregarMenu = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel5.setText("menu de la SEmana");

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

        tercerAlmerzo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        tercerAlmerzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tercerAlmerzoMouseClicked(evt);
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

        jLabel1.setText("Postres");

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

        dia.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        dia.setText("Dia");

        agregarMenu.setText("Agregar");
        agregarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMenuActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cenaUno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cenaDos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cenaTres, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(primerAlmuerzo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(segundoAlmuerzo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tercerAlmerzo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(postreTres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prostreDos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(primeraBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(segundaBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trecerBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(postreUno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Aceptar)
                    .addComponent(agregarMenu))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(primerAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(segundoAlmuerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tercerAlmerzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cenaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cenaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cenaTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(postreTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(agregarMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    int intento=1;
    private void agregarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMenuActionPerformed
        if (primerAlmuerzo.getSelectedItem()=="Seleccionar"||segundoAlmuerzo.getSelectedItem()=="Seleccionar"|| tercerAlmerzo.getSelectedItem()=="Seleccionar"
                ||cenaUno.getSelectedItem()=="Seleccionar"||cenaDos.getSelectedItem()=="Seleccionar"||cenaTres.getSelectedItem()=="Seleccionar"
                ||primeraBebida.getSelectedItem()=="Seleccionar"||segundaBebida.getSelectedItem()=="Seleccionar"||trecerBebida.getSelectedItem()=="Seleccionar"
                ||postreUno.getSelectedItem()=="Seleccionar"||prostreDos.getSelectedItem()=="Seleccionar"||postreTres.getSelectedItem()=="Seleccionar"){
            JOptionPane.showMessageDialog(null, "Error de Seleccion");
        }else{
            /* cotrol de añadir a la semana*/
            controlDias();
        }       
    }//GEN-LAST:event_agregarMenuActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        
    }//GEN-LAST:event_AceptarActionPerformed

    private void primerAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerAlmuerzoMouseClicked
        actualizar();
    }//GEN-LAST:event_primerAlmuerzoMouseClicked

    private void segundoAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundoAlmuerzoMouseClicked
        actualizar();
        segundoAlmuerzo.removeItem((String)primerAlmuerzo.getSelectedItem());
    }//GEN-LAST:event_segundoAlmuerzoMouseClicked

    private void tercerAlmerzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tercerAlmerzoMouseClicked
       actualizar();
       tercerAlmerzo.removeItem((String)primerAlmuerzo.getSelectedItem());
       tercerAlmerzo.removeItem((String)segundoAlmuerzo.getSelectedItem());
    }//GEN-LAST:event_tercerAlmerzoMouseClicked

    private void cenaUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cenaUnoMouseClicked
        actualizar();
    }//GEN-LAST:event_cenaUnoMouseClicked

    private void cenaDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cenaDosMouseClicked
        actualizar();
        cenaDos.removeItem((String) cenaUno.getSelectedItem());
    }//GEN-LAST:event_cenaDosMouseClicked

    private void cenaTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cenaTresMouseClicked
        actualizar();
        cenaTres.removeItem((String) cenaUno.getSelectedItem());
        cenaTres.removeItem((String) cenaDos.getSelectedItem());
    }//GEN-LAST:event_cenaTresMouseClicked

    private void primeraBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeraBebidaMouseClicked
        actualizar();
    }//GEN-LAST:event_primeraBebidaMouseClicked

    private void segundaBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segundaBebidaMouseClicked
        actualizar();
        segundaBebida.removeItem((String) primeraBebida.getSelectedItem());
    }//GEN-LAST:event_segundaBebidaMouseClicked

    private void trecerBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trecerBebidaMouseClicked
        actualizar();
        trecerBebida.removeItem((String) primeraBebida.getSelectedItem());
        trecerBebida.removeItem((String) segundoAlmuerzo.getSelectedItem());
    }//GEN-LAST:event_trecerBebidaMouseClicked

    private void postreUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postreUnoMouseClicked
        actualizar();
    }//GEN-LAST:event_postreUnoMouseClicked

    private void prostreDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prostreDosMouseClicked
        actualizar();
        prostreDos.removeItem((String) postreUno.getSelectedItem());
    }//GEN-LAST:event_prostreDosMouseClicked

    private void postreTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postreTresMouseClicked
        actualizar();
        postreTres.removeItem((String) postreUno.getSelectedItem());
        postreTres.removeItem((String) prostreDos.getSelectedItem());
    }//GEN-LAST:event_postreTresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton agregarMenu;
    private javax.swing.JComboBox<String> cenaDos;
    private javax.swing.JComboBox<String> cenaTres;
    private javax.swing.JComboBox<String> cenaUno;
    private javax.swing.JLabel dia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> postreTres;
    private javax.swing.JComboBox<String> postreUno;
    private javax.swing.JComboBox<String> primerAlmuerzo;
    private javax.swing.JComboBox<String> primeraBebida;
    private javax.swing.JComboBox<String> prostreDos;
    private javax.swing.JComboBox<String> segundaBebida;
    private javax.swing.JComboBox<String> segundoAlmuerzo;
    private javax.swing.JComboBox<String> tercerAlmerzo;
    private javax.swing.JComboBox<String> trecerBebida;
    // End of variables declaration//GEN-END:variables
    
    private void cargarListas() {
        codigo.archivoPlatos.mostrar();        
        for (int i=0;i<codigo.archivoPlatos.mostrarPlato.size();i++){
            String evaluar=codigo.archivoPlatos.mostrarPlato.get(i).getTipo();
           if (evaluar.equals("Almuerzo") ){
                primerAlmuerzo.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());
                segundoAlmuerzo.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());
                tercerAlmerzo.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());               
            }
             if (evaluar.equals("Cena") ){
                cenaUno.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());
                cenaDos.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());
                cenaTres.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());               
            }
             if (evaluar.equals("Bebidas") ){
                    primeraBebida.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());
                    segundaBebida.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());
                    trecerBebida.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());
            }
             if (evaluar.equals("Postres") ){
                    postreUno.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());
                    prostreDos.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());
                    postreTres.addItem(codigo.archivoPlatos.mostrarPlato.get(i).getNombre());
            } 
        }
    }

    private void actualizar(){
        codigo.archivoPlatos.mostrar();
        almuerzoActualizar();
        cenaActualizar();
        bebidasActualizar();
        postresActualizar();
    }
    
    private void almuerzoActualizar() {        
        int contador = 0;
        boolean control;
        for (codigo.cargarCombos object : codigo.archivoPlatos.mostrarPlato) {
            control=false;
            String datosRevisar = codigo.archivoPlatos.mostrarPlato.get(contador).getNombre();
            for (int j=0;j< primerAlmuerzo.getItemCount();j++) {
                String comparar= primerAlmuerzo.getItemAt(j);
                if  (comparar.equals(datosRevisar)){
                    control=true;
                }
            }
            if(control==false){
                String evaluar=codigo.archivoPlatos.mostrarPlato.get(contador).getTipo();
                if (evaluar.equals("Almuerzo") ){
                    primerAlmuerzo.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                    segundoAlmuerzo.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                    tercerAlmerzo.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                }
            }
            contador++;
        }
    }

    private void cenaActualizar() {
        int contador = 0;
        boolean control;
        for (codigo.cargarCombos object : codigo.archivoPlatos.mostrarPlato) {
            control=false;
            String datosRevisar = object.getNombre();
            for (int j=0;j< cenaUno.getItemCount();j++) {
                String comparar= cenaUno.getItemAt(j); 
                if  (comparar.equals(datosRevisar)){
                    control=true;
                }
            }
            if(control==false){
                String evaluar=codigo.archivoPlatos.mostrarPlato.get(contador).getTipo();
                if (evaluar.equals("Cena") ){
                    cenaUno.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                    cenaDos.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                    cenaTres.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                }
            } 
            contador++;
        }
    }

    private void bebidasActualizar() {
        int contador = 0;
        boolean control;
        for (codigo.cargarCombos object : codigo.archivoPlatos.mostrarPlato) {
            control=false;
            String datosRevisar = codigo.archivoPlatos.mostrarPlato.get(contador).getNombre();
            for (int j=0;j< primeraBebida.getItemCount();j++) {
                String comparar= primeraBebida.getItemAt(j); 
                if  (comparar.equals(datosRevisar)){
                    control=true;
                }
            }
            if(control==false){
                String evaluar=codigo.archivoPlatos.mostrarPlato.get(contador).getTipo();
                if (evaluar.equals("Bebidas") ){
                    primeraBebida.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                    segundaBebida.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                    trecerBebida.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                }
            }
            contador++;
        }
    }

    private void postresActualizar() {
        int contador = 0;
        boolean control;
        for (codigo.cargarCombos object : codigo.archivoPlatos.mostrarPlato) {
            control=false;
            String datosRevisar = codigo.archivoPlatos.mostrarPlato.get(contador).getNombre();
            for (int j=0;j< postreUno.getItemCount();j++) {
                String comparar= postreUno.getItemAt(j); 
                if  (comparar.equals(datosRevisar)){
                    control=true;
                }
            }
            if(control==false){
                String evaluar=codigo.archivoPlatos.mostrarPlato.get(contador).getTipo();
                if (evaluar.equals("Postres") ){
                    postreUno.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                    prostreDos.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                    postreTres.addItem(codigo.archivoPlatos.mostrarPlato.get(contador).getNombre());
                }
            }
            contador++;
        }
    }
    
    private void controlDias(){
        if(intento==1){
            codigo.archivoMenus.mostrarPlato.clear();
            /*añadir a los arraylist*/
            cargarArryList(); 
            archivo.añadirMenu("Lunes", almuerzo, cena, Bebidas, Postre);
            almuerzo.clear();cena.clear();Bebidas.clear();Postre.clear();
            dia.setText("Martes");
        }
        if(intento==2){
            /*añadir a los arraylist*/
            cargarArryList(); 
            archivo.añadirMenu("Martes", almuerzo, cena, Bebidas, Postre);
            almuerzo.clear();cena.clear();Bebidas.clear();Postre.clear();
            dia.setText("Miercoles");
        }
        if(intento==3){
            /*añadir a los arraylist*/
            cargarArryList(); 
            archivo.añadirMenu("Miercoles", almuerzo, cena, Bebidas, Postre);
            almuerzo.clear();cena.clear();Bebidas.clear();Postre.clear();
            dia.setText("Jueves");
        }
        if(intento==4){
            /*añadir a los arraylist*/
            cargarArryList(); 
            archivo.añadirMenu("Jueves", almuerzo, cena, Bebidas, Postre);
            almuerzo.clear();cena.clear();Bebidas.clear();Postre.clear();
            dia.setText("Viernes");
        }
        if(intento==5){
            /*añadir a los arraylist*/
            cargarArryList(); 
            archivo.añadirMenu("Viernes", almuerzo, cena, Bebidas, Postre);
            almuerzo.clear();cena.clear();Bebidas.clear();Postre.clear();
            dia.setText("Sabado");
        }
        if(intento==6){
            /*añadir a los arraylist*/
            cargarArryList(); 
            archivo.añadirMenu("Sabado", almuerzo, cena, Bebidas, Postre);
            almuerzo.clear();cena.clear();Bebidas.clear();Postre.clear();
            dia.setText("Domindo");
        }
        if (intento==7){
            /*añadir a los arraylist*/
            cargarArryList(); 
            archivo.añadirMenu("Domingo", almuerzo, cena, Bebidas, Postre);
            almuerzo.clear();cena.clear();Bebidas.clear();Postre.clear();
            //dia.setText("Dia");
            JOptionPane.showMessageDialog(null, "Menu de la Semana Creado");
            archivo.crear(archivo.mostrarPlato);
            Aceptar.setEnabled(true);
        }        
        intento++;
        if (intento==8){
            dia.setText("Lunes");
            intento=1;            
        }
    }
    
    private void cargarArryList(){
            almuerzo.add((String) primerAlmuerzo.getSelectedItem());
            almuerzo.add((String) segundoAlmuerzo.getSelectedItem());
            almuerzo.add((String) tercerAlmerzo.getSelectedItem());
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
}