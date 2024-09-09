package br.com.fabiojrsm.auth_practice.domain.user;

public record RegisterDTO(String name, String username, String email, String password, Role role) {
}
