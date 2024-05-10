package lab6Singleton.test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import lab6Singleton.exeception.*;
import lab6Singleton.models.FiguraGeometrica;
import lab6Singleton.models.Triangulo;
import lab6Singleton.sistema.*;

public class TrianguloTest {
    static FiguraGeometrica triangulo;

    //Definindo os lados do triangulo
    @BeforeAll
    public static void setUp() throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade{
         triangulo = Fachada.criarTriangulo(3, 4, 5);
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
    public void testTriangulo() throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade {
        //assertNotNull(Gerador.getTriangulo(3, 4, 5));
        assertDoesNotThrow(() -> Gerador.getTriangulo(3, 4, 5));
    }

    @Test
    public void testTriangulo2() throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade {
        //assertNotNull(Gerador.getTriangulo(5, 5, 5));
        assertDoesNotThrow(() -> Gerador.getTriangulo(5, 5, 5));
    }

    //Testa se o triangulo é equilatero
    @Test
    public void testTrianguloEquilatero() throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade {

        Triangulo triangulo = Fachada.criarTriangulo(10, 10, 10);
        assertTrue(Triangulo.verificacaoTEquilatero(triangulo.getLado1(), triangulo.getLado2(), triangulo.getLado3()));
    }

    //Testa se o triangulo é Isosceles
    @Test
    public void testTrianguloIsosceles1() throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade {
        Triangulo triangulo = Fachada.criarTriangulo(10, 10, 6);
        assertTrue(Triangulo.verificacaoTIsosceles(triangulo.getLado1(), triangulo.getLado2(), triangulo.getLado3()));;
    }

    //Testa se o triangulo é Retangulo
    @Test
    public void testTrianguloRetangulo1() throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade {
        assertTrue(Triangulo.verificacaoTRetangulo(((Triangulo) triangulo).getLado1(), ((Triangulo) triangulo).getLado2(), ((Triangulo) triangulo).getLado3()));;
    }

    @Test
    //verifica se o triangulo é singleton
    public void sigleton() throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade{
        Triangulo triangulo2 = Fachada.criarTriangulo(3, 4, 5);
        assertSame(triangulo2, triangulo);
    }
}
