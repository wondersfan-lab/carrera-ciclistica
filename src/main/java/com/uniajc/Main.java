package com.uniajc;

public class Main {
    public static void main(String[] args) {
        // Instanciar un objeto de la clase Equipo (sin argumentos con nombre)
        Equipo miEquipo = new Equipo("UNIAJC Elite", "Colombia");

        // Crear los ciclistas respetando los constructores de tus compañeros
        Velocista velocista = new Velocista(101, "Carlos Pérez", 450.5, 75.2);
        velocista.setTiempoAcumulado(120);

        Escalador escalador = new Escalador(102, "Andrés Gómez", 2.8f, 14.5f);
        escalador.setTiempoAcumulado(145);

        Contrarrelojista contrarrelojista = new Contrarrelojista(103, "Felipe Rodríguez", 58.4);
        contrarrelojista.setTiempoAcumulado(110);

        // Agregar los ciclistas al equipo
        miEquipo.anadirCiclista(velocista);
        miEquipo.anadirCiclista(escalador);
        miEquipo.anadirCiclista(contrarrelojista);

        // Mostrar los resultados ejecutando el programa por consola
        miEquipo.imprimirDatosEquipo();
    }
}