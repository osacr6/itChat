/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Sebastian
 */
public class datosClientes {

    public void agregar(String nom, String primAp, String segAp, String ced, String email) {

        try {
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("Datos_Clientes.dat", true));
            salida.writeUTF(nom);
            salida.writeUTF(primAp);
            salida.writeUTF(segAp);
            salida.writeUTF(ced);
            salida.writeUTF(email);
            JOptionPane.showMessageDialog(null,
                    "¡Muchas gracias sus datos han sido agregados exitosamente!",
                    "Datos Agregados", JOptionPane.OK_OPTION);
            salida.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "¡Error al agregar!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
