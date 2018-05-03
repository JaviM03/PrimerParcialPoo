/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;


public class DistriHotel{

    public boolean disponible;
    
    //ArrayList
    public ArrayList <String> piso = new ArrayList <String>();
    public ArrayList <Integer> habitacion = new ArrayList <Integer>();
    
    
    public DistriHotel() {
        //generando los primero 6 pisos
        for (int i =65;i<=70;i++){
            String valor = Character.toString((char)i);
            piso.add(valor);
        }
        //generando las 10 habitaciones
        for (int j=1;j<=11;j++){
            habitacion.add(j);
        }
    }
    
    //METODOS
    public void Agregar(String floor){
        if (piso.contains(floor)){
            System.out.println("Piso existente");
        }
        else{
            piso.add(floor);  
        }     
    }
    public void Agregar(String floor, int room){
        if (piso.contains(floor)){
            
            if (habitacion.contains(room)){
                System.out.println("Habitacion existente");
            }
            else{
                piso.add(floor);  
            } 
        }
        else{
           System.out.println("Piso no existe"); 
        }
    }
    
    public void Eliminar(String floor){
        if (piso.contains(floor)){
            piso.remove(floor);
        }
        else{
            System.out.println("Piso no existe");
        }
        
    }
    public void Eliminar(String floor, int room){
        if (piso.contains(floor)){
            if (habitacion.contains(room)){
                habitacion.remove(room);
            }
            else{
                System.out.println("Habitacion no existe");
            }
        }
        else{
            System.out.println("piso no existe");
        }
         
    }
    public void Modificar(){
        
    }
    
    
}
