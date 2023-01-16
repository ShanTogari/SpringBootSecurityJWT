package spring.boot.security.jwt.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.security.jwt.model.User;


public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);
	
}

