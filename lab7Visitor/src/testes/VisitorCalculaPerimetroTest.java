package testes;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;
import exceptions.BaseMaiorException;
import exceptions.NegativoException;
import org.junit.jupiter.api.Test;
import visitor.VisitorCalculaPerimetro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VisitorCalculaPerimetroTest {

    @Test
    public void testVisitaCirculo() throws NegativoException {
        Circulo circulo = new Circulo(5);
        VisitorCalculaPerimetro visitor = new VisitorCalculaPerimetro();
        double perimetro = visitor.visitaCirculo(circulo);
        assertEquals(31.42, perimetro, 0.01);
    }

    @Test
    public void testVisitaRetangulo() throws NegativoException {
        Retangulo retangulo = new Retangulo(4, 6);
        VisitorCalculaPerimetro visitor = new VisitorCalculaPerimetro();
        double perimetro = visitor.visitaRetangulo(retangulo);
        assertEquals(20, perimetro);
    }

    @Test
    public void testVisitaTriangulo() throws NegativoException {
        Triangulo triangulo = new Triangulo(3, 4);
        VisitorCalculaPerimetro visitor = new VisitorCalculaPerimetro();
        double perimetro = visitor.visitaTriangulo(triangulo);
        assertEquals(9, perimetro);
    }

    @Test
    public void testVisitaTrapezio() throws NegativoException, BaseMaiorException {
        Trapezio trapezio = new Trapezio(3, 5, 4, 6);
        VisitorCalculaPerimetro visitor = new VisitorCalculaPerimetro();
        double perimetro = visitor.visitaTrapezio(trapezio);
        assertEquals(18, perimetro);
    }

    @Test
    public void testVisitaCirculoNegativo() {
        Circulo circulo = new Circulo(-5);
        VisitorCalculaPerimetro visitor = new VisitorCalculaPerimetro();
        assertThrows(NegativoException.class, () -> {
            visitor.visitaCirculo(circulo);
        });
    }

    @Test
    public void testVisitaTrapezioBaseMaiorMenor() {
        Trapezio trapezio = new Trapezio(3, 5, 6, 4);
        VisitorCalculaPerimetro visitor = new VisitorCalculaPerimetro();
        assertThrows(BaseMaiorException.class, () -> {
            visitor.visitaTrapezio(trapezio);
        });
    }
}
