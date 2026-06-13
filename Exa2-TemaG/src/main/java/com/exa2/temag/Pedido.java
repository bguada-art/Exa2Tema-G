package com.exa2.temag;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author alumno Bustos Guada
 */
public class Pedido {
    private int numero;
    private LocalDate fechaIngreso;
    private LocalDate fechaEntrega;
    private LocalDate fechaPago;
    
    private int cantidadCajas;
    private String domicilio;
    private String qr;
    private double importe;
    private boolean pagado;
    
    private Revendedora revendedora;
    private Campaña campaña;
    
    private ArrayList<CajaPedido> cajas;

    public Pedido(int numero, LocalDate fechaIngreso, 
            String domicilio, String qr, Revendedora revendedora, Campaña campaña) {
        this.numero = numero;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
        this.qr = qr;
        this.revendedora = revendedora;
        this.campaña = campaña;
        
        cajas= new ArrayList<>();
        
        cantidadCajas = 0;
        importe = 0;
        pagado = false;
    }
    
    public void agregarCaja(CajaPedido caja){
        cajas.add(caja);
        cantidadCajas = cajas.size();
    }
    
    public double calcularImporte(){
        importe =0;
        for(CajaPedido caja : cajas){
            importe += caja.calcularSubtotalCaja();
        }
        return importe;
    }
    
    public void registarPago(LocalDate fechaPago){
        this.fechaPago= fechaPago;
        pagado = true;
    }
    
    
    @Override
    public String toString(){
        return "Pedido N°" + numero + "- importe: $" + importe;
    }
}
