/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author d.murillo.porras
 */
public class Mensajes {
    private int num = 0;
    private JPanel[] chatList = new JPanel[100];
    private JPanel mainPanel = new JPanel(new GridLayout(0, 1));    

    public Mensajes() {
    }
    
    public void setMensaje(String text) {
        this.setMensaje("", text);
    }
    
    public void setMensaje(String user ,String text) {
        mainPanel = new JPanel(new GridLayout(0, 1));
        mainPanel.setBackground(Color.WHITE);
    
        JPanel msjpanel = new JPanel();
        msjpanel.setPreferredSize( new Dimension(600, 100) );
        msjpanel.setBorder(new LineBorder(Color.WHITE, 10, true));
        
        JLabel imgLabel = new JLabel();
        JLabel msjLabel = new JLabel();
        
        if(user == "bot") {
            msjpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
            msjpanel.setBackground(new java.awt.Color(240, 255, 255));
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/robot-icon.png")));
            msjpanel.add(imgLabel);
            msjLabel.setText("    " + text);
            msjpanel.add(msjLabel);
        } else {
            msjpanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
            msjpanel.setBackground(new java.awt.Color(240, 240, 240));
            imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/person-icon.png")));
            msjLabel.setText(text + "    ");
            msjpanel.add(msjLabel);
            msjpanel.add(imgLabel);
        }

        chatList[num] = msjpanel;
        num++;
        
        for (int i = 0; i < num; i++) {
            if(i % 2 == 0) {
                mainPanel.add(chatList[i]);
            } else {
                mainPanel.add(chatList[i]);
            }
        }
    }
    
    public JPanel getMensajesPanel(){
        return mainPanel;
    }
}
