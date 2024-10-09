package gestionEstudiantes;

import java.util.HashSet;
import java.util.Set;

public class Escuela {
    private Set<Estudiante> listaEstudiantes;

    public Escuela(){
        listaEstudiantes = new HashSet<>();
    }

    public void agregarEstudiante(Estudiante estudiante){
        if(listaEstudiantes.contains(estudiante.getNumeroId())){
            System.out.println("El estudiante ya se encuentra registrado");
        }else{
            System.out.println("Estudiante registrado exitosamente");
            listaEstudiantes.add(estudiante);
        }

    }

    public Estudiante buscarEstudiante(int numeroId){
        for(Estudiante e : listaEstudiantes){
            if(e.getNumeroId() == numeroId){
                return e;
            }
        }

        return null;
    }

    public boolean actualizarEstudiante(int numeroId, String nuevoNombre, double nuevaCalificacion){
        Estudiante estudiante = buscarEstudiante(numeroId);

        if(estudiante != null){
            estudiante.setNombre(nuevoNombre);
            estudiante.setCalificacion(nuevaCalificacion);
            System.out.println("Datos actualizados");
            return true;
        }else {
            System.out.println("El estudiante no se encuentra registrado");
            return false;
        }
        }

        public boolean eliminarEstudiante(int numeroId){
            Estudiante estudiante = buscarEstudiante(numeroId);
            if (estudiante != null){
                listaEstudiantes.remove(estudiante);
                System.out.println("Estudiante eliminado");
                return true;
            }else{
                System.out.println("Estudiante no encontrado");
                return false;
            }
        }

        public void mostrarEstudiantes(){
            System.out.println("-------LISTA DE ESTUDIANTES REGISTRADOS------");
            for (Estudiante e : listaEstudiantes){
                System.out.println("Nombre Estudiante: " + e.getNombre() + " Id: " + e.getNumeroId() + " Calificacion: " + e.getCalificacion());
            }
    }

    }

