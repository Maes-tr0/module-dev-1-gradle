package ua.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFullNameTest {

    @Test
    public void testGetFullNameByGSON() {
        MyFullName myFullName = new MyFullName("John", "Doe");
        String expectedJson = """
                {
                  "firstName": "John",
                  "lastName": "Doe"
                }""";
        assertEquals(expectedJson, myFullName.getFullNameByGSON());
    }

    @Test
    public void testGetFirstName() {
        MyFullName myFullName = new MyFullName("Jane", "Doe");
        assertEquals("Jane", myFullName.firstName());
    }

    @Test
    public void testGetLastName() {
        MyFullName myFullName = new MyFullName("Jane", "Doe");
        assertEquals("Doe", myFullName.lastName());
    }
}
