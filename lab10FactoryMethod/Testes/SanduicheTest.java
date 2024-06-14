package lab10FactoryMethod.Testes;

import lab10FactoryMethod.criadores.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SanduicheTest {
    @Test
    public void testCriarIngredientes() {
        SanduicheBola sanduiche = new SanduicheBola();
        
        assertNotNull(sanduiche.criarPao());
        assertNotNull(sanduiche.criarQueijo());
        assertNotNull(sanduiche.criarPresunto());
        assertNotNull(sanduiche.criarOvo());
        assertNotNull(sanduiche.criarTomate());
    }

    @Test
    public void testMontar() {
        SanduicheBola sanduiche = new SanduicheBola();
        
        assertDoesNotThrow(() -> sanduiche.montar());
    }

    @Test 
    public void diferentes()
    {
        SanduicheBola sanB = new SanduicheBola();
        SanduicheFit sanF = new SanduicheFit();
        assertNotEquals(sanB.criarPao(), sanF.criarPao());
    }
}