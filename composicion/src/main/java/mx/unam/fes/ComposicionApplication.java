package mx.unam.fes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mx.unam.fes.model.Datos;
import mx.unam.fes.model.Lista;
import mx.unam.fes.model.Persona;

@SpringBootApplication
public class ComposicionApplication implements CommandLineRunner {
	@Autowired
	Persona persona;
	@Autowired 
	Lista lista;
	@Autowired 
	Datos datos;

	private String[] listaNombres = {"Juan", "Pedro", "Maria", "Ana", "Luis", "Sofia", "Carlos", "Valeria", "Diego", "Camila"};
    private Integer[] listaMaterias = {5, 4, 6, 3, 7, 5, 4, 6, 3, 7};

	public static void main(String[] args) {
		SpringApplication.run(ComposicionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inicio ...");
		
		System.out.println(persona);
		System.out.println(persona.getMateria().toString());
		/*
		lista.setNombres(listaNombres);
		lista.setMaterias(listaMaterias);
		lista.getNombres();
		lista.getMaterias();
		*/
		for(Persona dato : datos.getDatos()){
			System.out.println(dato.toString());
		}

		
	}

}
