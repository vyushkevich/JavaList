package com.diasdelasemana;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class DiasDeLaSemanaManagerTest {

    private DiasDeLaSemanaManager diasManager;

    @BeforeEach
    public void setUp() {
        diasManager = new DiasDeLaSemanaManager();
    }

    @Test
    public void testCrearListaDias() {
        List<String> dias = diasManager.obtenerDias();
        assertEquals(7, dias.size(), "La lista debe contener 7 días.");
    }

    @Test
    public void testObtenerDias() {
        List<String> dias = diasManager.obtenerDias();
        assertNotNull(dias, "La lista no debe ser nula.");
        assertEquals(7, dias.size(), "La lista debe contener 7 días.");
        assertTrue(dias.contains("Lunes"), "La lista debe contener Lunes.");
        assertTrue(dias.contains("Martes"), "La lista debe contener Martes.");
        assertTrue(dias.contains("Miércoles"), "La lista debe содержать Miércoles.");
        assertTrue(dias.contains("Jueves"), "La lista debe содержать Jueves.");
        assertTrue(dias.contains("Viernes"), "La lista debe содержать Viernes.");
        assertTrue(dias.contains("Sábado"), "La lista debe содержать Sábado.");
        assertTrue(dias.contains("Domingo"), "La lista debe содержать Domingo.");
    }

    
}
