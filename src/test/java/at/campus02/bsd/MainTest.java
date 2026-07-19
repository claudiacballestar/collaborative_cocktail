package at.campus02.bsd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static at.campus02.bsd.Main.readNr;

/**
 * <link>
 * https://www.geeksforgeeks.org/advance-java/unit-testing-system-in-for-input-handling-in-junit/
 * and some more research: how to test console.in results
 *
 */
public class MainTest {

    private final InputStream originalIn = System.in;

    /**
     * test when input is 1 - returns 1
     */
    @Test
    public void testReadNrInput1() {
        // Simulate user input
        String simulatedInput = "1\n"; // with jumpline
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes()); // translate into bytes
        System.setIn(testIn);

        try {
            int inputInt = InputReader.readNr();
            String input = String.valueOf(inputInt);
            assertEquals("1", input);
        } finally {
            // siempre restaurar System.in
            System.setIn(originalIn);
        }

    }

    /**
     * Test when the input is 3 - returns 3
     */
    @Test
    public void testReadNrInput3() {
        // Simulate user input
        String simulatedInput = "3\n"; // with jumpline
        ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedInput.getBytes()); // translate into bytes
        System.setIn(testIn);

        try {
            int inputInt = InputReader.readNr();
            String input = String.valueOf(inputInt);
            assertEquals("3", input);
        } finally {
            // siempre restaurar System.in
            System.setIn(originalIn);
        }
    }


}


