package com.uniajc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContrarrelojistaTest {

    @Test
    public void testCrearContrarrelojistaYGetters() {
        Contrarrelojista c = new Contrarrelojista(103, "Felipe Rodríguez", 58.4);
        
        assertEquals(103, c.getIdentificador());
        assertEquals("Felipe Rodríguez", c.getNombre());
        assertEquals(58.4, c.getVelocidadMaxima(), 0.001);
        assertEquals("Es un Contrarrelojista", c.imprimirTipo());
    }
}