/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;
import java.util.Scanner;

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
    
    public void agregar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre:\n");
        cliente.setNombre(entrada.nextLine());
        System.out.println("Ingrese apellido:\n");
        cliente.setApellido(entrada.nextLine());
        System.out.println("Ingrese telefono:\n");
        cliente.setTel(entrada.nextLine());
        System.out.println("Ingrese dui:\n");
        cliente.setDUI(entrada.nextLine());
        System.out.println("Ingrese numero de targeta:\n");
        cliente.setNumeTargeta(entrada.nextLine());
        
    }
    
    public void ver(){}
    
    public void cancelar(){}
    
    public void modificar(){}
    
    public void habilitar(){}
    
}
