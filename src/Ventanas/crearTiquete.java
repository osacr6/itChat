package Ventanas;


import tiquetes.Usuario;
import javax.swing.JOptionPane;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author d.murillo.porras
 */
public class crearTiquete extends javax.swing.JFrame {

    
    public crearTiquete() {
        initComponents();
         setTitle("Tiquete de Usuario");
         setLocationRelativeTo(null);
         setResizable(false);
         jRadioButton1.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jlabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtid = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jlabel2 = new javax.swing.JLabel();
        Btnaceptar = new javax.swing.JButton();
        Btncancelar = new javax.swing.JButton();
        txtTexto = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tiquete");

        jlabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabel1.setText("Nombre de usuario");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtid.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jlabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabel2.setText("Descripcion del tiquete");

        Btnaceptar.setText("Aceptar");
        Btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnaceptarActionPerformed(evt);
            }
        });

        Btncancelar.setText("Cancelar");
        Btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncancelarActionPerformed(evt);
            }
        });

        txtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Estado");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setText("Activo");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton2.setText("Inactivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btnaceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btncancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jlabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btnaceptar)
                            .addComponent(Btncancelar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /*git*/
     /*git2*/
      private void limpiartxt(){
    txtNombre.setText("");
    txtID.setText("");
    txtTexto.setText("");
    }
      
      private void volverChat(){
          
      chat acceso = new chat();
       acceso.setVisible(true);
       this.setVisible(false);
      }
      
      
      private void agregar(){
            try{
        if ((txtNombre.getText().equals("")) && (txtID.getText().equals("0"))
                && (txtTexto.getText().equals(""))) {
             JOptionPane.showMessageDialog(null, "Hay campos en blanco, revise!",
                        "Campos en blanco", JOptionPane.ERROR_MESSAGE);
         } else {
              Usuario a = new Usuario();
              a.setUsuario(txtNombre.getText());
              a.setId(Integer.parseInt(String.valueOf(txtID.getText())));
              a.setDescripcion(txtTexto.getText());
              if (jRadioButton1.isSelected()) {
                    a.setEstado("Activo");
                } else if (jRadioButton2.isSelected()) {
                    a.setEstado("Inactivo");
                }
            DataOutputStream Userdatos = new DataOutputStream(new FileOutputStream("tiquete.dat", true));
            Userdatos.writeUTF(a.getUsuario());
            Userdatos.writeInt(a.getId());
            Userdatos.writeUTF(a.getDescripcion());
            Userdatos.writeUTF(a.getEstado());
              JOptionPane.showMessageDialog(null,
                        "Se guardaron los correctamente", "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
                 limpiartxt();
                Userdatos.close();
                volverChat();
        }
     }catch (Exception e){
      JOptionPane.showMessageDialog(null,
                    "Ocurrió un error al escribir el registro de datod" + "\n\n" + e.getMessage());
     }
         
      }
     
   
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void BtnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnaceptarActionPerformed
         agregar();
         limpiartxt();   
    }//GEN-LAST:event_BtnaceptarActionPerformed
    
    private void BtncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncancelarActionPerformed
        int opcion;

        opcion =JOptionPane.showConfirmDialog(null,
            "Desea salir?","Salir del sistema",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (opcion == 0) {
       System.exit(0);
       }
    }//GEN-LAST:event_BtncancelarActionPerformed

    private void txtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTextoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(crearTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearTiquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnaceptar;
    private javax.swing.JButton Btncancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTexto;
    private javax.swing.JLabel txtid;
    // End of variables declaration//GEN-END:variables
}
