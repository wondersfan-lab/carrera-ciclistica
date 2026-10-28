package com.uniajc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VelocistaTest {

    @Test
    public void testCrearVelocistaYGetters() {
        Velocista v = new Velocista(101, "Carlos Pérez", 450.5, 75.2);
        
        assertEquals(101, v.getIdentificador());
        assertEquals("Carlos Pérez", v.getNombre());
        assertEquals(450.5, v.getPotenciaPromedio(), 0.001);
        assertEquals(75.2, v.getVelocidadPromedioSprint(), 0.001);
        assertEquals("Es un Velocista", v.imprimirTipo());
    }
}