package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;
import exceptions.BaseMaiorException;
import exceptions.NegativoException;

public class VisitorMaxFigura implements VisitorIF {

    public double visitaCirculo(Circulo c) throws NegativoException {
        double raio = c.getRaio();
        if (raio <= 0) {
            throw new NegativoException();
        }

        double raioDobrado = raio * 2;
        System.out.println("Raio dobrado: " + raioDobrado);

        return raioDobrado;
    }

    public double visitaRetangulo(Retangulo r) throws NegativoException {
        double altura = r.getAltura();
        double largura = r.getLargura();
        if (altura <= 0 || largura <= 0) {
            throw new NegativoException();
        }

        double alturaDobrada = altura * 2;
        double larguraDobrada = largura * 2;

        System.out.println("Altura dobrada: " + alturaDobrada);
        System.out.println("Largura dobrada: " + larguraDobrada);
        return alturaDobrada * larguraDobrada;
    }

    public double visitaTrapezio(Trapezio t) throws NegativoException, BaseMaiorException {
        double lado1 = t.getLado1();
        double lado2 = t.getLado2();
        double baseMaior = t.getBaseMaior();
        double baseMenor = t.getBaseMenor();
        if (lado1 <= 0 || lado2 <= 0 || baseMaior <= 0 || baseMenor <= 0) {
            throw new NegativoException();
        }

        if (baseMaior <= baseMenor) {
            throw new BaseMaiorException();
        }

        double lado1Dobrado = lado1 * 2;
        double lado2Dobrado = lado2 * 2;
        double baseMaiorDobrada = baseMaior * 2;
        double baseMenorDobrada = baseMenor * 2;

        System.out.println("Lado 1 dobrado: " + lado1Dobrado);
        System.out.println("Lado 2 dobrado: " + lado2Dobrado);
        System.out.println("Base maior dobrada: " + baseMaiorDobrada);
        System.out.println("Base menor dobrada: " + baseMenorDobrada);

        return (baseMaiorDobrada + baseMenorDobrada) / 2 * Math.max(lado1Dobrado, lado2Dobrado);
    }

    public double visitaTriangulo(Triangulo t) throws NegativoException {
        double altura = t.getAltura();
        double base = t.getBase();
        if (altura <= 0 || base <= 0) {
            throw new NegativoException();
        }

        double alturaDobrada = altura * 2;
        double baseDobrada = base * 2;

        System.out.println("Altura dobrada: " + alturaDobrada);
        System.out.println("Base dobrada: " + baseDobrada);

        return (alturaDobrada * baseDobrada) / 2;
    }
}
