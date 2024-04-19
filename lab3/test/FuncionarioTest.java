package lab3.test;

import lab3.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FuncionarioTest {
    private Filme filme;
    private Funcionario func1;
    private Funcionario func2;
    private Funcionario func3;

    @Before
    public void setUp() {
        filme = new Filme("The Shawshank Redemption", "1994", "Drama");
        func1 = filme.adicionarFuncionario("Andy Dufresne", "001");
        func2 = filme.adicionarFuncionario("Ellis Boyd 'Red' Redding", "002");
        func3 = filme.adicionarFuncionario("Warden Samuel Norton", "003");
    }


    @Test // Verificação se os trabalhadores foram registrados corretamente
    public void testRegisterWorker() throws Exception{
        assertEquals("Andy Dufresne", func1.getNome());
        assertEquals("Ellis Boyd 'Red' Redding", func2.getNome());
        assertEquals("Warden Samuel Norton", func3.getNome());
    }

    @Test // Verificação se a exceção é lançada ao tentar registrar um trabalhador com o mesmo ID
    public void testException(){
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            filme.adicionarFuncionario("Andy Dufresne", "001");
        });
        assertTrue(thrown.getMessage().contains("funcionário já registrado!"));
    }
}
