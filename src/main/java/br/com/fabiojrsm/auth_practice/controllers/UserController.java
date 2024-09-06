package br.com.fabiojrsm.auth_practice.controllers;

import br.com.fabiojrsm.auth_practice.domain.user.User;
import br.com.fabiojrsm.auth_practice.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {


    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable UUID id){
        Optional<User> user = userService.getUserById(id);

        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();

        return ResponseEntity.ok(users);
    }
}
