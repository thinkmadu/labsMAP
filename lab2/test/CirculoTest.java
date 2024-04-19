package lab2.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import lab2.Circulo;

public class CirculoTest {
    @Test
	public void testCalcularAreaCirculo() {
	    Circulo circulo = new Circulo(5);
	    assertEquals(78.54, circulo.calcularArea(), 0.01);
    }

	@Test
	public void testCalcularPerimetroCirculo() {
	    Circulo circulo = new Circulo(5);
	    assertEquals(31.42, circulo.calcularPerimetro(), 0.01);
	}

	@Test
	public void testToStringCirculo() {
	    Circulo circulo = new Circulo(5);
	    String expected = "O círculo criado tem raio de tamanho: 5";
	    assertEquals(expected, circulo.toStringDaFigura());
	}
}
