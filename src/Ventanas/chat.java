package Ventanas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;
import java.util.List;

import datos.*;
import Chat.Mensajes;
import Chat.watson;
import com.ibm.watson.assistant.v2.model.MessageResponse;
import com.ibm.watson.assistant.v2.model.RuntimeResponseGeneric;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

/**
 *
 * @author d.murillo.porras
 */
public class chat extends javax.swing.JFrame {
    private utilidades utilidades = new utilidades();
    private archivo datos = new archivo();
    private ArrayList<String[]> listaRespuestas = datos.leerArchivoCSV("respuestas");
    private Mensajes mensajes = new Mensajes();
    private watson asistente = new watson();
    private MessageResponse contexto = null;
    
    private boolean usuarioActivo  = false;
            
    /**
     * Creates new form chat
     */
    public chat() {
        initComponents();
        this.setLocationRelativeTo(null); // center screen
        this.setResizable(false);
        mensajeTextArea.setLineWrap(true);
        chatPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        
        reponder("Hola");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chatPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensajeTextArea = new javax.swing.JTextArea();
        enviarButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        logInMenu = new javax.swing.JMenu();
        tktMenu = new javax.swing.JMenu();
        adminPreguntas1 = new javax.swing.JMenu();
        adminTkt = new javax.swing.JMenu();
        adminPreguntas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        chatPanel.setBackground(new java.awt.Color(255, 255, 255));
        chatPanel.setPreferredSize(new java.awt.Dimension(700, 500));

        javax.swing.GroupLayout chatPanelLayout = new javax.swing.GroupLayout(chatPanel);
        chatPanel.setLayout(chatPanelLayout);
        chatPanelLayout.setHorizontalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        chatPanelLayout.setVerticalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        mensajeTextArea.setColumns(20);
        mensajeTextArea.setLineWrap(true);
        mensajeTextArea.setRows(3);
        mensajeTextArea.setWrapStyleWord(true);
        mensajeTextArea.setAutoscrolls(false);
        mensajeTextArea.setRequestFocusEnabled(false);
        mensajeTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mensajeTextAreaMousePressed(evt);
            }
        });
        mensajeTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mensajeTextAreaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(mensajeTextArea);

        enviarButton.setText("Enviar");
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });

        logInMenu.setText("IngresarDatos");
        logInMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logInMenuMousePressed(evt);
            }
        });
        logInMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(logInMenu);

        tktMenu.setText("Crear Tiquete");
        tktMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tktMenuMousePressed(evt);
            }
        });
        jMenuBar1.add(tktMenu);

        adminPreguntas1.setText("Contactar Soporte ");
        adminPreguntas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adminPreguntas1MousePressed(evt);
            }
        });
        jMenuBar1.add(adminPreguntas1);

        adminTkt.setText("Administrar Tiquetes");
        jMenuBar1.add(adminTkt);

        adminPreguntas.setText("Administrar Preguntas");
        adminPreguntas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adminPreguntasMousePressed(evt);
            }
        });
        jMenuBar1.add(adminPreguntas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(enviarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(enviarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void reponder(String mensaje){
        if(contexto != null && contexto.getContext() != null) {
            contexto = asistente.getRespuesta(mensaje, contexto.getContext());
        } else {
            contexto = asistente.getRespuesta(mensaje);
        }
        
        List<RuntimeResponseGeneric> respuestas = contexto.getOutput().getGeneric();
        for (int i = 0; i < respuestas.size(); i++) {
            RuntimeResponseGeneric respuesta = respuestas.get(i);
            String respuestaTexto = respuesta.text();
            
            if(respuestaTexto.contains("##")) {
                String[] linea = datos.BuscarDato(respuestaTexto, 0, listaRespuestas);
                if(linea != null && linea.length > 0) {
                    String[] respuestaArchivo = linea[1].split("#NL");
                    for (int j = 0; j < respuestaArchivo.length; j++) {
                        mensajes.setMensaje(respuestaArchivo[j], "bot");
                    }
                }
            } else {
                mensajes.setMensaje(respuestaTexto, "bot");
            }
        }
        
        if(
            contexto.getOutput().getIntents().size() > 0 &&
            contexto.getOutput().getIntents().get(0).intent().equals("ReportIssue")
        ){
            mensajes.crearTktOpcion(this);
        }
        
        this.render(mensajes.getMensajesPanel());
    }
    
    public void render(JPanel mainPanel) {
        usuarioActivo = false;
        JScrollPane scrollPanel = new JScrollPane( mainPanel,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );
        scrollPanel.setBorder(null);
        scrollPanel.setPreferredSize(new Dimension(chatPanel.getSize().width, chatPanel.getSize().height));

        chatPanel.removeAll();
        chatPanel.add(scrollPanel);
        chatPanel.revalidate();
        chatPanel.repaint();
        mensajeTextArea.selectAll();
        mensajeTextArea.replaceSelection("");
        mensajeTextArea.requestFocus();

        // scroll to bottom
        scrollPanel.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() { 
            public void adjustmentValueChanged(AdjustmentEvent e) {  
                if(!usuarioActivo) {
                     e.getAdjustable().setValue(e.getAdjustable().getMaximum());  
                }
            }
        });
        
        utilidades.setTimeout(() -> usuarioActivo = true, 1000);
    }
    
    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        // TODO add your handling code here:
        String mensaje = mensajeTextArea.getText().replaceAll("[\\n\\t]", "");
        
        if("".equals(mensaje.replaceAll("\\s", ""))) {
            mensajeTextArea.selectAll();
            mensajeTextArea.replaceSelection("");
            return;
        }

        mensajes.setMensaje(mensaje);
        reponder(mensaje);
    }//GEN-LAST:event_enviarButtonActionPerformed

    private void mensajeTextAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mensajeTextAreaMousePressed
        // TODO add your handling code here:
         mensajeTextArea.requestFocus();
    }//GEN-LAST:event_mensajeTextAreaMousePressed

    private void mensajeTextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mensajeTextAreaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enviarButton.doClick();
        }
    }//GEN-LAST:event_mensajeTextAreaKeyPressed

    private void logInMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMenuMousePressed
        // TODO add your handling code here:
        new login().setVisible(true);
    }//GEN-LAST:event_logInMenuMousePressed

    private void tktMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tktMenuMousePressed
        // TODO add your handling code here:
        new crearTiquete().setVisible(true);
        
    }//GEN-LAST:event_tktMenuMousePressed

    private void adminPreguntasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPreguntasMousePressed
        // TODO add your handling code here:
        //datos.crearArchivoCSV("copiadeistapreguntas", listaRespuestas);
        new preguntasAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adminPreguntasMousePressed

    private void logInMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logInMenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opcion;

        opcion =JOptionPane.showConfirmDialog(null,
            "Desea salir?","Salir del sistema",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if (opcion == 0) {
       System.exit(0);
       }
    }//GEN-LAST:event_formWindowClosing

    private void adminPreguntas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPreguntas1MousePressed
        contactarSoporte c = new contactarSoporte();
        c.inicializarCliente();
    }//GEN-LAST:event_adminPreguntas1MousePressed

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
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JMenu adminPreguntas;
    protected javax.swing.JMenu adminPreguntas1;
    protected javax.swing.JMenu adminTkt;
    private javax.swing.JPanel chatPanel;
    private javax.swing.JButton enviarButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu logInMenu;
    private javax.swing.JTextArea mensajeTextArea;
    private javax.swing.JMenu tktMenu;
    // End of variables declaration//GEN-END:variables
}
