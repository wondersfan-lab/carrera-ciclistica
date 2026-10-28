package com.uniajc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquipoTest {

    @Test
    public void testGestionEquipo() {
        Equipo equipo = new Equipo("UNIAJC Elite", "Colombia");
        Velocista v = new Velocista(101, "Carlos Pérez", 450.5, 75.2);
        Escalador e = new Escalador(102, "Andrés Gómez", 2.8f, 14.5f);

        equipo.anadirCiclista(v);
        equipo.anadirCiclista(e);

        assertEquals("UNIAJC Elite", equipo.getNombreEquipo());
        assertEquals("Colombia", equipo.getPais());
    }
}