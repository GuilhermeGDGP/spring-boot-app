package com.gdgp.springbootapp.repositories;

import com.gdgp.springbootapp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}