package gestionEstudiantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Pepito1", 123, 5);
        Estudiante estudiante2 = new Estudiante("Pepito2", 456, 4);
        Estudiante estudiante3 = new Estudiante("Pepito3", 789, 3);

        Escuela normalSuperior = new Escuela();

        normalSuperior.agregarEstudiante(estudiante1);
        normalSuperior.agregarEstudiante(estudiante2);
        normalSuperior.agregarEstudiante(estudiante3);


        Scanner scannerNum = new Scanner(System.in);
        Scanner scannerTxt = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n");
            System.out.println("---SISTEMA MANEJO ESTUDIANTES----");
            System.out.println("Opciones disponibles en el sistema");
            System.out.println("(1) Agregar un nuevo estudiante");
            System.out.println("(2) Buscar un nuevo estudiante");
            System.out.println("(3) Mostrar estudiantes registrados");
            System.out.println("(4) Salir del programa");
            System.out.println("Seleccione una opción");
            System.out.println("\n");

            opcion = scannerNum.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Digita el nombre del estudiante");
                    String nombreEstudiante = scannerTxt.nextLine();
                    System.out.println("Digita el id del estudiante");
                    int idEstudiante = scannerNum.nextInt();
                    System.out.println("Digita la calificación del estudiante de 0 a 10");
                    double calificacion = scannerNum.nextInt();
                    while(calificacion < 0 || calificacion > 10){
                        System.out.println("Digita una calificación valida entre 0 a 10");
                         calificacion = scannerNum.nextInt();
                    }

                    Estudiante nuevoEstudiante = new Estudiante(nombreEstudiante, idEstudiante, calificacion);

                    normalSuperior.agregarEstudiante(nuevoEstudiante);

                    break;
                case 2:
                    System.out.println("Ingresa el ID del estudiante");
                    int id = scannerNum.nextInt();
                    Estudiante estudianteConsultado = normalSuperior.buscarEstudiante(id);
                    if (estudianteConsultado != null){
                        System.out.println("El estudiante se encuentra registrado con el nombre de " + estudianteConsultado.getNombre());
                    }else{
                        System.out.println("El estudiante no se encuentra registrado");
                    }
                    break;
                case 3:
                    normalSuperior.mostrarEstudiantes();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\n");
            }


        }while (opcion != 4);


        normalSuperior.mostrarEstudiantes();

    }
}