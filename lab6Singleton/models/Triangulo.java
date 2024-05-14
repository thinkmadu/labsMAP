package lab6Singleton.models;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.exeception.ExceptionViolacaoDesigualdade;

public class Triangulo implements FiguraGeometrica {
    protected double lado1, lado2, lado3;

    private static Triangulo trianguloIsosceles = null;
    private static Triangulo trianguloEquilatero = null;
    private static Triangulo trianguloRetangulo = null;


    // Construtor

    private Triangulo(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero,ExceptionViolacaoDesigualdade {
              
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new ExceptionValorNegativoOuZero();
        }
        if (violaDesigualdadeTriangulo(lado1,lado2,lado3)){
            throw new ExceptionViolacaoDesigualdade();
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    public static Triangulo getTrianguloInstance(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero, ExceptionViolacaoDesigualdade {
        if (Triangulo.verificacaoTEquilatero(lado1, lado2, lado3)) {
            if (trianguloEquilatero == null) {
                trianguloEquilatero = new Triangulo(lado1, lado2, lado3);
            }
            return trianguloEquilatero;
        } else if (Triangulo.verificacaoTIsosceles(lado1, lado2, lado3)) {
            if (trianguloIsosceles == null) {
                trianguloIsosceles = new Triangulo(lado1, lado2, lado3);
            }
            return trianguloIsosceles;
        } else if (Triangulo.verificacaoTRetangulo(lado1, lado2, lado3)) {
            if (trianguloRetangulo == null) {
                trianguloRetangulo = new Triangulo(lado1, lado2, lado3);
            }
            return trianguloRetangulo;
        }
        throw new ExceptionViolacaoDesigualdade();
    }
    

    // Gets e sets -------------------------------------------------------------------
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    //--------------------------------------------------------------------------------------------


    // Verifica se a figura é um  triangulo retangulo (A² + B² = C²)
    public static boolean verificacaoTRetangulo(double lado1, double lado2, double lado3){
        double[] array = {lado1, lado2, lado3};
        Arrays.sort(array);
        lado1 = array[0];
        lado2 = array[1];
        lado3 = array[2];
        if(Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2)){
            return true;
        }
        return false;
    }

    // Verifica se a figura é um  triangulo equilatero (todos os lados iguais)
    public static boolean verificacaoTEquilatero(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return true;
        }
        return false;
    }

    // Verifica se a figura é um  triangulo isosceles (2 lados iguais)
    public static boolean verificacaoTIsosceles(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return true;
        }
        return false;
    }

    
    //verifica se os lados violam a desigualdade triangular
    private static boolean violaDesigualdadeTriangulo(double lado1, double lado2, double lado3) { 
        return lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1; 
    } 
 
 
    public int getNumberOfUniquelados() { 
        Set<Double> lados = new HashSet<>(); 
 
        lados.add(lado1); 
        lados.add(lado2); 
        lados.add(lado3); 
 
        return lados.size(); 
    } 

    //Soma dos lados / 3
    @Override
    public double getArea() {
        //triangulo equilatero
        if (verificacaoTEquilatero( lado1,  lado2,  lado3)){
            return (Math.sqrt(3) * Math.pow(lado1, 2)) / 4;
        }
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s*(s- lado1)*(s- lado2)*(s- lado3));
    }

    @Override
    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Os lados do triângulo são iguais a: " + lado1 +"," + lado2 +"," + lado3;
    }
}
