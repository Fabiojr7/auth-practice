package br.com.fabiojrsm.auth_practice.repositories;

import br.com.fabiojrsm.auth_practice.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
