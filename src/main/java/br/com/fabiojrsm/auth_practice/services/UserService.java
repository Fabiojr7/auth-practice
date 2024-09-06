package br.com.fabiojrsm.auth_practice.services;

import br.com.fabiojrsm.auth_practice.domain.user.User;
import br.com.fabiojrsm.auth_practice.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

    public Optional<User> getUserById(UUID id){
        return userRepository.findById(id);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
