package lab4HerancaPolimorfismo.test;

import lab4HerancaPolimorfismo.Funcoes.*;
import lab4HerancaPolimorfismo.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilmesTest {
    private Funcionario func;

    @Before
    public void setUp() {
        func = new Funcionario("Fernanda Montenegro", "40028922");
        func.setOcupacao(new Ator());
        func.setOcupacao(new Roteirista());
    }

    @Test
    public void testGetName() {
        assertEquals("Fernanda Montenegro", func.getNome());
    }

    @Test
    public void testSetName() {
        func.setNome("Marina Ruy Barbosa");
        assertEquals("Marina Ruy Barbosa", func.getNome());
    }

    @Test
    public void testGetId() {
        assertEquals("40028922", func.getId());
    }

    @Test
    public void testSetId() {
        func.setId("54321");
        assertEquals("54321", func.getId());
    }

    @Test
    public void testGetOccupations() {
        // Testa se a lista de ocupações está inicialmente vazia
        assertFalse(func.getOcupacoes().isEmpty());
    }

    @Test
    public void testSetOccupation() {
        // Tenta adicionar uma ocupação de escritor que já existe
        // worker.setOccupation(new Writer());
        // Testa se o trabalhador tem 2 ocupações
        assertEquals(2, func.getOcupacoes().size());
    }
}
