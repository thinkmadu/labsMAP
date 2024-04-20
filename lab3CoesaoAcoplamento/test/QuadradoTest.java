package lab3CoesaoAcoplamento.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import lab3CoesaoAcoplamento.Quadrado;

public class QuadradoTest {
    @Test
    public void testCalcularAreaQuadrado() {
        Quadrado quadrado = new Quadrado(7);
        assertEquals(49.0, quadrado.calcularArea(), 0.01);
    }

    @Test
    public void testCalcularPerimetroQuadrado() {
        Quadrado quadrado = new Quadrado(7);
        assertEquals(28.0, quadrado.calcularPerimetro(), 0.01);
    }

    @Test
    public void testToStringQuadrado() {
        Quadrado quadrado = new Quadrado(7);
        String expected = "O quadrado criado tem lados de tamanho: 7";
        assertEquals(expected, quadrado.toStringDaFigura());
    }
}
