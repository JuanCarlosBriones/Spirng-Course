package mx.unam.fes;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import mx.unam.fes.model.Alumno;
import mx.unam.fes.model.Persona;

@SpringBootApplication
public class Spring1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// throw new UnsupportedOperationException("Unimplemented method 'run'");
		System.out.println("Spring......");
		final ClassPathResource resource = new ClassPathResource("bean-configuration.xml");
		final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		final XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(resource);
		Persona per = (Persona) beanFactory.getBean("personaEspecial");
		System.out.println(per);
		Alumno alum=beanFactory.getBean("alumno",Alumno.class);

		System.out.println(alum.getPersona().toString());

	}

}
