/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Carlos Ruiz
 */
public class Administracion {

    private double costoDiaHabitacionS;
    private double costoDiaHabitacionD;
    private DistriHotel distriHotel = new DistriHotel();
    //private Reserva reserva = new Reserva();
    private Cliente cliente = new Cliente();
    private ArrayList<Cliente> listaCliente = new ArrayList<>();

    public Administracion() {
    }

    public double getCostoDiaHabitacionS() {
        return costoDiaHabitacionS;
    }

    public double getCostoDiaHabitacionD() {
        return costoDiaHabitacionD;
    }

    public void setCostoDiaHabitacionS(double costoDiaHabitacionS) {
        this.costoDiaHabitacionS = costoDiaHabitacionS;
    }

    public void setCostoDiaHabitacionD(double costoDiaHabitacionD) {
        this.costoDiaHabitacionD = costoDiaHabitacionD;
    }

    //-----------------------METODOS------------------------------------------
    
    //********Agregando nuevas reservas***************
    public void agregar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        cliente.setNombre(entrada.nextLine());
        System.out.println("Ingrese apellido:");
        cliente.setApellido(entrada.nextLine());
        System.out.println("Ingrese telefono:");
        cliente.setTel(entrada.nextLine());
        System.out.println("Ingrese dui:");
        cliente.setDUI(entrada.nextLine());
        System.out.println("Ingrese numero de targeta:");
        cliente.setNumeTargeta(entrada.nextLine());
        
        listaCliente.add(cliente);
        
    }
    //********Ver las reservas excistentes**************
    public void ver(){
        Cliente clienteAux;
        Iterator iter = listaCliente.iterator();
        while(iter.hasNext()){
            clienteAux = (Cliente)iter.next();
            System.out.println(clienteAux.getNombre());
        }
    }
    
    //*********Cancelando la reserva********************
    public void cancelar(){}
    
    //*********Modificando la reserva*******************
    public void modificar(){}
    
    //*********Habilitando las habitaciones o pisos*****
    public void habilitar(){}
    
}
