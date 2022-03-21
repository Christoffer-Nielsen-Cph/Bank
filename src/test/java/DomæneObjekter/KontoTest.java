package DomæneObjekter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {



    @Test
    void indsæt() {
        Konto konto = new Konto("Chris","123",420);
        assertEquals(520,konto.indsæt(100));
    }

    @Test
    void indsætNegativ() {
        Konto konto = new Konto("Chris","123",200);
        assertEquals(200,konto.indsæt(-100));
    }

    @Test
    void hævPenge() {
        Konto konto = new Konto("Chris","123",500);
        assertEquals(500,konto.hævPenge(1000));
    }
}