
package com.exa2.temag;

import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.AfterEach;

/**
 *
 * @author alumno Bustos Guada
 */
public class RevendedoraTest {
    private static int i =0;
    
    private Revendedora revCuenta;
    private Revendedora rev2;
    private Revendedora rev3;
    
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
    
    @Test(expected = Exception.class)
    public void testRetirarFallo() throws Exception {
        revCuenta.retirarDinero(88000.0);
    }
    
    @Test
    public void testRetirarExito()throws Exception {
        revCuenta.retirarDinero(1000.0);
        
        assertEquals(8000.0, revCuenta.getSaldo(), 0.2);
    }
    
    
}
