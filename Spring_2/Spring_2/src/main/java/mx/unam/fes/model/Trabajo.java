package mx.unam.fes.model;

public class Trabajo {
    private int numTrabajador;

    public Trabajo() {
    }


    Trabajo(int numTrabajador) {
        this.numTrabajador = 1234123;
    }   

    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Trabajo [numTrabajador=" + numTrabajador + "]";
    }


    public int getNumTrabajador() {
        return numTrabajador;
    }


    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }
}
