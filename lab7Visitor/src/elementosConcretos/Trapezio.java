package elementosConcretos;

import visitor.VisitorIF;

public class Trapezio implements ElementoConcretoIF{

    private double lado1, lado2, baseMaior, baseMenor;

    public Trapezio(double l1, double l2, double bMaior, double bMenor){
        this.lado1 = l1;
        this.lado2 = l2;
        this.baseMaior = bMaior;
        this.baseMenor = bMenor;
    }

    public double getLado1(){ return this.lado1; }
    public double getLado2(){ return this.lado2; }
    public double getBaseMaior(){ return this.baseMaior; }
    public double getBaseMenor(){ return this.baseMenor; }
    public void aceitaVisita(VisitorIF v){
        v.visitaTrapezio(this);
    }
}
