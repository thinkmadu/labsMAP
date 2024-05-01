package lab6Singleton.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.models.FiguraGeometrica;
import lab6Singleton.sistema.Gerador;

public class CirculoTest {
    static FiguraGeometrica circulo;

    //Definindo o raio do circulo
    @BeforeAll
    public static void setUp() throws ExceptionValorNegativoOuZero {
        circulo = Gerador.getCirculo(5);
    }

    @Test
    //verifica a area do cirulo
    public void testAreaCirculo(){
        assertEquals(78.54, circulo.getArea(), 1);
    }

    @Test
    //Verifica o perimeto do circulo
    public void testPerimetroCirculo(){
        assertEquals(31.42, circulo.getPerimetro(), 1);
    }
}
