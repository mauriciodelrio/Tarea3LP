/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3lpfinal;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author Mauricio
 */
public class elegir_plagiamon extends javax.swing.JFrame {

    /**
     * Creates new form elegir_plagiamon
     */
    ArrayList <Entrenador> listafinal=new ArrayList <>();
    
    public ArrayList <Entrenador> getListaFinal(){
    
        return listafinal;
    }
    
    public elegir_plagiamon() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Plagiamon");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/plagiamon.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/plagiamon.png"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Comenzar!");
        jButton1.setPreferredSize(new java.awt.Dimension(85, 23));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jCheckBox1.setText("Vaporito");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Lavarax");

        jCheckBox3.setText("Calabalantern");

        jCheckBox4.setText("Fogatin");

        jCheckBox5.setText("Algarax");

        jCheckBox6.setText("Cactaria");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("INGRESE NOMBRE DE JUGADOR");

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Elija SOLO 3 plagiamones");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addComponent(jLabel1))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6))
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(181, 181, 181))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        int contador_box=0;
        if(jCheckBox1.isSelected()==true){
        
            contador_box+=1;
            
        }
        if(jCheckBox2.isSelected()==true){
        
            contador_box+=1;
        }
        if(jCheckBox3.isSelected()==true){
        
            contador_box+=1;
        }
        if(jCheckBox4.isSelected()==true){
        
            contador_box+=1;
        }
        if(jCheckBox5.isSelected()==true){
        
            contador_box+=1;
        }
        if(jCheckBox6.isSelected()==true){
        
            contador_box+=1;
        }
        
        if(contador_box>3 || contador_box<3){
        
            JOptionPane.showMessageDialog(null,"DEBES SELECCIONAR TRES PLAGIAMONES");
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
            jCheckBox5.setSelected(false);
            jCheckBox6.setSelected(false);
        }
        
        if(contador_box==3){
        
            //sigue el codigo
            String cadena;
            cadena = jTextField1.getText();
            JOptionPane.showMessageDialog(null,"tu nombre es: " + cadena);
            Random  rnd = new Random();
            Jugador yo= new Jugador(cadena);
            if(jCheckBox1.isSelected()==true){

                //Crear vaporito
                Vaporito vapi= new Vaporito(18);
                yo.addPlagiamon(vapi);
            }
            if(jCheckBox2.isSelected()==true){
                Lavarax lavi= new Lavarax(18);
                yo.addPlagiamon(lavi);
                //Crear lavarax
            }
            if(jCheckBox3.isSelected()==true){
                Calabalantern cali= new Calabalantern(18);
                yo.addPlagiamon(cali);
                //Calabalantern
            }
            if(jCheckBox4.isSelected()==true){
                Fogatin fogi= new Fogatin(18);
                yo.addPlagiamon(fogi);
                //Fogatin
            }
            if(jCheckBox5.isSelected()==true){
                Algarax algi= new Algarax(18);
                yo.addPlagiamon(algi);
                //Algarax
            }
            if(jCheckBox6.isSelected()==true){
                Cactaria cacti= new Cactaria(18);
                yo.addPlagiamon(cacti);
                //Cactaria
            }
            JOptionPane.showMessageDialog(null,"plag1 es: " + yo.getPlagiamon().getNombre());
            int entero1=Math.abs(rnd.nextInt()%9);
            int entero2=Math.abs(rnd.nextInt()%9);
            int entero3=Math.abs(rnd.nextInt()%9);
            JOptionPane.showMessageDialog(null,"numero es: " + entero1);
            JOptionPane.showMessageDialog(null,"numero es: " + entero2);
            JOptionPane.showMessageDialog(null,"numero es: " + entero3);
            
            String [] nombres={"cartman", "kyle", "stan", "kenny", "mcKay", "ms Garrison", "timmy", "tweak", "Chef"};
            String nombre1=nombres[entero1];
            String nombre2= nombres[entero2];
            String nombre3= nombres[entero3];
            
            JOptionPane.showMessageDialog(null,"enemigo 1 es: " + nombre1);
            JOptionPane.showMessageDialog(null,"enemigo 2 es: " + nombre2);
            JOptionPane.showMessageDialog(null,"enemigo 3 es: " + nombre3);
            Enemigo enem1= new Enemigo(nombre1);
            Enemigo enem2= new Enemigo(nombre2);
            Enemigo enem3= new Enemigo(nombre3);
            int enteroP;
            for (int i=0;i<2;i++){
                
               enteroP =Math.abs(rnd.nextInt()%6)+1;
               if(enteroP==1){
                   //crear Vaporito
                   Vaporito nuevov = new Vaporito(9);
                   enem1.addPlagiamon(nuevov);  
               }
               if(enteroP==2){
                   //crear Algarax
                    Algarax nuevoa = new Algarax(9);
                    enem1.addPlagiamon(nuevoa);
               
               }
               if(enteroP==3){
                   //Crear Lavarax
                    Lavarax nuevol = new Lavarax(9);
                    enem1.addPlagiamon(nuevol);               
               }
               if(enteroP==4){
                   //Crear Cactaria
                    Cactaria nuevoc = new Cactaria(9);
                    enem1.addPlagiamon(nuevoc);               
               }
               if(enteroP==5){
                   //Crear Calabalantern
                    Calabalantern nuevoca = new Calabalantern(9);
                    enem1.addPlagiamon(nuevoca);               
               }
               if(enteroP==6){
                   //Crear Fogatin
                    Fogatin nuevof = new Fogatin(9);
                    enem1.addPlagiamon(nuevof);        
               }
               
            }
            
            for (int i=0;i<2;i++){
                
               enteroP =Math.abs(rnd.nextInt()%6)+1;
               if(enteroP==1){
                   //crear Vaporito
                   Vaporito nuevov = new Vaporito(9);
                   enem2.addPlagiamon(nuevov);  
               }
               if(enteroP==2){
                   //crear Algarax
                    Algarax nuevoa = new Algarax(9);
                    enem2.addPlagiamon(nuevoa);
               
               }
               if(enteroP==3){
                   //Crear Lavarax
                    Lavarax nuevol = new Lavarax(9);
                    enem2.addPlagiamon(nuevol);               
               }
               if(enteroP==4){
                   //Crear Cactaria
                    Cactaria nuevoc = new Cactaria(9);
                    enem2.addPlagiamon(nuevoc);               
               }
               if(enteroP==5){
                   //Crear Calabalantern
                    Calabalantern nuevoca = new Calabalantern(9);
                    enem2.addPlagiamon(nuevoca);               
               }
               if(enteroP==6){
                   //Crear Fogatin
                    Fogatin nuevof = new Fogatin(9);
                    enem2.addPlagiamon(nuevof);        
               }
            }
            
            for (int i=0;i<2;i++){
                
               enteroP =Math.abs(rnd.nextInt()%6)+1;
               if(enteroP==1){
                   //crear Vaporito
                   Vaporito nuevov = new Vaporito(9);
                   enem3.addPlagiamon(nuevov);  
               }
               if(enteroP==2){
                   //crear Algarax
                    Algarax nuevoa = new Algarax(9);
                    enem3.addPlagiamon(nuevoa);
               
               }
               if(enteroP==3){
                   //Crear Lavarax
                    Lavarax nuevol = new Lavarax(9);
                    enem3.addPlagiamon(nuevol);               
               }
               if(enteroP==4){
                   //Crear Cactaria
                    Cactaria nuevoc = new Cactaria(9);
                    enem3.addPlagiamon(nuevoc);               
               }
               if(enteroP==5){
                   //Crear Calabalantern
                    Calabalantern nuevoca = new Calabalantern(9);
                    enem3.addPlagiamon(nuevoca);               
               }
               if(enteroP==6){
                   //Crear Fogatin
                    Fogatin nuevof = new Fogatin(9);
                    enem3.addPlagiamon(nuevof);        
               }
            }
            JOptionPane.showMessageDialog(null,"enemigo 1 plag: " + enem1.getPlagiamon().getNombre());
            JOptionPane.showMessageDialog(null,"enemigo 2 es: " + enem2.getPlagiamon().getNombre());
            JOptionPane.showMessageDialog(null,"enemigo 3 es: " + enem3.getPlagiamon().getNombre());
            listafinal.add(yo);
            listafinal.add(enem1);
            listafinal.add(enem2);
            listafinal.add(enem3);
        batalla ventana_batalla= new batalla(listafinal);
        ventana_batalla.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(elegir_plagiamon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elegir_plagiamon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elegir_plagiamon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elegir_plagiamon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new elegir_plagiamon().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
