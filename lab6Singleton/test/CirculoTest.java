package lab6Singleton.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.models.Circulo;
import lab6Singleton.models.FiguraGeometrica;
import lab6Singleton.sistema.*;

public class CirculoTest {
    static FiguraGeometrica circulo;

    //Definindo o raio do circulo
    @BeforeAll
    public static void setUp() throws ExceptionValorNegativoOuZero {
        circulo = Fachada.criarCirculo(5);
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

    @Test
    //verifica se o circulo é singleton
    public void sigleton() throws ExceptionValorNegativoOuZero{
        Circulo circulo2 = Fachada.criarCirculo(8);
        assertSame(circulo,circulo2);
    
    }
}
