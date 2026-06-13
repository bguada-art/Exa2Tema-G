
package com.exa2.temag;

import java.util.Arrays;

@RunWith(Parameterized.class)
/**
 *
 * @author alumno Bustos Guada
 */
public class ParameterRevendedoraTest {

    private double monto;
    private Revendedora cuenta;
    private double esperado;

    public ParameterRevendedoraTest(
            double monto,
            Revendedora cuenta,
            double esperado) {

        this.monto = monto;
        this.cuenta = cuenta;
        this.esperado = esperado;
    }

    @Parameters
    public static Iterable<Object[]> tomarDatos() {

        Revendedora cRev = new Revendedora(1, 9000);

        return Arrays.asList(new Object[][]{
            {300.5, cRev, 8699.5},
            {500, cRev, 8199.5},
            {9999, cRev, 1111.0}
        });
    }

    @Test
    public void testRetirarDinero() throws Exception {

        assertEquals(
                esperado,
                cuenta.retirarDinero(monto),
                0.2);
    }
}

