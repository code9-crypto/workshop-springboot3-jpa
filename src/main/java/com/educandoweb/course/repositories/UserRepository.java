package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.User;

//Esta notação neste caso é opcional
//Pois a interface já está herdando do JpaRepository
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
