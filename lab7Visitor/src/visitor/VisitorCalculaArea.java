package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;

public class VisitorCalculaArea implements VisitorIF{
    public double visitaCirculo(Circulo c){
        double aCirculo = 3.14 * (c.getRaio() * c.getRaio());

        System.out.println("Área do círculo: " + aCirculo);
        return 0;
    }
    public double visitaTriangulo(Triangulo t){
        double aTriangulo = (t.getBase() * t.getAltura())/2;

        System.out.println("Área do triângulo: " + aTriangulo);
        return 0;
    }
    public double visitaRetangulo(Retangulo r){
        double aRetangulo = r.getAltura() * r.getLargura();

        System.out.println("Área do retângulo: " +aRetangulo);

        return 0;
    }
    public double visitaTrapezio(Trapezio t){
        double semiperimetro = (t.getBaseMaior() + t.getBaseMenor() + t.getLado1() + t.getLado2()) / 2;
        double altura = 2 * Math.sqrt(Math.pow(semiperimetro - (t.getLado1() + t.getLado2()), 2)) /
                (t.getBaseMaior() - t.getBaseMenor());
        double area = (t.getBaseMaior() + t.getBaseMenor()) * altura / 2;
        System.out.println("Área do Trapézio: " + area);

        return 0;
    }


}
