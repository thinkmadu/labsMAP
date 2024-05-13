package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;
import exceptions.BaseMaiorException;
import exceptions.NegativoException;

public class VisitorCalculaPerimetro implements VisitorIF {
    public double visitaCirculo(Circulo c) throws NegativoException {
        double raio = c.getRaio();
        if (raio <= 0) {
            throw new NegativoException();
        }

        double perimetro = 2 * Math.PI * raio;
        System.out.println("Perímetro do círculo: " + perimetro);

        return perimetro;
    }

    public double visitaRetangulo(Retangulo r) throws NegativoException {
        double altura = r.getAltura();
        double largura = r.getLargura();
        if (altura <= 0 || largura <= 0) {
            throw new NegativoException();
        }

        double perimetro = 2 * (altura + largura);
        System.out.println("Perímetro do retângulo: " + perimetro);

        return perimetro;
    }

    public double visitaTriangulo(Triangulo t) throws NegativoException {
        double base = t.getBase();
        if (base <= 0) {
            throw new NegativoException();
        }

        double perimetro = 3 * base;
        System.out.println("Perímetro do triângulo: " + perimetro);

        return perimetro;
    }

    public double visitaTrapezio(Trapezio t) throws NegativoException, BaseMaiorException {
        double baseMaior = t.getBaseMaior();
        double baseMenor = t.getBaseMenor();
        double lado1 = t.getLado1();
        double lado2 = t.getLado2();
        if (baseMaior <= 0 || baseMenor <= 0 || lado1 <= 0 || lado2 <= 0) {
            throw new NegativoException();
        }

        if (baseMaior <= baseMenor) {
            throw new BaseMaiorException();
        }

        double perimetro = baseMaior + baseMenor + lado1 + lado2;
        System.out.println("Perímetro do trapézio: " + perimetro);

        return perimetro;
    }
}
