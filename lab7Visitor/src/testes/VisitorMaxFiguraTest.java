package testes;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;
import exceptions.BaseMaiorException;
import exceptions.NegativoException;
import org.junit.jupiter.api.Test;
import visitor.VisitorMaxFigura;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VisitorMaxFiguraTest {

    @Test
    public void testVisitaCirculo() throws NegativoException {
        Circulo circulo = new Circulo(5);
        VisitorMaxFigura visitor = new VisitorMaxFigura();
        double area = visitor.visitaCirculo(circulo);
        assertEquals(25.0, area, 0.001);
    }

    @Test
    public void testVisitaRetangulo() throws NegativoException {
        Retangulo retangulo = new Retangulo(4, 6);
        VisitorMaxFigura visitor = new VisitorMaxFigura();
        double area = visitor.visitaRetangulo(retangulo);
        assertEquals(96, area);
    }

    @Test
    public void testVisitaTrapezio() throws NegativoException, BaseMaiorException {
        Trapezio trapezio = new Trapezio(3, 5, 6, 4);
        VisitorMaxFigura visitor = new VisitorMaxFigura();
        double area = visitor.visitaTrapezio(trapezio);
        assertEquals(100, area);
    }

    @Test
    public void testVisitaTriangulo() throws NegativoException {
        Triangulo triangulo = new Triangulo(3, 4);
        VisitorMaxFigura visitor = new VisitorMaxFigura();
        double area = visitor.visitaTriangulo(triangulo);
        assertEquals(24, area);
    }

    @Test
    public void testVisitaCirculoNegativo() {
        Circulo circulo = new Circulo(-5);
        VisitorMaxFigura visitor = new VisitorMaxFigura();
        assertThrows(NegativoException.class, () -> {
            visitor.visitaCirculo(circulo);
        });
    }

    @Test
    public void testVisitaTrapezioBaseMaiorMenor() {
        Trapezio trapezio = new Trapezio(3, 5, 4, 6);
        VisitorMaxFigura visitor = new VisitorMaxFigura();
        assertThrows(BaseMaiorException.class, () -> {
            visitor.visitaTrapezio(trapezio);
        });
    }
}
