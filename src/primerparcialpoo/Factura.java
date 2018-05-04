/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author javier
 */

public class Factura {
    private String idFactura;
    private double totalPagar;
    
    public void Factura(){}
    
    public void Factura (String idFactura, double totalPagar){
        this.idFactura=idFactura;
        this.totalPagar=totalPagar;
        
    }
    
    //GETTERS

    public String getIdFactura() {
        return idFactura;
    }

    public double getTotalPagar() {
        return totalPagar;
    }
    
    //SETTERS

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    //METODO
    
    public void PresentarFactura(){
        Paquete factura = new Paquete();
        Factura fac=new Factura();
        System.out.println("Factura # " + fac.getIdFactura() );
        System.out.println("nombre cliente: "+factura.getNombre());
        System.out.println("el costo a pagar es: " + factura.getCosto());
        System.out.println("el servicio utilizado por el cliente es" + factura.getServicio());
        System.out.println("Total a pagar: " + fac.getTotalPagar());
        
    }
    
}
