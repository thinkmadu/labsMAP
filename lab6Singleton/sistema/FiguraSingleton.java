package lab6Singleton.sistema;
import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.models.Circulo;
import lab6Singleton.models.Quadrado;
import lab6Singleton.models.Triangulo;

public class FiguraSingleton {

    private static FiguraSingleton instance;

    private Circulo circuloInstance;
    private Quadrado quadradoInstance;
    private Triangulo trianguloInstance;

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

    public Circulo getCirculoInstance(double raio) throws ExceptionValorNegativoOuZero {
        if (circuloInstance == null) {
            circuloInstance = new Circulo(raio);
        }
        return circuloInstance;
    }

    public Quadrado getQuadradoInstance(double lado) throws ExceptionValorNegativoOuZero {
        if (quadradoInstance == null) {
            quadradoInstance = new Quadrado(lado);
        }
        return quadradoInstance;
    }

    public Triangulo getTrianguloInstance(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero {
        if (trianguloInstance == null) {
            trianguloInstance = new Triangulo(lado1, lado2, lado3);
        }
        return trianguloInstance;
    }
}