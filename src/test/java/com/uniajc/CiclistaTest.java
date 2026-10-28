package com.uniajc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CiclistaTest {

    @Test
    public void testAtributosYGettersCiclista() {
        // Como Ciclista es abstracta, usamos una subclase (Velocista) para probar los métodos heredados
        Ciclista ciclista = new Velocista(101, "Rigoberto Urán", 400.0, 65.0);

        assertEquals(101, ciclista.getIdentificador());
        assertEquals("Rigoberto Urán", ciclista.getNombre());
        
        // Probando acumulado de tiempo
        ciclista.setTiempoAcumulado(120);
        assertEquals(120, ciclista.getTiempoAcumulado());
    }
}