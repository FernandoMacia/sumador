package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	/**
	 * Test que prueba el método sumativo para un string de un sólo dígito.
	 */
	
	private ASumar sumi = new ASumar();
	private String resultado;
	
	@Test
    public void testUnaCifra() {
        resultado = sumi.sumativo("5");
        assertEquals("5 = 5",resultado );
    }
	
	/**
	 * Test que prueba el método sumativo para un string que empieza por "-" (negativo)
	 */
	
	@Test
    public void testNumeroNegativo() {
        resultado = sumi.sumativo("-8");
        assertEquals("Negativo. Siempre negativo",resultado );
    }
	
	@Test
    public void testNumeroVariosDigitos() {
        resultado = sumi.sumativo("109");
        assertEquals("1 + 0 + 9 = 10",resultado );
    }
}