/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author marielos
 */
public class Servicio {
/*Atributos de la clase Servicio*/
    private String listaServicio;
    private double costo;
    private boolean ilimitado;
    private String nombre;

 /*Creando el Contructor que tiene el mismo nombre de la clase*/
 /*Contructor de Usuario*/
    public Servicio(){
        
    }
    public Servicio(String listaServicio, double costo, boolean ilimitado, String nombre){
        this.listaServicio = listaServicio;
        this.costo = costo;
        this.ilimitado = ilimitado;
        this.nombre = nombre;
    }
 /*Getters y Setters de la clase Usuario*/
    public String getListaServicio(){
        return listaServicio;
    }
    public double getCosto(){
        return costo;
    }
    public boolean getIlimitado(){
        return ilimitado;
    }
    public String getNombre(){
        return nombre;
    }
    public void setListaServicio(String listaServicio){
        this.listaServicio = listaServicio;
    }
    public void setCosto(double costo){
        this.costo = costo;
    }
    public void setIlimitado(boolean ilimitado){
        this.ilimitado = ilimitado;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 
    public void agregarServicio(){
        
    }
    public void eliminarServicio(){
        
    }
    public void modificarServicio(){
        
    }
}
