package lab9MVCObserver.testes;

import lab9MVCObserver.model.Onibus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OnibusTest {
    private Onibus onibus;

    @BeforeEach
    public void setUp() {
        onibus = new Onibus(10); // Cria um ônibus com 10 assentos para os testes
    }

    @Test
    public void testReservarAssento() {
        assertTrue(onibus.reservarAssento(1));
        assertEquals("reservado", onibus.getAssentos().get(0).getStatus());

        assertFalse(onibus.reservarAssento(1)); // Assento já reservado
    }

    @Test
    public void testComprarAssento() {
        assertTrue(onibus.comprarAssento(2));
        assertEquals("indisponivel", onibus.getAssentos().get(1).getStatus());

        assertFalse(onibus.comprarAssento(2)); // Assento já comprado
    }

    @Test
    public void testReservarAssentoInexistente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            onibus.reservarAssento(11); // Assento não existe
        });

        String expectedMessage = "Assento 11 não existe.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testComprarAssentoInexistente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            onibus.comprarAssento(11); // Assento não existe
        });

        String expectedMessage = "Assento 11 não existe.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
