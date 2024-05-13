package lab6Singleton.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.models.FiguraGeometrica;
import lab6Singleton.sistema.*;

public class QuadradoTest {
    static FiguraGeometrica quadrado, quadrado2;

    //Define os lados do quadrado
    @BeforeAll
    public static void setUp() throws ExceptionValorNegativoOuZero {
        quadrado = Fachada.criarQuadrado(4);
        quadrado2 = Fachada.criarQuadrado(5);

    }

    //Verifica a area do quadrado
    @Test
    public void testAreaQuadrado() {
        assertEquals(16.00, quadrado.getArea(), 1);
    }

    //Verifica o perimetro do quadrado
    @Test
    public void testPerimetroQuadrado() {
        assertEquals(16.00, quadrado.getPerimetro(), 1);
    }

    //Verifica a area do quadrado2
    @Test
    public void testAreaQuadrado2() {
        assertEquals(25.00, quadrado2.getArea(), 1);
    }

    //Verifica o perimetro do quadrado2
    @Test
    public void testPerimetroQuadrado2() {
        assertEquals(20.00, quadrado2.getPerimetro(), 1);
    }

     @Test
    //verifica se o quadrado é singleton
    public void sigleton() throws ExceptionValorNegativoOuZero{
        assertNotEquals(quadrado, quadrado2); //não são singleton os quadrados
    }
}
