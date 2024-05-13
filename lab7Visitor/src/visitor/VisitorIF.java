package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;

public interface VisitorIF {
    public double visitaRetangulo(Retangulo r);
    public double visitaCirculo(Circulo c);
    public double visitaTriangulo(Triangulo t);
    public double visitaTrapezio(Trapezio t);

}
