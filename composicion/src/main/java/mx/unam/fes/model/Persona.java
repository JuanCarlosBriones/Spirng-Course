package mx.unam.fes.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Persona {
    private String nombre;

    @Autowired
    private Materia materia;

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", materia=" + materia.toString() + "]";
    }
    
    

}
