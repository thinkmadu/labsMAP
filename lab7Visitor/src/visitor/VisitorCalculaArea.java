package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;
import exceptions.BaseMaiorException;
import exceptions.NegativoException;

public class VisitorCalculaArea implements VisitorIF {

    public double visitaCirculo(Circulo c) throws NegativoException {
        double raio = c.getRaio();
        if (raio <= 0) {
            throw new NegativoException();
        }
        double aCirculo = Math.PI * (raio * raio);
        System.out.println("Área do círculo: " + aCirculo);
        return aCirculo;
    }

    public double visitaTriangulo(Triangulo t) throws NegativoException {
        double base = t.getBase();
        double altura = t.getAltura();
        if (base <= 0 || altura <= 0) {
            throw new NegativoException();
        }
        double aTriangulo = (base * altura) / 2;
        System.out.println("Área do triângulo: " + aTriangulo);
        return aTriangulo;
    }

    public double visitaRetangulo(Retangulo r) throws NegativoException {
        double altura = r.getAltura();
        double largura = r.getLargura();
        if (altura <= 0 || largura <= 0) {
            throw new NegativoException();
        }
        double aRetangulo = altura * largura;
        System.out.println("Área do retângulo: " + aRetangulo);
        return aRetangulo;
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
        double semiperimetro = (baseMaior + baseMenor + lado1 + lado2) / 2;
        double altura = 2 * Math.sqrt(Math.pow(semiperimetro - (lado1 + lado2), 2)) /
                (baseMaior - baseMenor);
        double area = (baseMaior + baseMenor) * altura / 2;
        System.out.println("Área do Trapézio: " + area);
        return area;
    }
}
