// Main.java (updated)
package lab6Singleton.sistema;

import lab6Singleton.exeception.*;
import lab6Singleton.models.*;

public class Main {

    public static void main(String[] args) {
        try {
            //  círculo único
            Circulo circulo = Fachada.criarCirculo(5.0);
            System.out.println("Círculo: Área = " + circulo.getArea() + ", Perímetro = " + circulo.getPerimetro());
            
            //vai exibir as informações do círculo anterior
            Circulo circulo2 = Fachada.criarCirculo(6.0);
            System.out.println("Círculo: Área = " + circulo2.getArea() + ", Perímetro = " + circulo2.getPerimetro());
            System.out.println("-".repeat(20));


            //triângulo equilátero único
            Triangulo trianguloE = Fachada.criarTriangulo(3, 3, 3);
            System.out.println("Triângulo: Área = " + trianguloE.getArea() + ", Perímetro = " + trianguloE.getPerimetro());

            //outro equilátero 
            Triangulo trianguloE2 = Fachada.criarTriangulo(4, 4, 4);
            System.out.println("Triângulo: Área = " + trianguloE2.getArea() + ", Perímetro = " + trianguloE2.getPerimetro());
            System.out.println("-".repeat(20));


            //triângulo isosceles único
            Triangulo trianguloI = Fachada.criarTriangulo(3.0, 3.0, 2.0);
            System.out.println("Triângulo: Área = " + trianguloI.getArea() + ", Perímetro = " + trianguloI.getPerimetro());

            //outro isosceles 
            Triangulo trianguloI2 = Fachada.criarTriangulo(4.0, 4.0, 2.0);
            System.out.println("Triângulo: Área = " + trianguloI2.getArea() + ", Perímetro = " + trianguloI2.getPerimetro());
            System.out.println("-".repeat(20));


            //triângulo retângulo único
            Triangulo trianguloR = Fachada.criarTriangulo(3.0, 4.0, 5.0);
            System.out.println("Triângulo: Área = " + trianguloR.getArea() + ", Perímetro = " + trianguloR.getPerimetro());

            // outro retangulo
            Triangulo trianguloR2 = Fachada.criarTriangulo(5.0, 12.0, 13.0);
            System.out.println("Triângulo: Área = " + trianguloR2.getArea() + ", Perímetro = " + trianguloR2.getPerimetro());   
            System.out.println("-".repeat(20));


            Quadrado quadrado1 = Fachada.criarQuadrado(5.0);
            System.out.println("Quadrado: Área = " + quadrado1.getArea() + ", Perímetro = " + quadrado1.getPerimetro());

            Quadrado quadrado2 = Fachada.criarQuadrado(10.0);
            System.out.println("Quadrado: Área = " + quadrado2.getArea() + ", Perímetro = " + quadrado2.getPerimetro());

            Quadrado quadrado3 = Fachada.criarQuadrado(15.0);
            System.out.println("Quadrado: Área = " + quadrado3.getArea() + ", Perímetro = " + quadrado3.getPerimetro());
            System.out.println("-".repeat(20));

        } catch (ExceptionValorNegativoOuZero | ExceptionViolacaoDesigualdade e) {
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}