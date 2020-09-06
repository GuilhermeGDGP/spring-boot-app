package com.gdgp.springbootapp.repositories;

import com.gdgp.springbootapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}