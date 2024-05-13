import elementosConcretos.Circulo;
import elementosConcretos.Triangulo;
import visitor.VisitorCalculaArea;
import visitor.VisitorCalculaPerimetro;
import visitor.VisitorDesenhaFigura;
import visitor.VisitorIF;

public class Main {
    public static void main(String[] args) {
        VisitorIF visitorC = new VisitorCalculaPerimetro();
        Triangulo triangulo= new Triangulo(15, 7);
        triangulo.aceitaVisita(visitorC);
    }
}