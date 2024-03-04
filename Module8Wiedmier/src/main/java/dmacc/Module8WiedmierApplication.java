package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Toaster;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ToasterRepository;

@SpringBootApplication
public class Module8WiedmierApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Module8WiedmierApplication.class, args);
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		Toaster t = appContext.getBean("toaster", Toaster.class);
//		System.out.println(t.toString());
	}
	
	@Autowired
	ToasterRepository repo;
	
	@Override
	public void run(String... args) throws Exception{
		// TODO Auto-generated method stub 
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class); 
		//Using an existing bean 
		Toaster t = appContext.getBean("toaster", Toaster.class); 
		t.setModel("ABC-123"); 
		repo.save(t); 
		//Creating a bean to use – not managed by Spring 
		Toaster to = new Toaster("Amazing Toaster", "ABC-800", 2024, 2); 
		repo.save(to); 
		List<Toaster> allMyToasters = repo.findAll(); 
		for(Toaster appliance: allMyToasters) { 
		System.out.println(appliance.toString());  
		} 
		((AbstractApplicationContext) appContext).close();
	}
}