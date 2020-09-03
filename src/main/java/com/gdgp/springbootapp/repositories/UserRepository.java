package com.gdgp.springbootapp.repositories;

import com.gdgp.springbootapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
