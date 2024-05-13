package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;
import exceptions.NegativoException;

public class VisitorDesenhaFigura implements VisitorIF {

    public double visitaCirculo(Circulo c) throws NegativoException {
        double raio = c.getRaio();
        if (raio <= 0) {
            throw new NegativoException();
        }

        int raioInt = (int) raio;
        int centro = raioInt;

        for (int i = 0; i <= 2 * raioInt; i++) {
            for (int j = 0; j <= 2 * raioInt; j++) {
                int distancia = (int) Math.sqrt((i - centro) * (i - centro) + (j - centro) * (j - centro));
                if (distancia > raioInt - 0.5 && distancia < raioInt + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    public double visitaRetangulo(Retangulo r) throws NegativoException {
        double altura = r.getAltura();
        double largura = r.getLargura();
        if (altura <= 0 || largura <= 0) {
            throw new NegativoException();
        }

        int alturaInt = (int) altura;
        int larguraInt = (int) largura;

        for (int i = 0; i < alturaInt; i++) {
            for (int j = 0; j < larguraInt; j++) {
                if (i == 0 || i == alturaInt - 1 || j == 0 || j == larguraInt - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    public double visitaTriangulo(Triangulo t) throws NegativoException {
        double altura = t.getAltura();
        double base = t.getBase();
        if (altura <= 0 || base <= 0) {
            throw new NegativoException();
        }

        int alturaInt = (int) altura;
        int baseInt = (int) base;

        for (int i = 0; i < alturaInt; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == alturaInt - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    public double visitaTrapezio(Trapezio t) throws NegativoException {
        double lado1 = t.getLado1();
        double lado2 = t.getLado2();
        double baseMaior = t.getBaseMaior();
        double baseMenor = t.getBaseMenor();
        if (lado1 <= 0 || lado2 <= 0 || baseMaior <= 0 || baseMenor <= 0) {
            throw new NegativoException();
        }

        double altura = Math.max(lado1, lado2);
        double baseTotal = baseMaior + baseMenor;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < baseTotal; j++) {
                double posicaoBase = (j - (baseMenor / 2.0)) / (baseTotal - baseMenor);
                int numAsteriscos = (int) Math.round(posicaoBase * baseTotal);

                for (int k = 0; k < numAsteriscos; k++) {
                    System.out.print("*");
                }

                double numEspacosEsquerda = baseTotal - numAsteriscos;
                for (int k = 0; k < numEspacosEsquerda; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0; // Retorna 0, pois o método não calcula uma área
    }
}
