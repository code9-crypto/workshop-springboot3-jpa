package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	//Fazendo injeção dependência de forma fraca com a interface
	//CategoryRepository
	@Autowired
	private CategoryRepository repository;
	
	//Na camada de serviço não é preciso declarar o retorno igual da camada de controller(Resources)
	//Apenas o tipo de dado que será retorno, neste caso está sendo o tipo Category
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
