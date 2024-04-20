package lab2CoesaoAcoplamento.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import lab2CoesaoAcoplamento.Retangulo;

public class RetanguloTest {
    @Test
    public void testCalcularAreaRetangulo() {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals(50.0, retangulo.calcularArea(), 0.01);
    }

    @Test
    public void testCalcularPerimetroRetangulo() {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals(30.0, retangulo.calcularPerimetro(), 0.01);
    }
    
    @Test
    public void testToStringRetangulo() {
        Retangulo retangulo = new Retangulo(10, 5);
        String expected = "O retângulo criado tem altura : 10 e largura : 5";
        assertEquals(expected, retangulo.toStringDaFigura());
    }
}
