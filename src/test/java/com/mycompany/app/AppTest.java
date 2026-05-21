package com.mycompany.app;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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
        Date currentDate = new Date();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // 1. Parse to LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(app.getCurrentTimestamp(), formatter);
        
        // 2. Convert to java.util.Date (if necessary)
        Date date1 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        assertEquals(currentDate, date1);
    }
}
