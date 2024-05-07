package lab6Singleton.sistema;

import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.models.Quadrado;
import lab6Singleton.models.Triangulo;

public class Fachada {
    private static FiguraSingleton figuraSingleton = FiguraSingleton.getInstance();

    public static double calcularAreaCirculo(double raio) throws ExceptionValorNegativoOuZero {
        return figuraSingleton.getCirculoInstance(raio).getArea();
    }

    public static double calcularPerimetroCirculo(double raio) throws ExceptionValorNegativoOuZero {
        return figuraSingleton.getCirculoInstance(raio).getPerimetro();
    }

    public static double calcularAreaQuadrado(double lado) throws ExceptionValorNegativoOuZero {
        return figuraSingleton.getQuadradoInstance(lado).getArea();
    }

    public static double calcularPerimetroQuadrado(double lado) throws ExceptionValorNegativoOuZero {
        return figuraSingleton.getQuadradoInstance(lado).getPerimetro();
    }

    public static double calcularAreaTriangulo(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero {
        return figuraSingleton.getTrianguloInstance(lado1, lado2, lado3).getArea();
    }

    public static double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero {
        return figuraSingleton.getTrianguloInstance(lado1, lado2, lado3).getPerimetro();
    }

}
