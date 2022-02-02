import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {
    Personne ivan = new Personne("Ivan");
    Personne hilary = new Personne("Hilary");

    Montre m1 = new Montre(9, 25);

    @Test
    void attribuerMontre() {
        ivan.attribuerMontre(m1);
        assertNotNull(ivan.m);
    }

    @Test
    void enleveMontre() {
        ivan.attribuerMontre(m1);
        ivan.enleveMontre();
        assertNull(ivan.m);
    }

    @Test
    void donneHeure() {
        ivan.attribuerMontre(m1);
        String heur = ivan.donneHeure();
        assertEquals("9h25min", heur);
    }

    @Test
    void demandeHeure() {

    }

}