package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;
import exceptions.BaseMaiorException;
import exceptions.NegativoException;

public interface VisitorIF {
    public double visitaRetangulo(Retangulo r) throws NegativoException;
    public double visitaCirculo(Circulo c) throws NegativoException;
    public double visitaTriangulo(Triangulo t) throws NegativoException;
    public double visitaTrapezio(Trapezio t) throws NegativoException, BaseMaiorException;

}
