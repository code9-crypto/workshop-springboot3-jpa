package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {
	
	//Fazendo injeção dependência de forma fraca com a interface
	//UserRepository
	@Autowired
	private UserRepository repository;
	
	//Na camada de serviço não é preciso declarar o retorno igual da camada de controller(Resources)
	//Apenas o tipo de dado que será retorno, neste caso está sendo o tipo User
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
}
