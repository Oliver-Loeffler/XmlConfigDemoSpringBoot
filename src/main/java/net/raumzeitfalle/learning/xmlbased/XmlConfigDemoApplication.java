package net.raumzeitfalle.learning.xmlbased;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class XmlConfigDemoApplication {
   
	public static void main(String[] args) {
		SpringApplication.run(XmlConfigDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunnner(ApplicationContext context) {
	    return args->{
	        System.out.println("Lets go!");
	        String[] beanNames = context.getBeanDefinitionNames();
	        Arrays.stream(beanNames)
	              .sorted()
	              .forEach(System.out::println);	        
	    };
	}

}
