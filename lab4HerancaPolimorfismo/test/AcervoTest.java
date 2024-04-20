package lab4HerancaPolimorfismo.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import lab4HerancaPolimorfismo.*;

public class AcervoTest {
    private Acervo acervo;
    private Filme filme1;

    @Before
    public void setUp() {
        acervo = new Acervo();
        filme1 = acervo.adicionarFilme("Minha Mãe É uma Peça", "2013", "Comedy");
    }

    @Test
    public void movieNotNull() throws Exception{
        assertNotNull(filme1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void movieRepeated() throws Exception{
       Filme filme2 = acervo.adicionarFilme("Minha Mãe É uma Peça", "2013", "Comedy");
    }

    @Test
    public void testShowfilmes() {
        try {
            acervo.mostrarFilmes();
        } catch (Exception e) {
            fail("Não foi possível mostrar os filmes");
        }
    }
}
