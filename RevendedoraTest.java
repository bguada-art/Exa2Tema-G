
package com.exa2.temag;

import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumno Bustos Guada
 */
public class RevendedoraTest {
    private static int i =0;
    
    private Revendedora revCuenta;
    private Revendedora rev2;
    private Revendedora rev3;
    
    //Anotaciones
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Fecha de transacción"
                + LocalDate.of(2026, Month.JUNE, 24));
    }
    
    @AfterAll
    public static void afterAll(){
        System.out.println("FIN de la transacción");
    }
    
    @BeforeEach
    public void setUp(){
        revCuenta = new Revendedora(100,9000.0);
        rev2 = new Revendedora(200,5000.0);
        rev3 = new Revendedora(300,9000.0);
    }
    
    @AfterEach
    public void tearDown(){
        i++;
        System.out.println("Transacción" + i +
                "> El monto en cuenta es " 
                + revCuenta.getSaldo());
    }
    
    //Test
    @Test(expected = Exception.class)
    public void testRetirarFallo() throws Exception {
        revCuenta.retirarDinero(88000.0);
    }
    
    
    @Test
    public void testRetirarExito()throws Exception {
        revCuenta.retirarDinero(1000.0);
        assertEquals(8000.0, revCuenta.getSaldo(), 0.2);
    }
    
    
    @Test
    public void testDepositarDinero() {
      Revendedora aux = null;
      assertNull(aux);

      revCuenta.depositarDinero(2000.0);

          assertEquals(11000.0,
            revCuenta.getSaldo(),
            0.2);
    }
    
    
    @Test
    public void testTransferirCuentaNoNula() throws Exception {
        Revendedora aux = null;
        assertNull(aux);

        revCuenta.transferirDinero(rev2, 500.0);

           assertEquals(8500.0,
            revCuenta.getSaldo(),
            0.2);

           assertEquals(5500.0,
            rev2.getSaldo(),
            0.2);
    }
    
    @Test
    public void testSiempreFalla() {
        fail("Esta prueba siempre falla.");
    }
    
    @Test
    public void testDolarMEP1() {
        assertEquals(6.923076923,
            revCuenta.convertirMoneda("1300"),
            0.01);
    }
    
    @Test
    public void testDolarMEP2() {
       revCuenta.convertirMoneda("1300 U$S");
    }
    
    @Test
    public void testMismaRevendedora() {
        assertSame("Las cuentas son diferentes",
            revCuenta,
            rev3);
    }
    
    @Test(timeout = 60)
    public void testPagoDemorado() {
       revCuenta.pagoDemorado(100);
    }
}
