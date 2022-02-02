import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontreTest {
    Montre m1 = new Montre(9, 25);

    @Test
    void avance() {
        m1.avance();
        String heur = m1.getHeure() + "h" + m1.getMinute() + "min";
        assertEquals("9h26min", heur );
    }
}