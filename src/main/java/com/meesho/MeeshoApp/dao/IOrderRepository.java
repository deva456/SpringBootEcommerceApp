package com.meesho.MeeshoApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.meesho.MeeshoApp.model.Orders;


	@Repository
	public interface IOrderRepository extends JpaRepository<Orders, Long> {
		
	}

