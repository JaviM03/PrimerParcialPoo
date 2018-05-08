/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mariana
 */


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
        
         //Pidiendo tipo Paquete
        System.out.println("Tipo Paquete: ");
        System.out.println("\t1. PREMIUM $"+paquetePremium.getCostoPaquete());
        System.out.println("\t2. BASICO  $"+paqueteBasico.getCostoPaquete());
        System.out.print("Seleccione: ");
        tipoPaquete_reserva = entrada.nextInt();
        
        //Pidiendo duracion de estadia
        System.out.print("Duracion de estadia en dias: ");
        dias_estadia_reserva = entrada.nextInt();
        
        //Calculando Costo por noche
        costoPorNoche = (tipoPaquete_reserva == 1? paquetePremium.getCostoPaquete() : paqueteBasico.getCostoPaquete()) + (numero_habitacion_reserva.getHabitacion()%2 == 0? costoSencilla : costoDoble );
        
        //Calculando Costo total
        costoTotal_reserva = dias_estadia_reserva * costoPorNoche ;
        
        System.out.println("Costo por noche: $" + costoPorNoche);
        System.out.println("Costo total:     $" + costoTotal_reserva);
        
        listaReservas.add(new Reserva(
                contReservas, 
                cliente_reserva, 
                numero_habitacion_reserva, 
                tipoPaquete_reserva == 1? paquetePremium : paqueteBasico, 
                dias_estadia_reserva, 
                costoPorNoche, 
                costoTotal_reserva
        ));
        
    }
         /*Metodo mostrarReservas*/
         public void mostrarReservas() {
        System.out.println("\t\tMOSTRANDO RESERVAS");
        System.out.println("_________________________________________");
        for (int i = 0; i < listaReservas.size(); i++) {
            listaReservas.get(i).mostrarReserva();
            System.out.println("_________________________________________");
        }
    }
         /*Metodo registrarCliente*/
    public void registrarCliente() {
        contClientes++;
        listaClientes.add(new Cliente(contClientes));
    }
        /*Metodo mostrarClientes*/
    public void mostrarClientes() {
        System.out.println("\t\tMOSTRANDO CLIENTES");
        System.out.println("_________________________________________");
        for (int i = 0; i < listaClientes.size(); i++) {
            listaClientes.get(i).mostrarCliente();
            System.out.println("_________________________________________");
        }
    }

    public void agregarPiso() {
        //creeando piso antes de agregarlo

        cantPisos++;
        ArrayList<Habitacion> filaAux = new ArrayList<>();
        for (int i = 0; i < this.cantHabit; i++) {
            filaAux.add(new Habitacion());
        }
        //agregando piso al edificio
        edificio.add(filaAux);

    }
        /*Metodo agregarHabitación*/
    public void agregarHabitacion() {
        cantHabit++;
        for (int i = 0; i < cantPisos; i++) {
            edificio.get(i).add(new Habitacion());
        }
    }
        /*Metodo mostrarHotel*/
    public void mostrarHotel() {
        System.out.print("\t");
        for (int i = 1; i <= cantHabit; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("\t");
        for (int i = 1; i <= cantHabit; i++) {
            System.out.print("________");
        }
        System.out.println();
        for (int i = cantPisos - 1; i >= 0; i--) {
            System.out.print(base10_base26(i) + "\t|");
            for (int j = 0; j < cantHabit; j++) {
                System.out.print(edificio.get(i).get(j).isOcupado() + "\t");
            }
            System.out.println();
        }

    }
        /*Metodo OcuparHabitación*/
    public void ocuparHabitacion(int piso, int habitacion) {
        if (edificio.get(piso).get(habitacion).isOcupado() == true) {
            System.out.println("Habitacion ocupada");
        } else {
            edificio.get(piso).get(habitacion).setOcupado(true);
        }
    }
        /*Metodo desocuparHabitacion*/
    public void desocuparHabitacion(int piso, int habitacion) {
        if (edificio.get(piso).get(habitacion).isOcupado() == false) {
            System.out.println("Habitacion desocupada");
        } else {
            edificio.get(piso).get(habitacion).setOcupado(false);
        }
    }

    }
    
}
    