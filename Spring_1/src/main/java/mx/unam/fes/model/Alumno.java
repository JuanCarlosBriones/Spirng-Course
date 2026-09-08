package mx.unam.fes.model;

public class Alumno {
    private Persona persona;
    private String semestre;

    public Alumno(){

    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public Persona getPersona() {
        return persona;
    }
    public String getSemestre() {
        return semestre;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    
}
