package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;

import java.util.ArrayList;

public class VisitorMaxFigura implements VisitorIF{

    public double visitaCirculo(Circulo c) {
        double raioDobrado = Math.pow(c.getRaio(), 2);

        System.out.println("Raio dobrado:" + raioDobrado);

        return 0;
    }

    public double visitaRetangulo(Retangulo r) {
        double alturaDobrada = r.getAltura() * 2;
        double larguraDobrada = r.getLargura() * 2;

        System.out.println("Altura dobrada:" + alturaDobrada);
        System.out.println("largura dobrada:" + larguraDobrada);
        return 0;
    }

    public double visitaTrapezio(Trapezio t) {
        // Dobrar as variáveis
        double lado1Dobrado = t.getLado1() * 2;
        double lado2Dobrado = t.getLado2() * 2;
        double baseMaiorDobrada = t.getBaseMaior() * 2;
        double baseMenorDobrada = t.getBaseMenor() * 2;

        // Mostrar os valores dobrados
        System.out.println("Lado 1 dobrado: " + lado1Dobrado);
        System.out.println("Lado 2 dobrado: " + lado2Dobrado);
        System.out.println("Base maior dobrada: " + baseMaiorDobrada);
        System.out.println("Base menor dobrada: " + baseMenorDobrada);

        // Retornar a área do trapézio dobrada
        return 0;
    }

    public double visitaTriangulo(Triangulo t) {
        double alturaDobrada = t.getAltura() * 2;
        double baseDobrada = t.getBase() * 2;

        System.out.println("Altura dobrada: " + alturaDobrada);
        System.out.println("Base dobrada: " + baseDobrada);

        return 0;
    }
}
