package com.uniajc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EscaladorTest {

    @Test
    public void testCrearEscaladorYGetters() {
        Escalador e = new Escalador(102, "Andrés Gómez", 2.8f, 14.5f);
        
        assertEquals(102, e.getIdentificador());
        assertEquals("Andrés Gómez", e.getNombre());
        assertEquals(2.8f, e.getAceleracionPromedio(), 0.001f);
        assertEquals(14.5f, e.getGradoRampa(), 0.001f);
        assertEquals("Es un Escalador", e.imprimirTipo());
    }
}