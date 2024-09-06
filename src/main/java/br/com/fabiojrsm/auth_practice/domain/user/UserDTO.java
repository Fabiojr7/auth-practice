package br.com.fabiojrsm.auth_practice.domain.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDTO(@NotBlank String name, @NotBlank String username, @NotBlank String email, @NotBlank @NotNull String password, @NotBlank Role role) {
}
