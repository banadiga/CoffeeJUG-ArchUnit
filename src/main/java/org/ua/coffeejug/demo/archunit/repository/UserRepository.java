package org.ua.coffeejug.demo.archunit.repository;

import org.springframework.data.repository.CrudRepository;
import org.ua.coffeejug.demo.archunit.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
  User findByLogin(String login);
}
