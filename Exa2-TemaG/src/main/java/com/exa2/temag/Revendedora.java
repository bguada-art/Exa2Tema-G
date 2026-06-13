
package com.exa2.temag;

import java.util.ArrayList;

/**
 *
 * @author alumno Bustos Guada
 */
public class Revendedora {
    private String dni;
    private String nombreCompleto;
    private String telefono;
    private String domicilio;
    
    //Nuevos atributos para Testing
    private int nroCuenta;
    private double saldo;
    
    private ArrayList<Pedido> pedidos;

    public Revendedora(String dni, String nombreCompleto, String telefono, String domicilio,
            int nroCuenta, double saldo) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.domicilio = domicilio;
        
        this.nroCuenta=nroCuenta;
        this.saldo= saldo;
        
        pedidos= new ArrayList<>();
    }
    
    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    
    public void listaPedidos(){
        for(Pedido p: pedidos){
            System.out.println(p);
        }
    }
    
    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double retirarDinero(double monto) throws Exception {
        if(monto > saldo){
            throw new Exception ("Su cuenta no tiene saldo.");
        }
        saldo -= monto;
        return saldo;
    }
    
    public void depositarDinero(double monto){
        saldo += monto;
    }
    
    public void transferirDinero(Revendedora rev, double monto) throws Exception{
        retirarDinero(monto);
        rev.depositarDinero(monto);
    }
    
    public double convertirMoneda(String cotizacion){
        return saldo/ Integer.parseInt(cotizacion);
    }
    
    public void pagoDemorado(int tiempo){
        try{
            Thread.sleep(tiempo);
            System.out.println("El pago se produjo en tiempo y forma");
        } catch (InterruptedException e){
            System.out.println("Pago cancelado");
        }
    }
}
