                                                                                                                                                                                        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaDeReserva.Vistas;

import SistemaDeReserva.Ciudad;
import SistemaDeReserva.CiudadData;
import SistemaDeReserva.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arguss
 */
public class ABMCiudades extends javax.swing.JInternalFrame {
private CiudadData ciudadData;
private Conexion conexion;



    /**
     * Creates new form ABMCiudad
     */
    public ABMCiudades() {
        initComponents();
    try {
        conexion = new Conexion("jdbc:mysql://localhost/sistemadereserva", "root", "");
        ciudadData = new CiudadData(conexion);
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ABMCiudades.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btguardarabmciudad = new javax.swing.JButton();
        btborrarabmciudad = new javax.swing.JButton();
        btlimpiarabmciudad = new javax.swing.JButton();
        btactualizarabmciudad = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("ABM CIUDAD");

        jLabel1.setText("ID CIUDAD:");

        jLabel2.setText("NOMBRE CIUDAD:");

        jLabel3.setText("NOMBRE PAIS:");

        btguardarabmciudad.setText("GUARDAR");
        btguardarabmciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarabmciudadActionPerformed(evt);
            }
        });

        btborrarabmciudad.setText("BORRAR");
        btborrarabmciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btborrarabmciudadActionPerformed(evt);
            }
        });

        btlimpiarabmciudad.setText("LIMPIAR");
        btlimpiarabmciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarabmciudadActionPerformed(evt);
            }
        });

        btactualizarabmciudad.setText("ACTUALIZAR");
        btactualizarabmciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactualizarabmciudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2)))
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btguardarabmciudad)
                        .addGap(28, 28, 28)
                        .addComponent(btborrarabmciudad)
                        .addGap(18, 18, 18)
                        .addComponent(btactualizarabmciudad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3)
                        .addGap(87, 87, 87)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btlimpiarabmciudad))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btguardarabmciudad)
                    .addComponent(btborrarabmciudad)
                    .addComponent(btlimpiarabmciudad)
                    .addComponent(btactualizarabmciudad))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btguardarabmciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarabmciudadActionPerformed
        // TODO add your handling code here:
        String nombreCiudad=jTextField2.getText();
        String nombrePais=jTextField3.getText();
        
        Ciudad ciudad = new Ciudad(nombreCiudad, nombrePais);
        ciudadData.guardarCiudad(ciudad);
        
        jTextField1.setText(ciudad.getId_ciudad()+"");
    }//GEN-LAST:event_btguardarabmciudadActionPerformed

    private void btborrarabmciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btborrarabmciudadActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jTextField1.getText());
        ciudadData.borrarCiudad(id);
    }//GEN-LAST:event_btborrarabmciudadActionPerformed

    private void btactualizarabmciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactualizarabmciudadActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText()!=null){
            String nombreCiudad=jTextField2.getText();
            String nombrePais=jTextField3.getText();
            
            Ciudad ciudad=new Ciudad(Integer.parseInt(jTextField1.getText()), nombreCiudad, nombrePais);
            ciudadData.actualizarCiudad(ciudad);
        }
        
    }//GEN-LAST:event_btactualizarabmciudadActionPerformed

    private void btlimpiarabmciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarabmciudadActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_btlimpiarabmciudadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btactualizarabmciudad;
    private javax.swing.JButton btborrarabmciudad;
    private javax.swing.JButton btguardarabmciudad;
    private javax.swing.JButton btlimpiarabmciudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}