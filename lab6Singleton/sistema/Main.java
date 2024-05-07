// Main.java (updated)
package lab6Singleton.sistema;
import lab6Singleton.exeception.ExceptionValorNegativoOuZero;
import lab6Singleton.models.*;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Cálculos usando a fachada:");
            System.out.println("Área do círculo: " + Fachada.calcularAreaCirculo(5.0));
            System.out.println("Perímetro do círculo: " + Fachada.calcularPerimetroCirculo(5.0));

            System.out.println("\nÁrea do quadrado: " + Fachada.calcularAreaQuadrado(4.0));
            System.out.println("Perímetro do quadrado: " + Fachada.calcularPerimetroQuadrado(4.0));

            System.out.println("\nÁrea do triângulo: " + Fachada.calcularAreaTriangulo(3.0, 4.0, 5.0));
            System.out.println("Perímetro do triângulo: " + Fachada.calcularPerimetroTriangulo(3.0, 4.0, 5.0));

        } catch (ExceptionValorNegativoOuZero e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
