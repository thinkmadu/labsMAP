package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Triangulo;
import elementosConcretos.Trapezio;

public class VisitorCalculaPerimetro implements VisitorIF{
    public double visitaCirculo(Circulo c){ return 2 * 3.14 * c.getRaio(); }
    public double visitaRetangulo(Retangulo r){ return r.getAltura() + r.getAltura() + r.getLargura() + r.getLargura();}
    public double visitaTriangulo(Triangulo t){ return t.getBase() + t.getBase() + t.getBase();}
    public double visitaTrapezio(Trapezio t){ return t.getBaseMaior() + t.getBaseMenor() + t.getLado1() + t.getLado2();}
}
