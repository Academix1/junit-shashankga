package src.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.Greet; // Importing the main class

public class GreetTest {

    @Test 
    public void testSaysMethod() {
        Greet gre = new Greet();
        assertEquals("Helloo", gre.says(), "The says method should return 'Helloo'");
    }

    @Test
    public void twoPlusTwoShouldEqualFour() {
        Greet gre1 = new Greet();
        assertEquals(4, gre1.add(2, 2), "Adding 2 and 2 should equal 4");
    }
}
