package elementosConcretos;

import visitor.VisitorIF;

public class Triangulo implements ElementoConcretoIF{
    public double altura, base;

    public Triangulo(double a, double b){
        this.altura = a;
        this.base = b;
    }

    public double getAltura(){ return this.altura; }

    public double getBase(){ return this.base; }

    public void aceitaVisita(VisitorIF v){
        v.visitaTriangulo(this);
    }
}
