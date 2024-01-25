package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Order;

//Esta notação neste caso é opcional
//Pois a interface já está herdando do JpaRepository
//OBS.: esta interface é responsável por fazer acesso ao banco de dados em cima da entidade em questão
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
