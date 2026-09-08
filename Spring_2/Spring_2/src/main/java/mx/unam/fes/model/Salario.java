package mx.unam.fes.model;

public class Salario {
    private float calculo;

    public Salario() {
    }

    public float getCalculo() {
        return calculo;
    }

    public void setCalculo(float calculo) {
        this.calculo = calculo;
    }

    Salario(float calculo){
        this.calculo=2313.123f;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Salario [calculo=" + calculo + "]";
    }

}
