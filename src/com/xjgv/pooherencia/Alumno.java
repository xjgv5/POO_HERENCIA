package com.xjgv.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematicas;
    private double notaLenguaje;
    private double notaCiencias;

    public Alumno(){
        System.out.println("Inicializando alumno");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematicas, double notaLenguaje, double notaCiencias) {
        this(nombre, apellido, edad, institucion);
        this.notaMatematicas = notaMatematicas;
        this.notaLenguaje = notaLenguaje;
        this.notaCiencias = notaCiencias;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaLenguaje() {
        return notaLenguaje;
    }

    public void setNotaLenguaje(double notaLenguaje) {
        this.notaLenguaje = notaLenguaje;
    }

    public double getNotaCiencias() {
        return notaCiencias;
    }

    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + " soy un alumno y mi nombre es: " + getNombre();
    }

    public double calcularPromedio(){
        return (notaCiencias + notaLenguaje + notaMatematicas) / 3;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\ninstitucion='" + institucion + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaLenguaje=" + notaLenguaje +
                ", notaCiencias=" + notaCiencias +
                ", promedio=" + this.calcularPromedio();
    }
}
