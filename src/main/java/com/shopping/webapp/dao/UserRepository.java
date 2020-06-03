package com.shopping.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.webapp.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
	public User findByUsername(String username);

}
