import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;
import visitor.*;

public class Main {
    public static void main(String[] args) {
        // criação dos Visitors
        VisitorIF visitorMF = new VisitorMaxFigura();
        VisitorIF visitorDF = new VisitorDesenhaFigura();
        VisitorIF visitorC = new VisitorCalculaPerimetro();
        VisitorIF visitorCA = new VisitorCalculaArea();

        Triangulo triangulo = new Triangulo(5, 7);
        Trapezio trapezio= new Trapezio(5, 5, 20, 15);
        trapezio.aceitaVisita(visitorCA);
        triangulo.aceitaVisita(visitorC);
        trapezio.aceitaVisita(visitorDF);
    }
}