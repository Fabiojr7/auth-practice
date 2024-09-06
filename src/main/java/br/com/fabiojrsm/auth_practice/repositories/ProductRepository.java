package br.com.fabiojrsm.auth_practice.repositories;

import br.com.fabiojrsm.auth_practice.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
