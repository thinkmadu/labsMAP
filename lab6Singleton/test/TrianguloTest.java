package lab6Singleton.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.models.FiguraGeometrica;
import lab6Singleton.sistema.Gerador;

public class TrianguloTest {
    static FiguraGeometrica triangulo;

    //Definindo os lados do triangulo
    @BeforeAll
    public static void setUp() throws ExceptionValorNegativoOuZero {
        triangulo = Gerador.getTriangulo(3, 4, 5);
    }

    //Verifica a area do triangulo
    @Test
    public void testAreaTriangulo() {
        assertEquals(6.00, triangulo.getArea(), 1);
    }

    //Verifica o perimetro do triangulo
    @Test
    public void testPerimetroTriangulo() {
        assertEquals(12.00, triangulo.getPerimetro(), 1);
    }

    //Testa se a figura  é um triangulo
    @Test
    public void testTriangulo() throws ExceptionValorNegativoOuZero {
        assertNotNull(Gerador.getTriangulo(3, 4, 5));
    }

    @Test
    public void testTriangulo2() throws ExceptionValorNegativoOuZero {
        assertNotNull(Gerador.getTriangulo(5, 5, 5));
    }

    //Testa se o triangulo é equilatero
    @Test
    public void testTrianguloEquilatero() throws ExceptionValorNegativoOuZero {
        assertNotNull(Gerador.getTriangulo(10, 10, 10));
    }

    @Test
    public void testTrianguloEquilatero2() throws ExceptionValorNegativoOuZero {
        assertNotNull(Gerador.getTriangulo(3, 3, 3));
    }

    //Testa se o triangulo é Isosceles
    @Test
    public void testTrianguloIsosceles1() throws ExceptionValorNegativoOuZero {
        assertNotNull(Gerador.getTriangulo(4, 3, 4));
    }

    @Test
    public void testTrianguloIsosceles2() throws ExceptionValorNegativoOuZero {
        assertNotNull(Gerador.getTriangulo(10, 10, 6));

    }

    //Testa se o triangulo é Retangulo
    @Test
    public void testTrianguloRetangulo1() throws ExceptionValorNegativoOuZero {
        assertNotNull(Gerador.getTriangulo(18, 24, 30));
    }

    @Test
    public void testTrianguloRetangulo2() throws ExceptionValorNegativoOuZero {
        assertNotNull(Gerador.getTriangulo(7, 24, 25));
    }
}
