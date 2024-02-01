package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	//Fazendo injeção dependência de forma fraca com a interface
	//ProductRepository
	@Autowired
	private ProductRepository repository;
	
	//Na camada de serviço não é preciso declarar o retorno igual da camada de controller(Resources)
	//Apenas o tipo de dado que será retorno, neste caso está sendo o tipo Product
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
