package com.api.kakeibo_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
  //    private final UserService userService;
  //
  ////    TODO　レスポンスで指定した分のページを取得
  //    /**
  //     * This method will getUsers with PageRequest
  //     * @param
  //     * @return
  //     */
  //    @GetMapping("/users")
  //    public ResponseEntity<List<User>> getAllUsers () {
  //        return ResponseEntity.ok().body(userService.getAllUsers());
  //    }
  //
  //    /**
  //     * This method will saveUser
  //     * @param user
  //     * @return
  //     */
  //    @PostMapping("/user/save")
  //    public ResponseEntity<User> saveUser (User user) {
  //        URI uri =
  // URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
  //        return ResponseEntity.created(uri).body(userService.saveUser(user));
  //    }
}
