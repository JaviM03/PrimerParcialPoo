/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;
import java.util.Scanner;


public class PrimerParcialPOO {
    
    public static void main(String[] args) {
        Paquete paquete = new Paquete();
        //DistriHotel distriHotel = new DistriHotel();
        Cliente cliente = new Cliente();
        DistriHotel prueba = new DistriHotel();
        Reserva res = new Reserva();
        res.reservaMax2h();
        
        //Servicio Basico = new Servicio("Basico",10,false,"piscina");
        //Servicio Premiun = new Servicio("Premiun",150,true,"internet");
        
        Administracion A = new Administracion();
        
        for (int i = 0; i < 3;i++){
            A.agregar();
        }
        
        A.ver();


    }
    
