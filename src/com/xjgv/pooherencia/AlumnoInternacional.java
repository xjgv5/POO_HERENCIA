package com.xjgv.pooherencia;

public class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println("Inicializando alumno internacional");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return super.saludar() + ", soy extranjero del pais " + getPais();
    }

    @Override
    public double calcularPromedio() {
        return ((super.calcularPromedio() * 3) + notaIdiomas) / 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAlumnoInternacional" +
                "pais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
