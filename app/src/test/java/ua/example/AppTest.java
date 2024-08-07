package ua.example;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testMain() {
        String input = "John\nDoe\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(new String[]{});

        String expectedOutput = """
                Write your first name: Write your last name:\s
                Your full name is:
                {
                  "firstName": "John",
                  "lastName": "Doe"
                }""";

        assertEquals(expectedOutput.trim(), out.toString().trim());
    }

    @Test
    public void testApp() {
        assertTrue(true);
    }
}
