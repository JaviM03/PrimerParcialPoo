/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.Scanner;

public class PrimerParcialPOO {

    public static void main(String[] args) {
        Servicio Basico = new Servicio("Basico", "piscina, internet ilimitado", 10, false);
        Servicio Premiun = new Servicio("Premiun", "incluye acceso a buffet de\n"
                + "desayuno, acceso ilimitado a la piscina, servicio a la habitación, acceso ilimitado al minibar,\n"
                + "acceso a internet ilimitado", 150, true);
        DistriHotel prueba = new DistriHotel();
        prueba.desocuparHabitacion(1, 1);
        prueba.mostrarHotel();
    }
}
