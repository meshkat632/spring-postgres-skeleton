package org.acme.springpostgresskeleton;

import org.acme.springpostgresskeleton.model.Greeting;
import org.acme.springpostgresskeleton.repository.GreetingRepository;
import org.acme.springpostgresskeleton.util.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}	

	
	@Autowired
	private GreetingRepository greetingRepository;
	
    @Override
    public void run(String... args) throws Exception {
	
    	RequestContext.setUsername("TestUser");
    	System.out.println("on startup");    	
    	Greeting greeting = new Greeting();
    	greeting.setText("hello");
		Greeting x = greetingRepository.save(greeting);
		System.out.println("Greeting "+x+" is persisted");
    }
	
	
}
