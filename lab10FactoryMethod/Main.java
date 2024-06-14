package lab10FactoryMethod;
import lab10FactoryMethod.criadores.*;


public class Main {
    public static void main(String[] args) {
        SanduicheFactory sanduicheFit = new SanduicheFit();
        sanduicheFit.montar();

        SanduicheFactory sanduicheBasico = new SanduicheBasico();
        sanduicheBasico.montar();

        SanduicheFactory sanduicheBola = new SanduicheBola();  
        sanduicheBola.montar();
    }
}