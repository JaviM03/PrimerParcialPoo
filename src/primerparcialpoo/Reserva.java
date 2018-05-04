
package primerparcialpoo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.InputMismatchException;



/**
 *
 * @author javier
 */
public class Reserva {
    int reservaMax2H=0, habitacion,dia,ospeMax7D;
    DistriHotel ultimo2Piso,numHabitacion,Distri_hotel,desocuparHabitacion;
    DistriHotel hotel = new DistriHotel();
    String idReserva,diaReserva;

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    Scanner input = new Scanner (System.in);
    
    //Revisar Disponibilidad de habitaciones
    public ArrayList<ArrayList<Boolean>> reservaMax2h(){ 
        
        ArrayList<ArrayList<Boolean>> edificio= hotel.DistriHotel(10, 6);
        System.out.println("Digite el # de habitaciones deseadas: (Maximo 2)");
         while(reservaMax2H<2){
            habitacion= input.nextInt();
            if( habitacion == 2 || habitacion == 1 ){
                System.out.println("Ha seleccionado " + reservaMax2H + " habitaciones");
                reservaMax2H=habitacion+1;}
            else {
                System.out.println("Ingrese una cantidad valida.");
            } 
         }
         
        Scanner menu = new Scanner (System.in);
        boolean salir =false;
        int opcion;
          
        for(int i = 0; i < habitacion; i++ ){
            System.out.println("1. Habitación Sencilla");
            System.out.println("2. Habitación Doble");
            System.out.println("3. Salir");
            try {   
            
                System.out.println("Elige un tipo de Habitación");
                opcion = menu.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Has seleccionado Habitación simple");
                        break;
                    case 2:
                        System.out.println("Has seleccionado Habitación Doble");
                        break;
                     case 3:
                        salir=true;
                        break;
                     default:
                        System.out.println("Solo los números 1 y 2");
                }    
            }    
            catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                menu.next();
            }
        }
        
        int aux = habitacion;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 10; j++){
                if(aux > 0 && edificio.get(i).get(j) == false){
                   edificio.get(i).set(j,true);
                    aux--;
                }
                
            }
            
            hotel.mostrarHotel();
            
        }
        
        
        
        return edificio;
    }       
    
        

        
    
            
   
    //Cantidad de días en los que se reservará la habitación
    
    
        
   

    
        public void ospeMax7d(){
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
         
       Calendar checkIn = Calendar.getInstance();
            System.out.println("El cliente ingreso en la fecha" + checkIn.getTime() );
       Calendar checkOut =Calendar.getInstance();
            checkOut.add(Calendar.DAY_OF_MONTH, dia);
            System.out.println("El cliente se fue en la fecha" + checkOut.getTime());
        }
        
        }
   
     

    


    
    
    
    

