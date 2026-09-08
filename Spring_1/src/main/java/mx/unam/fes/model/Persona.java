package mx.unam.fes.model;

public class Persona {
    private String nombre;
    private Integer edad;
    public Integer getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
