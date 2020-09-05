package com.gdgp.springbootapp.repositories;

import com.gdgp.springbootapp.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
