package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;

public class VisitorDesenhaFigura implements VisitorIF{

    public double visitaCirculo(Circulo c) {
        int raio = (int) c.getRaio();
        int centro = raio;

        for (int i = 0; i <= 2 * raio; i++) {
            for (int j = 0; j <= 2 * raio; j++) {
                int distancia = (int) Math.sqrt((i - centro) * (i - centro) + (j - centro) * (j - centro));
                if (distancia > raio - 0.5 && distancia < raio + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    public double visitaRetangulo(Retangulo r) {
        int altura = (int) r.getAltura();
        int largura = (int) r.getLargura();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == largura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        return 0;
    }

    public double visitaTriangulo(Triangulo t) {
        int altura = (int) t.getAltura();
        int base = (int) t.getBase();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }

    public double visitaTrapezio(Trapezio t) {
        int altura = (int) Math.max(t.getLado1(), t.getLado2());
        int baseMaior = (int) t.getBaseMaior();
        int baseMenor = (int) t.getBaseMenor();
        int diferencaBases = baseMaior - baseMenor;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < baseMaior + diferencaBases; j++) {
                if (j < diferencaBases / 2 || j >= diferencaBases / 2 + baseMenor) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        return 0;
    }
}