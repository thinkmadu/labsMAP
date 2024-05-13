package visitor;

import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;

import java.util.ArrayList;

public class VisitorMaxFigura implements VisitorIF{

    public double visitaCirculo(Circulo c) {
        return Math.pow(c.getRaio(), 2);
    }

    public double visitaRetangulo(Retangulo r) {
        double alturaDobrada = r.getAltura() * 2;
        double larguraDobrada = r.getLargura() * 2;
        return alturaDobrada;
    }

    public double visitaTrapezio(Trapezio t) {
        return 0;
    }

    public double visitaTriangulo(Triangulo t) {
        return 0;
    }
}
