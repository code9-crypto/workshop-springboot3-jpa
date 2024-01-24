package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;


@Configuration //Anotation para spring saber que é uma classe de configuração
@Profile("test") //Profile - Nome igual que está setado no application.properties
public class TestConfig implements CommandLineRunner {
	
	//Esta anotação faz o spring fazer a injeção de dependência automatica
	@Autowired
	private UserRepository userRepository;

	//Método herdado do CommandLineRunner
	//Executa tudo dentro dele quando a aplicação é rodada
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//Este método salva os dados como uma lista, por isso foi feito deste jeito
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
}
