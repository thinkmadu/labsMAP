package testes;
import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;
import exceptions.BaseMaiorException;
import exceptions.NegativoException;
import org.junit.Test;
import visitor.VisitorCalculaArea;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class VisitorCalculaAreaTest {

    @Test
    public void testVisitaCirculo() throws NegativoException {
        Circulo circulo = new Circulo(5);
        VisitorCalculaArea visitor = new VisitorCalculaArea();
        double area = visitor.visitaCirculo(circulo);
        assertEquals(78.53981633974483, area, 0.0001);
    }

    @Test
    public void testVisitaTriangulo() throws NegativoException {
        Triangulo triangulo = new Triangulo(3, 4);
        VisitorCalculaArea visitor = new VisitorCalculaArea();
        double area = visitor.visitaTriangulo(triangulo);
        assertEquals(6.0, area, 0.0001);
    }

    @Test
    public void testVisitaRetangulo() throws NegativoException {
        Retangulo retangulo = new Retangulo(5, 6);
        VisitorCalculaArea visitor = new VisitorCalculaArea();
        double area = visitor.visitaRetangulo(retangulo);
        assertEquals(30.0, area, 0.0001);
    }

    @Test
    public void testVisitaTrapezio() throws NegativoException, BaseMaiorException {
        Trapezio trapezio = new Trapezio(4, 2, 4, 3);
        VisitorCalculaArea visitor = new VisitorCalculaArea();
        double area = visitor.visitaTrapezio(trapezio);
        assertEquals(3.5, area, 0.0001);
    }

    @Test(expected = NegativoException.class)
    public void testVisitaCirculoNegativo() throws NegativoException {
        Circulo circulo = new Circulo(-5);
        VisitorCalculaArea visitor = new VisitorCalculaArea();
        visitor.visitaCirculo(circulo);
    }

    @Test(expected = NegativoException.class)
    public void testVisitaTrianguloNegativo() throws NegativoException {
        Triangulo triangulo = new Triangulo(3, -4);
        VisitorCalculaArea visitor = new VisitorCalculaArea();
        visitor.visitaTriangulo(triangulo);
    }

    @Test(expected = BaseMaiorException.class)
    public void testVisitaTrapezioBaseMaiorInvalida() throws NegativoException, BaseMaiorException {
        Trapezio trapezio = new Trapezio(2, 4, 3, 4);
        VisitorCalculaArea visitor = new VisitorCalculaArea();
        visitor.visitaTrapezio(trapezio);
    }
}

