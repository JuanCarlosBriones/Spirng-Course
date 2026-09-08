package mx.unam.fes.model;

import java.util.ArrayList;

public class Datos {

    private final ArrayList<Persona> datos;

    public Datos() {
        datos = new ArrayList<>();

        Persona persona = null;
        Materia materia = null;

        for(int i = 0; i < 10; i++){
            persona = new Persona();
            persona.setNombre("p" + i);
            materia = new Materia();
            materia.setNumMaterias(i);
            persona.setMateria(materia);
            datos.add(persona);
        }
    }

    public ArrayList<Persona> getDatos() {
        return datos;
    }

}
