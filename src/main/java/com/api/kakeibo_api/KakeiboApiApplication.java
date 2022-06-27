package com.api.kakeibo_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {
      "com.api.kakeibo_api.controller",
      "com.api.kakeibo_api.domain",
      "com.api.kakeibo_api.repo",
      "com.api.kakeibo_api.request",
      "com.api.kakeibo_api.service",
      "com.api.kakeibo-api.security",
      "com.api.kakeibo-api.filter"
    })
public class KakeiboApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(KakeiboApiApplication.class, args);
  }

  //	@Bean
  //	PasswordEncoder passwordEncoder() {
  //		return new BCryptPasswordEncoder();
  //	}

  //	@Bean
  //	CommandLineRunner run(UserService userService) {
  //		return args -> {
  //			userService.saveRole(new Role(null, "ADMIN"));
  //			userService.saveRole(new Role(null, "USER"));
  //
  //			userService.saveUser(new User(null, "Kaisei", "Ota", "kaiseiota", "kota", new ArrayList<>(),
  // new ArrayList<>()));
  //			userService.saveUser(new User(null, "Kawada", "Masahiro", "kawadamasahiro", "kmasahiro", new
  // ArrayList<>(), new ArrayList<>()));
  //			userService.saveUser(new User(null, "David", "Choi", "davidchoi", "dchoi", new ArrayList<>(),
  // new ArrayList<>()));
  //
  //			userService.addRoleToUser("kaiseiota", "ADMIN");
  //			userService.addRoleToUser("kawadamasahiro", "ADMIN");
  //			userService.addRoleToUser("davidchoi", "USER");
  //		};
  //	}
}
