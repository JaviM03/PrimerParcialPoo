/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Scanner;
;


public class DistriHotel {
    
    /*Se llama a la matriz Habitacion desde la clase Habitacion*/
    private ArrayList<ArrayList<Habitacion>> edificio = new ArrayList<>();
    private int cantPisos = 0; //i
    private int cantHabit = 0; //j

    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Reserva> listaReservas = new ArrayList<>();
    
    private Paquete paquetePremium = new Paquete(1, "PREMIUM", 150, "cosa1, cosa2, cosa3");
    private Paquete paqueteBasico  = new Paquete(2, "BASICO",  10,  "cosa1, cosa2, cosa3");
    
    private int contClientes = 0;
    private int contReservas = 0;

    private double costoSencilla = 85;
    private double costoDoble = 130;
    
    /*Metodo DistriHotel*/
    public DistriHotel(int cantPisos, int cantHabit) {

        this.cantPisos = cantPisos;
        this.cantHabit = cantHabit;
        System.out.println("Generando Hotel");
        ArrayList<Habitacion> filaAux = new ArrayList<>();

        for (int i = 0; i < this.cantPisos; i++) {
            for (int j = 0; j < this.cantHabit; j++) {
                filaAux.add(new Habitacion());
            }
            edificio.add(filaAux);
            filaAux = new ArrayList<>();
        }
        /*Metodo para hacer las reservas mediante Scanner*/
         public void hacerReserva() {
        contReservas++;
        Scanner entrada = new Scanner(System.in);
        
        Cliente cliente_reserva = null;
        NumeroHabitacion numero_habitacion_reserva;
        int tipoPaquete_reserva;
        int dias_estadia_reserva;
        double costoPorNoche;
        double costoTotal_reserva;
        
        String dui_cliente;
        String numero_habitacion_string; 

        System.out.println("\t\tHaciendo reserva # " + contReservas);
        
        //Pidiendo cliende por DUI
        while (cliente_reserva == null) {
            System.out.print("DUI Cliente: ");
            dui_cliente = entrada.nextLine();
            cliente_reserva = buscarClienteByDui(dui_cliente);
            if (cliente_reserva == null) {
                System.out.println("\t\tERROR: Cliente no registrado");
            } else {
                System.out.println("\t\tCliente encontrado");
            }
        }
        //pidiendo numero habitacion
        mostrarOcupadas();
        do{
            System.out.print("Numero habitacion: ");
            numero_habitacion_string = entrada.nextLine();
            numero_habitacion_reserva = new NumeroHabitacion(numero_habitacion_string);
            if(edificio.get(numero_habitacion_reserva.getPiso()).get(numero_habitacion_reserva.getHabitacion()).isOcupado()){
                System.out.println("\t\tERROR: Habitacion Ocupada");
            }else{
                ocuparHabitacion(numero_habitacion_reserva.getPiso(), numero_habitacion_reserva.getHabitacion());
                break;
            }
        }while(edificio.get(numero_habitacion_reserva.getPiso()).get(numero_habitacion_reserva.getHabitacion()).isOcupado());

    }
    
}
    