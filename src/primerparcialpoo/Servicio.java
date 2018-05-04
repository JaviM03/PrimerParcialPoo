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
    private String nombreServicio;
    private String listaServicio;
    private double costo;
    private boolean ilimitado;

    /*Creando el Contructor que tiene el mismo nombre de la clase*/
 /*Contructor de Usuario*/
    public Servicio() {
    }

    public Servicio(String nombreServicio, String listaServicio, double costo, boolean ilimitado) {
        this.nombreServicio = nombreServicio;
        this.listaServicio = listaServicio;
        this.costo = costo;
        this.ilimitado = ilimitado;
    }

    /*Getters y Setters de la clase Usuario*/
    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getListaServicio() {
        return listaServicio;
    }

    public void setListaServicio(String listaServicio) {
        this.listaServicio = listaServicio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isIlimitado() {
        return ilimitado;
    }

    public void setIlimitado(boolean ilimitado) {
        this.ilimitado = ilimitado;
    }

}
