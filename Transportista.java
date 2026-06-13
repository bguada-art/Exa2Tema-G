package com.exa2.temag;

/**
 *
 * @author alumno Bustos Guada
 */
public class Transportista {
    private int numero;
    private String nombreCompleto;
    private String whatsapp;

    public Transportista(int numero,
                         String nombreCompleto,
                         String whatsapp){

        this.numero = numero;
        this.nombreCompleto = nombreCompleto;
        this.whatsapp = whatsapp;
    }

    public void escanearPedido(Pedido pedido){

        System.out.println("QR: " + pedido.getQr());

        System.out.println("Destino: "
                + pedido.getDomicilio());
    }
    
}
