package lab3CoesaoAcoplamento;

public class BrincandoComAsFigurasGeometricas {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 5);
        Quadrado quadrado = new Quadrado(-2);
        Circulo circulo = new Circulo(25);

        try {
            double per = retangulo.calcularPerimetro();
            System.out.println("Perímetro do retângulo: " + per);
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            double area = quadrado.calcularArea();
            System.out.println("Área do quadrado: " + area);
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        String inf = circulo.toStringDaFigura();
        System.out.println(inf);
    }
}

