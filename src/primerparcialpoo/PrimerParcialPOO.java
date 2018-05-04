/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;
import java.util.Scanner;


public class PrimerParcialPOO {
    
    public static void main(String[] args) {
        //Paquete paquete = new Paquete();
        //DistriHotel distriHotel = new DistriHotel();
        //Cliente cliente = new Cliente();
        DistriHotel prueba = new DistriHotel();
        
        Servicio Basico = new Servicio("Basico", "piscina, internet ilimitado", 10, false);
        Servicio Premiun = new Servicio("Premiun", "incluye acceso a buffet de\n" +
        "desayuno, acceso ilimitado a la piscina, servicio a la habitaciÃ³n, acceso ilimitado al minibar,\n" +
        "acceso a internet ilimitado", 150, true);


    }
    
}
