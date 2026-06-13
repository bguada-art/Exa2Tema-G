package com.exa2.temag;

import java.util.ArrayList;

/**
 *
 * @author alumno Bustos Guada
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private String gps;

    private ArrayList<Pedido> pedidos;

    public Vehiculo(String patente,
                    String modelo,
                    String gps){

        this.patente = patente;
        this.modelo = modelo;
        this.gps = gps;

        pedidos = new ArrayList<>();
    }

    public void cargarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void descargarPedido(Pedido pedido){
        pedidos.remove(pedido);
    }

    public void seguirVehiculo(){
        System.out.println("GPS: " + gps);
    }
}
