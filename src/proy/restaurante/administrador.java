/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy.restaurante;

/**
 *
 * @author josep
 */
public class administrador extends javax.swing.JFrame {

    
    /**
     * Creates new form administrador
     */
    public administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        Abrir_panel1();
        Abrir_panel2();
        Abrir_panel3();
        Abrir_panel4();
    }
    Interfaces_administrador.mesas panel1;
    Interfaces_administrador.menu panel2;
    Interfaces_administrador.Informes panel3;
    Interfaces_administrador.meseros panel4;
    
    private String vp1="0";
    private String vp2="0";
    private String vp3="0";
    private String vp4="0";
    
    private void Abrir_panel1(){
        if(vp1.equals("0")){
        panel1=new Interfaces_administrador.mesas();
        principal.addTab("cantidad mesas", panel1);
        principal.setSelectedComponent(panel1);
        }else{
        principal.setSelectedComponent(panel1);
        }
        vp1="1";
    }
    private void Abrir_panel2(){
        if(vp2.equals("0")){
        panel2=new Interfaces_administrador.menu();
        principal.addTab("menu", panel2);
        principal.setSelectedComponent(panel2);
        }else{
        principal.setSelectedComponent(panel2);
        }
        vp2="1";
    }
    private void Abrir_panel3(){
        if(vp3.equals("0")){
        panel3=new Interfaces_administrador.Informes();
        principal.addTab("Informes", panel3);
        principal.setSelectedComponent(panel3);
        }else{
        principal.setSelectedComponent(panel3);
        }
        vp3="1";
    }
    private void Abrir_panel4(){
        if(vp4.equals("0")){
        panel4=new Interfaces_administrador.meseros();
        principal.addTab("meseros", panel4);
        principal.setSelectedComponent(panel4);
        }else{
        principal.setSelectedComponent(panel4);
        }
        vp4="1";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        administrador obt =new administrador();
        obt.setVisible(true);
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane principal;
    // End of variables declaration//GEN-END:variables
}
