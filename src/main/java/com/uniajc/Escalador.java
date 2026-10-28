package com.uniajc;

public class Escalador extends Ciclista {

    private float aceleracionPromedio; // m/s²
    private float gradoRampa;          // grados

    public Escalador(int id, String nombre, float aceleracion, float grado) {
        super(id, nombre);
        this.aceleracionPromedio = aceleracion;
        this.gradoRampa = grado;
    }

    protected float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    protected void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    protected float getGradoRampa() {
        return gradoRampa;
    }

    protected void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "Escalador";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo: " + imprimirTipo());
        System.out.println("Aceleración promedio en subida: " + aceleracionPromedio + " m/s²");
        System.out.println("Grado de rampa soportada: " + gradoRampa + "°");
    }
}
