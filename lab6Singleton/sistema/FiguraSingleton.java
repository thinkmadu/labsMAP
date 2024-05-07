package lab6Singleton.sistema;
import lab6Singleton.exeception.*;
import lab6Singleton.models.*;

public class FiguraSingleton {

    private static FiguraSingleton instance;

    private Circulo circuloInstance;
    
    private Triangulo trianguloIsosceles;
    private Triangulo trianguloEquilatero;
    private Triangulo trianguloRetangulo;


    private FiguraSingleton() {

    }

    public static FiguraSingleton getInstance() {
        if (instance == null) {
            synchronized (FiguraSingleton.class) {
                if (instance == null) {
                    instance = new FiguraSingleton();
                }
            }
        }
        return instance;
    }

    //so pode ter 1
    public Circulo getCirculoInstance(double raio) throws ExceptionValorNegativoOuZero {
        if (circuloInstance == null) {
            circuloInstance = new Circulo(raio);
        }
        return circuloInstance;
    }

    // so pode 1 de cada

   public Triangulo getTrianguloInstance(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade {
    if (Triangulo.verificacaoTEquilatero(lado1, lado2, lado3)) {
        if (trianguloEquilatero == null) {
            trianguloEquilatero = new Triangulo(lado1, lado2, lado3);
        }
        return trianguloEquilatero;
    } else if (Triangulo.verificacaoTIsosceles(lado1, lado2, lado3)) {
        if (trianguloIsosceles == null) {
            trianguloIsosceles = new Triangulo(lado1, lado2, lado3);
        }
        return trianguloIsosceles;
    } else if (Triangulo.verificacaoTRetangulo(lado1, lado2, lado3)) {
        if (trianguloRetangulo == null) {
            trianguloRetangulo = new Triangulo(lado1, lado2, lado3);
        }
        return trianguloRetangulo;
    }
    throw new ExceptionViolacaoDesigualdade();
}


    // pode muitos
    public Quadrado getQuadrado(double lado) throws ExceptionValorNegativoOuZero {
        return new Quadrado(lado);
    }
}