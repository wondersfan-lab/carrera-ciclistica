package com.uniajc;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private String pais;
    private static int totalTiempoCarrera = 0; // Atributo estático para la suma de tiempos en minutos
    private List<Ciclista> listaCiclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.listaCiclistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static int getTotalTiempoCarrera() {
        return totalTiempoCarrera;
    }

    public void anadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
        totalTiempoCarrera += ciclista.getTiempoAcumulado();
    }

    public void imprimirDatosEquipo() {
        System.out.println("========================================");
        System.out.println("          DATOS DEL EQUIPO             ");
        System.out.println("========================================");
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País del equipo: " + pais);
        System.out.println("Tiempo total acumulado del equipo: " + totalTiempoCarrera + " minutos");
        System.out.println("----------------------------------------");
        System.out.println("Ciclistas integrantes:");
        for (Ciclista c : listaCiclistas) {
            c.imprimirDatos(); // Llama al método polimórfico heredado
            System.out.println("----------------------------------------");
        }
    }

    public int calcularTotalTiempo() {
        int total = 0;
        for (Ciclista c : listaCiclistas) {
            total += c.getTiempoAcumulado();
        }
        return total;
    }
}