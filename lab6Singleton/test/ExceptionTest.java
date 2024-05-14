package lab6Singleton.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.exeception.ExceptionViolacaoDesigualdade;
import lab6Singleton.models.FiguraGeometrica;
import lab6Singleton.sistema.*;

public class ExceptionTest {
    static FiguraGeometrica circuloException;
    static FiguraGeometrica quadradoException;
    static FiguraGeometrica trianguloException;

    //Teste das excessões
    @Test
    public void testException(){
        assertThrows(ExceptionValorNegativoOuZero.class, () -> {
            circuloException = Fachada.criarCirculo(-2);
            quadradoException = Fachada.criarQuadrado(-1);
            trianguloException = Fachada.criarTriangulo(-1, 0, 30);
        });
        }

    @Test
    public void testExceptionZeroValues(){
        assertThrows(ExceptionValorNegativoOuZero.class, () -> {
            circuloException = Fachada.criarCirculo(0);
            quadradoException = Fachada.criarQuadrado(0);
            trianguloException = Fachada.criarTriangulo(0, 0, 0);
        });
    }

    @Test
    public void testExceptionTriangularInequality(){
        assertThrows(ExceptionViolacaoDesigualdade.class, () -> {
            trianguloException = Fachada.criarTriangulo(1, 2, 4);
        });
    }
        
}
