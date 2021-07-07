package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	//List<Product> saveAll(List<Product> products);

	Product findByName(String name);

}
