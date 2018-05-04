/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author marym
 */
public class Usuario {
    private String Nombre;
    private String Password;
    private String Tipo;
    private Usuario ListaUsuario;
   
    public Usuario() {}
    
    public Usuario (String nombre, String password, String tipo){
        this.Nombre = nombre;
        this.Password = password;
        this.Tipo=tipo;
    }
    
    //GETTERS

    public String getNombre() {
        return Nombre;
    }

    public String getPassword() {
        return Password;
    }

    public String getTipo() {
        return Tipo;
    }
    
    //SETTERS

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    //METODOS
    
    public void AgregarUsuario(){
        //
    }
    
    public void EliminarUsuario(){
        //
    }
    
    public void ModificarUsuario(){
        //
    }
}
