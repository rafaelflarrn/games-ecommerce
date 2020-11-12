package com.ecommerce.games.games.repository;

import com.ecommerce.games.games.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
