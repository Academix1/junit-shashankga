package com.example.app; // Correct package declaration

import org.junit.*;
import static org.junit.Assert.*;

public class GreetTest {
    
    @Test 
    public void testSaysMethod() {
        Greet gre = new Greet();
        assertEquals("Helloo", gre.says());
    }

    @Test
    public void twoPlusTwoShouldEqualFour() {
        Greet gre1 = new Greet();
        assertEquals(4, gre1.add(2, 2));
    }
}
