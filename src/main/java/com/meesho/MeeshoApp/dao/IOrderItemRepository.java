package com.meesho.MeeshoApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.meesho.MeeshoApp.model.OrderItem;

	@Repository
	public interface IOrderItemRepository extends JpaRepository<OrderItem, Long> {
		
	}


