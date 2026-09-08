package mx.unam.fes.model;

public class Persona {
    private Trabajo trabajo;
    private Salario salario;
    private String nombre;

    public Persona(Trabajo trabajo, Salario salario, String nombre) {
        this.trabajo = trabajo;
        this.salario = salario;
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Persona [trabajo=" + trabajo + ", salario=" + salario + ", nombre=" + nombre + "]";
    }
}
