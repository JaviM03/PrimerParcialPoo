/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
 
package primerparcialpoo;

public class Paquete {
    private int tipoPaquete;
    private String nombrePaquete;
    private double costoPaquete;
    private String listaServicioPaquete;

    /*Constructor Paquete con parametros de la clase Paquete*/
    public Paquete(int tipoPaquete, String nombrePaquete, double costoPaquete, String listaServicioPaquete) {
        this.tipoPaquete = tipoPaquete;
        this.nombrePaquete = nombrePaquete;
        this.costoPaquete = costoPaquete;
        this.listaServicioPaquete = listaServicioPaquete;
    }
    /*Método mostrarPaquete*/
    public void mostrarPaquete(){
        System.out.println("Tipo: "+tipoPaquete);
        System.out.println("\tNombre:  "+nombrePaquete);
        System.out.println("\tCosto:   $"+costoPaquete);
        System.out.println("\tLista:   "+listaServicioPaquete);
        System.out.println("-------------------------------------------------------------------");
    }
    
    
    
}
