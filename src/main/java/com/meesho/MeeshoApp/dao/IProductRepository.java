package com.meesho.MeeshoApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.meesho.MeeshoApp.model.Product;


@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

	
	
}