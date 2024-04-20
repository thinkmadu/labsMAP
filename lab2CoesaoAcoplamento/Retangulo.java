package lab2CoesaoAcoplamento;

public class Retangulo extends FigurasGeometricas{
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    @Override
    public String toStringDaFigura() {
        return "O retângulo criado tem altura : " + altura + " e largura : " + largura;
    }
}
