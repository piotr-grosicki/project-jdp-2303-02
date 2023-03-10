package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    void deleteById(Long id);
    Product save(Product product);
}
