package org.ua.coffeejug.demo.archunit.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.ua.coffeejug.demo.archunit.entity.User;
import org.ua.coffeejug.demo.archunit.repository.UserRepository;

@Controller
//@RestController
@RequiredArgsConstructor
public class UserController {

  //  private final UserService userService;
  private final UserRepository userRepository;

  @GetMapping("/user/{login}")
  public User getUser(@PathVariable String login) {
    return userRepository.findByLogin(login);
//    return userService.getUser(login);
  }
}
