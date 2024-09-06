package br.com.fabiojrsm.auth_practice.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductDTO(@NotBlank String name, @NotBlank String description, @NotNull Double price) {
}
