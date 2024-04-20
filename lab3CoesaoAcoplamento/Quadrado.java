package lab3CoesaoAcoplamento;

public class Quadrado extends FigurasGeometricas{
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toStringDaFigura() {
        return "O quadrado criado tem lados de tamanho: " + lado;
    }
}
