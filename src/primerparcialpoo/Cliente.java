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
     /*Metodo mostrarCliente*/
    public void mostrarCliente(){
        System.out.println("ID: " + idCliente);
        System.out.println("\tNombre:   " + nombreCliente);
        System.out.println("\tApellido: " + apellidoCliente);
        System.out.println("\tDUI:      " + duiCliente);
        System.out.println("\tTarjeta:  " + tarjetaCliente);
    }
/*Método cCliente con sus variables*/
    public Cliente(int idCliente, String nombreCliente, String apellidoCliente, String duiCliente, String tarjetaCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.duiCliente = duiCliente;
        this.tarjetaCliente = tarjetaCliente;
    }

   
    /*Getters y Setters de la clase Usuario*/
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDuiCliente() {
        return duiCliente;
    }

    public void setDuiCliente(String duiCliente) {
        this.duiCliente = duiCliente;
    }

    public String getTarjetaCliente() {
        return tarjetaCliente;
    }

    public void setTarjetaCliente(String tarjetaCliente) {
        this.tarjetaCliente = tarjetaCliente;
    }
    
}