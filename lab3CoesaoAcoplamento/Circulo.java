package lab3CoesaoAcoplamento;

public class Circulo extends FigurasGeometricas {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toStringDaFigura() {
        return "O círculo criado tem raio de tamanho: " + raio;
    }
}
