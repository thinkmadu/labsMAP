package lab6Singleton.sistema;

import lab6Singleton.exeception.*;
import lab6Singleton.models.*;

public class Gerador {

    private static FiguraSingleton figuraSingleton = FiguraSingleton.getInstance();

    public static Circulo getCirculo(double raio) throws ExceptionValorNegativoOuZero {
        return figuraSingleton.getCirculoInstance(raio);
    }

    public static Quadrado getQuadrado(double lado) throws ExceptionValorNegativoOuZero {
        return figuraSingleton.getQuadrado(lado);
    }

    public static Triangulo getTriangulo(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade {
        return figuraSingleton.getTrianguloInstance(lado1, lado2, lado3);

    }
}