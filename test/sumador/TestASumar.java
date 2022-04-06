package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	/**
	 * Test que prueba el m�todo sumativo para un string de un s�lo d�gito.
	 */
	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumativo("5");
        assertEquals("5 = 5",resultado );
    }

}
