package com.exa2.temag;

import java.util.ArrayList;

/**
 *
 * @author alumno Bustos Guada
 */
public class CajaPedido {
    private  int codigoCaja;
    
    private ArrayList<DetalleCaja> detalles;
    
    public CajaPedido(int codigoCaja){
        this.codigoCaja = codigoCaja;
        detalles = new ArrayList<>();
    }
    
    public void agregarDetalle(DetalleCaja detalle){
        detalles.add(detalle);
    }
    
    public double calcularSubtotalCaja(){
        double total = 0;
        for(DetalleCaja detalle : detalles){
            total += detalle.calcularSubtotal();
        }
        return total;
    }
    
}
