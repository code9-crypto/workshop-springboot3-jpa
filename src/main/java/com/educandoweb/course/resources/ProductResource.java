package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;

@RestController //É a notação que faz o controle de acesso as camadas, ou seja, as páginas
@RequestMapping(value = "/products") //Esta notação é usada para ser acessada no navegador
//Que por sua vez(de forma invísivel ao usuário) acessa o método desta classe
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping //esta é a notação que é recupera pelo @RequestMapping
	//OBS.: esta notação também é para dizer que o tipo de requisição é GET
	//Quando a requisição é feita ao valor que está no @RequestMapping
	//Por padrão irá cair nesta função, pois nesta notação (@GetMapping) não nenhum valor atribuído
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	//O tipo da função é ResponseEntity, pois está se referindo a entidade em questão
	//Neste caso é Product
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
										//Esta notação é para dizer que a função receberá o valor vindo da URL
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
