package com.xjgv.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Guzman");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() +
                " " + alumno.getApellido());

        System.out.println("Profesor " + profesor.getAsignatura() +
                " : " + profesor.getNombre() + " " +
                profesor.getApellido());
    }
}
