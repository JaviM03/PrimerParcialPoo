/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Calendar;

class Habitacion{
    boolean ocupado = false;
    Calendar fechaInicio;
    Calendar fechaFinal;
    public Habitacion(){}

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
}

public class DistriHotel {
    private ArrayList<ArrayList<Habitacion>> edificio = new ArrayList<>();
    private int cantPisos = 0; //i
    private int cantHabit = 0; //j
    
    public DistriHotel(int cantPisos, int cantHabit){
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
        }else{
            System.out.println("Cant pisos se excede al piso 'Z', hotel no creado");
        }
    }
    public void agregarPiso(){
        //creeando el piso antes de agregarlo
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
        for (int i = 0; i < cantPisos; i++) {
            edificio.get(i).add(new Habitacion());
        }
    }
    
    public void mostrarHotel(){
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
                System.out.print(edificio.get(i).get(j).isOcupado()+"\t");
            }
            System.out.println();
        }
        mostrarOcupadas();
    }
    public void ocuparHabitacion(int piso, int habitacion){
        if (edificio.get(piso).get(habitacion).isOcupado() == true)
            System.out.println("Habitacion ocupada");
        else
            edificio.get(piso).get(habitacion).setOcupado(true);
    }
    public void desocuparHabitacion(int piso, int habitacion){
        if (edificio.get(piso).get(habitacion).isOcupado() == false)
            System.out.println("Habitacion desocupada");
        else
            edificio.get(piso).get(habitacion).setOcupado(false);
    }
    public void mostrarOcupadas(){
        System.out.println("Habitaciones Ocupadas:");
        System.out.println("\tSencillas:");
        for (int i = 0; i < cantPisos; i++) {
            for (int j = 0; j < cantHabit; j++) {
                if (edificio.get(i).get(j).isOcupado() == true) {
                    System.out.println("\t\t|"+((char) (i+65))+""+(j+1));
                }
                j++;
            }
        }
        System.out.println("\tDobles:");
        for (int i = 0; i < cantPisos; i++) {
            for (int j = 1; j < cantHabit; j++) {
                if (edificio.get(i).get(j).isOcupado() == true) {
                    System.out.println("\t\t|"+((char) (i+65))+""+(j+1));
                }
                j++;
            }
        }
    }
}
