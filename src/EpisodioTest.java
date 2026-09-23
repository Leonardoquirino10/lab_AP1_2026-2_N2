
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EpisodioTest {

    @Test
    void nasceNaoAssistido() {
        Episodio e = new Episodio("Piloto", 1, 42);
        assertFalse(e.estaAssistido());
        assertEquals(42, e.getMinutos());
    }

    @Test
    void marcaAssistido() {
        Episodio e = new Episodio("Piloto", 1, 42);
        e.marcarAssistido();
        assertTrue(e.estaAssistido());
    }

    @Test
    void minutosNegativosViramZero() {
        Episodio e = new Episodio("X", 1, -5);
        assertEquals(0, e.getMinutos());
    }
}
