
package primerparcialpoo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;



/**
 *
 * @author javier
 */
public class Reserva {
    int reservaMax2H=0, habitacion,dia,ospeMax7D;
    DistriHotel ultimo2Piso,numHabitacion,Distri_hotel;
    String diaReserva;
    
    
    
    
    public ArrayList<Reserva> listaReservaHecha= new ArrayList<>();
   
   
    
    
    //Revisar Disponibilidad de habitaciones
  
    { 
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite el # de habitaciones deseadas: (Maximo 2)");
        
        
         while(reservaMax2H<2){
            habitacion= input.nextInt();
            if( habitacion<3 ){
                System.out.println("Ha seleccionado " + reservaMax2H + " habitaciones");
            reservaMax2H=habitacion+1;}
            else {
                
                System.out.println("Ingrese una cantidad valida.");
                
            }     
             
                        
               
                }
        
        
        
        
    
            
   
    //Cantidad de días en los que se reservará la habitación
    
    { 
         System.out.println("Digite el # de dias de reserva: (Maximo 1 semana)");
        
         
         while(ospeMax7D<1){
            dia=input.nextInt();
            if( dia<8 ){
                ospeMax7D=dia;
                System.out.println("Has seleccionado " + ospeMax7D + " dias de reserva");}
            
            else {
                
                System.out.println("Ingrese una cantidad menor a 8 días.");
                
            }     
            
             System.out.println("Ingrese la fecha de ingreso: ");
            diaReserva= input.nextLine();
            
               
                }
        
        
        
        }
   
        /*//reservar habitación por determinados días
        Date diaReserva= new Date(115, 6, 2, 15, 30);
        System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+diaReserva);*/

    }
}

    
    
    
    

