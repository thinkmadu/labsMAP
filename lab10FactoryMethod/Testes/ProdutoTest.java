package lab10FactoryMethod.Testes;

import lab10FactoryMethod.ProdutosConcretos.*;
import lab10FactoryMethod.Produtos.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProdutoTest {

    @Test
    public void testPaoIntegral() {
        Pao pao = new PaoIntegral();
        assertTrue(pao instanceof PaoIntegral);
    }

    @Test
    public void testQueijoPrato() {
        Queijo queijo = new QueijoPrato();
        assertTrue(queijo instanceof QueijoPrato);
    }

    @Test
    public void testPresuntoPeru() {
        Presunto presunto = new PresuntoPeru();
        assertTrue(presunto instanceof PresuntoPeru);
    }

    @Test
    public void testOvoCapoeira() {
        Ovo ovo = new OvoCapoeira();
        assertTrue(ovo instanceof OvoCapoeira);
    }

    @Test
    public void testTomate() {
        Tomate tomate = new Tomate();
        assertTrue(tomate instanceof Tomate);
    }
}