package mx.unam.fes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.unam.fes.model.Datos;
import mx.unam.fes.model.Lista;
import mx.unam.fes.model.Materia;
import mx.unam.fes.model.Persona;

@Configuration

public class Configure {

    @Bean
    public Persona getPersona() {
        Persona persona = new Persona();
        return persona;
    }

    @Bean
    public Materia getMateria(){
        Materia materia = new Materia();
        return materia;
    }

    @Bean
    public Lista getLista() {
        Lista lista = new Lista();
        return lista;
    }

    @Bean 
    public Datos getDatos(){
        Datos datos = new Datos();
        return datos;
    }
}
