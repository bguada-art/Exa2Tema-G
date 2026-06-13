
package com.exa2.temag;

/**
 *
 * @author alumno Bustos Guada
 */
public class Main {

    public static void main(String[] args) {
       Campaña Camp6 =
         new Campaña (6, null, null, 0,true);
       
       Revendedora rev = new Revendedora (1,9000);
       
       Producto p1 = new Producto 
        (1,"Labial", "Belleza",10,800,500);
       
       Producto p2 = new Producto 
        (2,"Perfume", "Fragancia",100,1200,700);
       
       Producto p3= new Producto 
        (3,"Crema", "Corporal",100,1500,1000);
       
       Pedido Ped = new Pedido (100, null, "San Luis","QR 888", rev,Camp6);
       
       CajaPedido caja = new CajaPedido(1);
       
       
       caja.agregarDetalle(new DetalleCaja(p1,2));
       caja.agregarDetalle(new DetalleCaja(p2,1));
       caja.agregarDetalle(new DetalleCaja(p3,3));
       
       Ped.agregarCaja(caja);
       
       Transportista t = new Transportista(10,"Ruben Vargas", "2664587976");
       
       t.escanearPedido(Ped);
       
       
    }
}
