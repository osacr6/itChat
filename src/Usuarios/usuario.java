/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 */
public class usuario {
    private String Nombre;
    private String primApellido;
    private String segApellido;
    private String cedula;
    private String emai;

    public usuario(String Nombre, String primApellido, String segApellido, String cedula, String emai) {
        this.Nombre = Nombre;
        this.primApellido = primApellido;
        this.segApellido = segApellido;
        this.emai = emai;
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPrimApellido() {
        return primApellido;
    }

    public String getSegApellido() {
        return segApellido;
    }

    public String getEmai() {
        return emai;
    }

    public String getCedula() {
        return cedula;
    }
    
    
}
