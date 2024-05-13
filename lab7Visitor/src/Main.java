import elementosConcretos.Circulo;
import elementosConcretos.Retangulo;
import elementosConcretos.Trapezio;
import elementosConcretos.Triangulo;
import exceptions.BaseMaiorException;
import exceptions.NegativoException;
import visitor.*;

public class Main {
    public static void main(String[] args) throws NegativoException, BaseMaiorException {
        // criação dos Visitors
        VisitorIF visitorMF = new VisitorMaxFigura();
        VisitorIF visitorDF = new VisitorDesenhaFigura();
        VisitorIF visitorC = new VisitorCalculaPerimetro();
        VisitorIF visitorCA = new VisitorCalculaArea();

        Triangulo triangulo = new Triangulo(5, 7);
        Trapezio trapezio = new Trapezio(5, 5, 20, 15);
        Retangulo retangulo = new Retangulo(5, 10);
        Circulo circulo = new Circulo(5);



        trapezio.aceitaVisita(visitorCA);
        System.out.println();
        triangulo.aceitaVisita(visitorCA);
        System.out.println();
        circulo.aceitaVisita(visitorCA);
        System.out.println();
        retangulo.aceitaVisita(visitorCA);
        System.out.println();

        trapezio.aceitaVisita(visitorMF);
        System.out.println();
        triangulo.aceitaVisita(visitorMF);
        System.out.println();
        circulo.aceitaVisita(visitorMF);
        System.out.println();
        retangulo.aceitaVisita(visitorMF);
        System.out.println();

        trapezio.aceitaVisita(visitorC);
        System.out.println();
        triangulo.aceitaVisita(visitorC);
        System.out.println();
        circulo.aceitaVisita(visitorC);
        System.out.println();
        retangulo.aceitaVisita(visitorC);
        System.out.println();

        trapezio.aceitaVisita(visitorDF);
        System.out.println();
        triangulo.aceitaVisita(visitorDF);
        System.out.println();
        circulo.aceitaVisita(visitorDF);
        System.out.println();
        retangulo.aceitaVisita(visitorDF);
    }
}