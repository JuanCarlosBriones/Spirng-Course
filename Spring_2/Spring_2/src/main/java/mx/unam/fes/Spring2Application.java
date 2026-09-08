package mx.unam.fes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mx.unam.fes.model.Persona;

@SpringBootApplication
public class Spring2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Spring2Application.class, args);
	}

@Override
	public void run(String... args) throws Exception {
		ClassPathXmlApplicationContext contexto=
				new ClassPathXmlApplicationContext(new String[] {
						  "bean-configuration.xml"});
		Persona persona=contexto.getBean("persona",Persona.class);
		System.out.println(persona.toString());
		((ClassPathXmlApplicationContext) contexto).close();
	}
}
