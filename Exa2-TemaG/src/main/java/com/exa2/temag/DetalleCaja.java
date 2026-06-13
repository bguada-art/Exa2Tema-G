package com.exa2.temag;

/**
 *
 * @author alumno Bustos Guada
 */
public class DetalleCaja {
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public DetalleCaja(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        
        subtotal = calcularSubtotal();
    }
    
    public double calcularSubtotal(){
        return producto.getPrecioVenta()* cantidad;
    }
    
  }
