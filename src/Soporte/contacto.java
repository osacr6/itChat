/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soporte;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author d.murillo.porras
 */
public class contacto {
    
    private static final String HOST = "localhost";
    private static final int PUERTO = 3000;
    private Socket sc;
    private DataOutputStream salida;
    private DataInputStream entrada;
    private String mensajeRecibido = "";

    public contacto() {
        try {
            Scanner lectura = new Scanner(System.in);
            sc = new Socket(HOST, PUERTO);
            salida = new DataOutputStream(sc.getOutputStream());
            entrada = new DataInputStream(sc.getInputStream());
            String mensaje = "";
            while (!mensaje.equals("x")) {
                System.out.println("Digite su mensaje para enviar:");
                mensaje = lectura.nextLine();
                salida.writeUTF(mensaje);
                mensajeRecibido = entrada.readUTF();
                System.out.println(mensajeRecibido);
            }
        } catch (IOException ex) {
            System.out.println("Error durante la conexión!"
                    + ex.getMessage());
        }
    }
}
