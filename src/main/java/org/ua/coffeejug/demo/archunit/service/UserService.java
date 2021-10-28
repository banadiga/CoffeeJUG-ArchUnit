package org.ua.coffeejug.demo.archunit.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.ua.coffeejug.demo.archunit.entity.User;
import org.ua.coffeejug.demo.archunit.repository.UserRepository;

import javax.annotation.PostConstruct;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User getUser(final String login) {
    return userRepository.findByLogin(login);
  }

  @PostConstruct
  public void initData() {
    User user = User.builder()
        .login(randomAlphabetic(10))
        .build();

    user = userRepository.save(user);
    log.info("User {} created.", user);
  }
}
