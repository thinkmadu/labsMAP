package lab6Singleton.sistema;

import lab6Singleton.exeception.*;
import lab6Singleton.models.*;

public class Fachada {

    //  criar as figuras
    public static Circulo criarCirculo(double raio) throws ExceptionValorNegativoOuZero {
        return Circulo.getCirculoInstance(raio);
    }

    public static Quadrado criarQuadrado(double lado) throws ExceptionValorNegativoOuZero {
        return new Quadrado(lado);
    }

    public static Triangulo criarTriangulo(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade {
        return Triangulo.getTrianguloInstance(lado1, lado2, lado3);
    }

   

}