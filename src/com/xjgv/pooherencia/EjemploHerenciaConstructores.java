package com.xjgv.pooherencia;

public class EjemploHerenciaConstructores {
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
        System.out.println("***** Imprimiendo los datos del tipo persona *****");

        System.out.println("nombre: " + persona.getNombre()
        + ", apellido: " + persona.getApellido()
        + ", edad: " + persona.getEdad()
        + ", email: " + persona.getEmail());
        if (persona instanceof Alumno){
            System.out.println("***** Imprimiendo los datos del tipo alumno *****");
            System.out.println("Institucion : " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matematicas : " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota lenguaje: " + ((Alumno) persona).getNotaLenguaje());
            System.out.println("Nota ciencias : " + ((Alumno) persona).getNotaCiencias());
            System.out.println("************ Sobre escritura saludar *****************");
            System.out.println(persona.saludar());
            System.out.println("******************************************************");
            if (persona instanceof AlumnoInternacional){
                System.out.println("***** Imprimiendo los datos del tipo alumno internacional *****");

                System.out.println("Nota idiomas : " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais : " + ((AlumnoInternacional) persona).getPais());
                System.out.println("************ Sobre escritura saludar *****************");
                System.out.println(persona.saludar());
                System.out.println("Promedio : " + ((AlumnoInternacional) persona).calcularPromedio());
                System.out.println("******************************************************");

            }
        }

        if (persona instanceof Profesor){
            System.out.println("***** Imprimiendo los datos del tipo profesor *****");

            System.out.println("Asignatura : " + ((Profesor) persona).getAsignatura());

            System.out.println("************ Sobre escritura saludar *****************");
            System.out.println(persona.saludar());
            System.out.println("******************************************************");
        }
        System.out.println();
    }
}
