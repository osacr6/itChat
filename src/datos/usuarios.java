/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import Usuarios.usuario;

/**
 *
 * @author d.murillo.porras
 */
public class usuarios {
    private usuario NuevoUsuario = null;

    public usuarios() {
    }
    
    public usuario consultar(String cedula) {
        
        String nom, primAp, segAp, ced, email;
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream("Datos_Clientes.dat"));
            try {
                while (true) {
                    nom = entrada.readUTF();
                    primAp = entrada.readUTF();
                    segAp = entrada.readUTF();
                    ced = entrada.readUTF();
                    email = entrada.readUTF();
                    if (ced.equals(cedula)) {
                        NuevoUsuario = new usuario(
                            nom,
                            primAp,
                            segAp,
                            ced,
                            email
                        );
                    }
                }
            } catch (EOFException ex) {
                entrada.close();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "¡El archivo no existe!", "Archivo no existe",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "¡Error desconocido!", "Error desconocido",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        return NuevoUsuario;
    }
    
}
