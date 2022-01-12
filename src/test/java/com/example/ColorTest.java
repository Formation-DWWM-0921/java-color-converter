package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe responsable de vérifier le bon fonctionnement de la classe Color
 */
public class ColorTest
{
    @Test
    public void testConstructors()
    {
        Color color;
        color = new Color(255, 204, 0);
        assertEquals(255, color.getRed());
        assertEquals(204, color.getGreen());
        assertEquals(0, color.getBlue());

        color = new Color("ffcc00");
        assertEquals(255, color.getRed());
        assertEquals(204, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    public void testConversions()
    {
        Color color = new Color(255, 204, 0);

        assertEquals("rgb(255, 204, 0)", color.asRgb());
        assertEquals("#FFCC00", color.asHex());
    }
}
