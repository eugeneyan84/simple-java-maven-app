package com.mycompany.app;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }

    @Test
    public void testTimestamp() {
        App app = new App();
        Date expectedDate = new Date();

        Date actualDate = Date.from(app.getCurrentTimestamp());
        //Instant i = expectedDate.toInstant();
        System.out.println("Expected: "+expectedDate.toString());
        System.out.println("Actual:   "+actualDate.toString());

        assertEquals(expectedDate.toString(), actualDate.toString());
    }
}
