package lab6Singleton.models;

import lab6Singleton.exeception.ExceptionValorNegativoOuZero;


public class Circulo implements FiguraGeometrica{
    private double raio;

    // Construtor
    public Circulo(double raio) throws ExceptionValorNegativoOuZero {
        if (raio <= 0) {
            throw new ExceptionValorNegativoOuZero();
        }
        this.raio = raio;
    }

    // Gets e Sets
    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo com raio de tamanho: " + raio;
    }
}