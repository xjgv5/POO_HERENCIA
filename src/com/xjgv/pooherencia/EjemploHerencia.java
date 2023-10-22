package com.xjgv.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Guzman");
        alumno.setInstitucion("Intituto Nacional");
        alumno.setNotaMatematicas(7);
        alumno.setNotaLenguaje(8);
        alumno.setNotaCiencias(8);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Doe");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(16);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(9.8);
        alumnoInt.setNotaMatematicas(9);
        alumnoInt.setNotaLenguaje(7);
        alumnoInt.setNotaCiencias(10);

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() +
                " " + alumno.getApellido());

        System.out.println("Profesor " + profesor.getAsignatura() +
                " : " + profesor.getNombre() + " " +
                profesor.getApellido());

        Class claseAlumnoInt = alumnoInt.getClass();
        while (claseAlumnoInt.getSuperclass() != null){
            String hija = claseAlumnoInt.getName();
            String padre = claseAlumnoInt.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre : " + padre);
            claseAlumnoInt = claseAlumnoInt.getSuperclass();

        }
    }
}
