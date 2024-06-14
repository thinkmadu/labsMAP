package lab9MVCObserver.testes;
import lab9MVCObserver.control.OnibusController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnibusControllerTest {
    private OnibusController controller;

    @BeforeEach
    public void setUp() {
        controller = new OnibusController(10);
    }

    @Test
    public void testReservarAssentoInexistente() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> controller.reservarAssento(11),
                "Expected reservarAssento(11) to throw, but it didn't"
        );

        assertEquals("Assento 11 não existe.", thrown.getMessage());
    }

    @Test
    public void testComprarAssentoInexistente() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> controller.comprarAssento(11),
                "Expected comprarAssento(11) to throw, but it didn't"
        );

        assertEquals("Assento 11 não existe.", thrown.getMessage());
    }
}
