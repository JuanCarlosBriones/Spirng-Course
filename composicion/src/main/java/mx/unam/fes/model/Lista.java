package mx.unam.fes.model;

import java.util.ArrayList;

public class Lista {
    ArrayList<Persona> nombres = new ArrayList<Persona>();
    ArrayList<Materia> materias = new ArrayList<Materia>();
    public Lista() {
        
    }
    
    public void getNombres() {
        for(Persona i : nombres){
            System.out.println(i.getNombre());
        }
    }

    public void setNombres(String[] nombresPersonas) {
        for(String i : nombresPersonas){
            Persona persona = new Persona();
            persona.setNombre(i);
            nombres.add(persona);
        }
    }

    public void getMaterias() {
        for(Persona i : nombres){
            System.out.println(i.getMateria());
        }
    }

    public void setMaterias(Integer[] materiasPersonas) {
        for(Integer i : materiasPersonas){
            Materia materia = new Materia();
            materia.setNumMaterias(i);
            materias.add(materia);
        }
    }
}
