
package com.exa2.temag;

import java.time.LocalDate;

/**
 *
 * @author alumno Bustos Guada
 */
public class Campaña {
    private int numero;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double monto;
    private boolean activa;

    public Campaña(int numero, LocalDate fechaInicio, 
            LocalDate fechaFin, double monto, boolean activa) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.activa = activa;
    }
    
    public void activar(){
        activa= true;
    }
    
    public void desactivar(){
        activa= false;
    }
    
    public boolean estaVigente(){
        return activa;
    }
    
    public int getNumero(){
        return numero;
    }
}
