import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertTrue(EvenOrOdd.isEven(4));
        assertEquals("Even", EvenOrOdd.check(10));
    }

    @Test
    void testOddNumber() {
        assertFalse(EvenOrOdd.isEven(7));
        assertEquals("Odd", EvenOrOdd.check(3));
    }

    @Test
    void testZero() {
        assertTrue(EvenOrOdd.isEven(0));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals("Odd", EvenOrOdd.check(-3));
        assertEquals("Even", EvenOrOdd.check(-4));
    }
}
