package com.meesho.MeeshoApp.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meesho.MeeshoApp.model.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long>{

	

}
