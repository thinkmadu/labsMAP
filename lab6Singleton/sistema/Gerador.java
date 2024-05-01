package lab6Singleton.sistema;
import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.models.Circulo;
import lab6Singleton.models.Quadrado;
import lab6Singleton.models.Triangulo;

public class Gerador {
    public static Circulo getCirculo(double raio) throws ExceptionValorNegativoOuZero {
        return Circulo.getInstancia(raio);
    }

    public static Quadrado getQuadrado(double lado) throws ExceptionValorNegativoOuZero {
        return new Quadrado(lado);
    }

    public static Triangulo getTriangulo(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero {
        return Triangulo.getInstancias(lado1, lado2, lado3);
    }
}
