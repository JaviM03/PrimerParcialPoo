/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;

public class DistriHotel {
    private ArrayList<ArrayList<Boolean>> edificio = new ArrayList<>();
    private int cantPisos = 0; //i
    private int cantHabit = 0; //j
    
    public DistriHotel(){}
    
    public DistriHotel(int cantPisos, int cantHabit) {
        if(cantPisos <= 26){
            this.cantPisos = cantPisos;
            this.cantHabit = cantHabit;
            System.out.println("Generando Hotel");
            ArrayList<Boolean> filaAux = new ArrayList<>();

            for (int i = 0; i < this.cantPisos; i++) {
                for (int j = 0; j < this.cantHabit; j++) {
                    filaAux.add(new Boolean(false));
                }
                edificio.add(filaAux);
                filaAux = new ArrayList<>();
            }
        }
        else{
            System.out.println("Cant pisos se excede al piso 'Z', hotel no creado");
            
        } 
    }
    public void agregarPiso(){
        //creeando piso antes de agregarlo
        if(cantPisos == 26){
            System.out.println("Se llego hasta el piso 'Z', no se agrego piso");
        }else{
            cantPisos++;
            ArrayList<Boolean> filaAux = new ArrayList<>();
            for (int i = 0; i < this.cantHabit; i++) {
                filaAux.add(new Boolean(false));
            }
            //agregando piso al edificio
            edificio.add(filaAux);
            
        }
    }
    
    public void agregarHabitacion(){
        cantHabit++;
        for (int i = 0; i < cantHabit; i++) {
            edificio.get(i).add(false);
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
                System.out.print(edificio.get(i).get(j)+"\t");
            }
            System.out.println();
        }
    }
    public void ocuparHabitacion(int piso, int habitacion){
        if (edificio.get(piso).get(habitacion) == true)
            System.out.println("Habitacion ocupada");
        else
            edificio.get(piso).set(habitacion,true);
    }
    public void desocuparHabitacion(int piso, int habitacion){
        if (edificio.get(piso).get(habitacion) == false)
            System.out.println("Habitacion desocupada");
        else
            edificio.get(piso).set(habitacion,false);
    }

}
    