package com.exa2.temag;

/**
 *
 * @author alumno Bustos Guada
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String uso;
    private double tamañoCm3;
    private double precioVenta;
    private double precioCosto;

    public Producto(int codigo, String nombre, String uso, 
            double tamañoCm3, double precioVenta, double precioCosto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.uso = uso;
        this.tamañoCm3 = tamañoCm3;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
    }
    
    public double calcularGanacia(){
        return precioVenta - precioCosto;
    }
    
    public void mostarDatos(){
        System.out.println("Producto:" + nombre);
        System.out.println("Precio venta: $" + precioVenta);
    }
    
    public double getPrecioVenta(){
        return precioVenta;
    }
}
