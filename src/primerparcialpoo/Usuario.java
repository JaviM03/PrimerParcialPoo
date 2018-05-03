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
public class Usuario {

    /*Atributos de la clase Usuario*/
    private String nombre;
    private String apellido;
    private String telefono;
    private String DUI;
    private String numTargeta;

 /*Creando el Contructor que tiene el mismo nombre de la clase*/
 /*Contructor de Usuario*/
    
    public Usuario(){
        
    }
    public Usuario(String nombre, String apellido, String telefono, String DUI, String numTargeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.DUI = DUI;
        this.numTargeta = numTargeta;
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
