package elementosConcretos;

import visitor.VisitorIF;

public class Retangulo implements ElementoConcretoIF{
    private double altura;
    private double largura;

    public Retangulo(double a, double l){
        this.altura = a;
        this.largura = l;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getLargura(){
        return this.largura;
    }

    public void aceitaVisita(VisitorIF v){
        v.visitaRetangulo(this);
    }

}
