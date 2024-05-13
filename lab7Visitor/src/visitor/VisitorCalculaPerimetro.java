package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Triangulo;
import elementosConcretos.Trapezio;

public class VisitorCalculaPerimetro implements VisitorIF{
    public double visitaCirculo(Circulo c){
        double pRaio = 2 * 3.14 * c.getRaio();
        System.out.println("Perímetro do círculo: " + pRaio);

        return 0;
    }
    public double visitaRetangulo(Retangulo r){
        double pRetangulo = r.getAltura() + r.getAltura() + r.getLargura() + r.getLargura();

        System.out.println("Perímetro do retângulo: " + pRetangulo);

        return 0;
    }
    public double visitaTriangulo(Triangulo t){
        double pTriangulo = t.getBase() + t.getBase() + t.getBase();

        System.out.println("Perímetro do triângulo: " + pTriangulo);
        return 0;
    }
    public double visitaTrapezio(Trapezio t){
        double pTrapezio = t.getBaseMaior() + t.getBaseMenor() + t.getLado1() + t.getLado2();

        System.out.println("Perímetro do trapézio: " + pTrapezio);

        return 0;
    }
}
