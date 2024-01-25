package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	//Fazendo injeção dependência de forma fraca com a interface
	//OrderRepository
	@Autowired
	private OrderRepository repository;
	
	//Na camada de serviço não é preciso declarar o retorno igual da camada de controller(Resources)
	//Apenas o tipo de dado que será retorno, neste caso está sendo o tipo Order
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
