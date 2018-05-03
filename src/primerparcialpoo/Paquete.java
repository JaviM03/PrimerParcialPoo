/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package primerparcialpoo;

public class Paquete {
    public String nombre;
    public double costo;
    public Servicio servicio;
    
    public Paquete() {}
    
    public Paquete (String nombre, double costo, Servicio servicio){
        this.nombre = nombre;
        this.costo=costo;
        this.servicio=servicio;
    }
    
    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public Servicio getServicio() {
        return servicio;
    }
    
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    //METODOS
    public void Agregar( ){
        //
    }
    
    public void Eliminar(){
        //
    }
    
    public void Modificar(){
        
    }
    
}
*/