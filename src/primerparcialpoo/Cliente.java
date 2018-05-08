/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Cliente {
    private final int idCliente;
    private String nombreCliente; 
    private String apellidoCliente;
    private String duiCliente;
    private String tarjetaCliente;
    
    public Cliente(int idCliente){
        this.idCliente = idCliente;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Creando Cliente ");
        System.out.print("Nombre:   ");
        this.nombreCliente = entrada.nextLine();
        System.out.print("Apellido: ");
        this.apellidoCliente = entrada.nextLine();
        System.out.print("DUI:      ");
        this.duiCliente = entrada.nextLine();
        System.out.print("Tarjeta:  ");
        this.tarjetaCliente = entrada.nextLine();
    }

    public Cliente(int idCliente, String nombreCliente, String apellidoCliente, String duiCliente, String tarjetaCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.duiCliente = duiCliente;
        this.tarjetaCliente = tarjetaCliente;
    }

    /*Getters y Setters de la clase Usuario*/
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDui() {
        return DUI;
    }

    public String getNumTargeta() {
        return numTargeta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTel(String telefono) {
        this.telefono = telefono;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public void setNumeTargeta(String numTargeta) {
        this.numTargeta = numTargeta;

    }
}
