package com.xjgv.pooherencia;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        System.out.println("************ creando la instancia de alumno ***************");

        Alumno alumno = new Alumno("Andres", "Guzman", 16, "Instituto Nacional");
        alumno.setNotaMatematicas(7);
        alumno.setNotaLenguaje(8);
        alumno.setNotaCiencias(8);
        alumno.setEmail("andres@alumno.com");

        System.out.println("*********** Creando la instancia alumno internacional****************");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("John", "Doe", "Australia");

        alumnoInt.setEdad(16);
        alumnoInt.setNotaIdiomas(9.8);
        alumnoInt.setNotaMatematicas(9);
        alumnoInt.setNotaLenguaje(7);
        alumnoInt.setNotaCiencias(10);

        Profesor profesor = new Profesor("Luci", "Pérez", "Ciencias");
        profesor.setEdad(34);

        imprimir(alumno);
        imprimir(profesor);
        imprimir(alumnoInt);
    }

    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}
