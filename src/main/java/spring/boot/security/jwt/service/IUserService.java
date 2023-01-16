package spring.boot.security.jwt.service;

import java.util.Optional;

import spring.boot.security.jwt.model.User;

public interface IUserService {
	Integer saveUser(User user);
	Optional<User> findByUsername(String username);
}
