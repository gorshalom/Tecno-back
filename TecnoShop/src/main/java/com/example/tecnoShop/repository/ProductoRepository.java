package com.example.tecnoShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tecnoShop.model.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>  {
	
	
	
}
