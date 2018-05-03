/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

public class Cliente {
    public String nombre,apellido,telefono,DUI;
    private String numeroTarjeta;
  
    public Cliente() {}
  
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDUI() {
        return DUI;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
   
   
}
