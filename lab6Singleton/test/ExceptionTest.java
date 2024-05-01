package lab6Singleton.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.models.FiguraGeometrica;
import lab6Singleton.sistema.Gerador;

public class ExceptionTest {
    static FiguraGeometrica circuloException;
    static FiguraGeometrica quadradoException;
    static FiguraGeometrica trianguloException;

    //Teste das excessões
    @Test
    public void testException(){
        assertThrows(ExceptionValorNegativoOuZero.class, () -> {
            circuloException = Gerador.getCirculo(-2);
            quadradoException = Gerador.getQuadrado(-1);
            trianguloException = Gerador.getTriangulo(-1, 0, 30);
        });
        }
}
