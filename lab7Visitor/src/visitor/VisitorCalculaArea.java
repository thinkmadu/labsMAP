package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;

public class VisitorCalculaArea implements VisitorIF{
    public double visitaCirculo(Circulo c){ return 3.14 * (c.getRaio() * c.getRaio()); }
    public double visitaTriangulo(Triangulo t){ return (t.getBase() * t.getAltura())/2; }
    public double visitaRetangulo(Retangulo r){ return r.getAltura() * r.getLargura(); }
    public double visitaTrapezio(Trapezio t){
        double semiperimetro = (t.getBaseMaior() + t.getBaseMenor() + t.getLado1() + t.getLado2()) / 2;
        double altura = 2 * Math.sqrt(Math.pow(semiperimetro - t.getBaseMaior(), 2) - t.getLado1()*t.getLado1()) /
                (t.getBaseMaior() - t.getBaseMenor());
        double area = (t.getBaseMaior() + t.getBaseMenor()) * altura / 2;
        return area;
    }


}
