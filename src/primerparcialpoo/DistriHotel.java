/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Calendar;

class Habitacion{
    private boolean disponible = true;
    private Calendar in;
    private Calendar out;
    
    public Habitacion() {}

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Calendar getIn() {
        return in;
    }

    public void setIn(Calendar in) {
        this.in = in;
    }

    public Calendar getOut() {
        return out;
    }

    public void setOut(Calendar out) {
        this.out = out;
    }
    
    
}

public class DistriHotel {
    private ArrayList<ArrayList<Habitacion>> edificio = new ArrayList<>();
    private int cantPisos = 0; //i
    private int cantHabit = 0; //j
    
    public DistriHotel(){}
    
    public ArrayList<ArrayList<Habitacion>>  DistriHotel(int cantPisos, int cantHabit) {
        if(cantPisos <= 26){
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
        }
        else{
            System.out.println("Cant pisos se excede al piso 'Z', hotel no creado");   
        } 
        return null;
    }
    public void agregarPiso(){
        //creeando piso antes de agregarlo
        if(cantPisos == 26){
            System.out.println("Se llego hasta el piso 'Z', no se agrego piso");
        }else{
            cantPisos++;
            ArrayList<Habitacion> filaAux = new ArrayList<>();
            for (int i = 0; i < this.cantHabit; i++) {
                filaAux.add(new Habitacion());
            }
            //agregando piso al edificio
            edificio.add(filaAux);
            
        }
    }
    
    public void agregarHabitacion(){
        cantHabit++;
        for (int i = 0; i < cantHabit; i++) {
            edificio.get(i).add(new Habitacion());
        }
    }
    
    public void mostrarHotel(){
        Habitacion habitacion;
        System.out.print("\t");
        for (int i = 1; i <= cantHabit; i++) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.print("\t");
        for (int i = 1; i <= cantHabit; i++) {
            System.out.print("________");
        }
        System.out.println();
        for (int i = cantPisos-1; i >= 0; i--) {
            System.out.print(((char) (i+65))+"     |\t");
            for (int j = 0; j < cantHabit; j++) {
                System.out.print(edificio.get(i).get(j)+"\t");
            }
            System.out.println();
        }
    }
    public void ocuparHabitacion(int piso, int habitacion){
        if (edificio.get(piso).get(habitacion).isDisponible() == false)
            System.out.println("Habitacion ocupada");
        else
            edificio.get(piso).get(habitacion).setDisponible(true);
    }
    public void desocuparHabitacion(int piso, int habitacion){
        if (edificio.get(piso).get(habitacion).isDisponible() == true)
            System.out.println("Habitacion desocupada");
        else
            edificio.get(piso).get(habitacion).setDisponible(false);
    }
}
    