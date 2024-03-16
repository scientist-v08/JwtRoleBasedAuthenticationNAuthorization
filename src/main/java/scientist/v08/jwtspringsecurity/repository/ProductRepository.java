package scientist.v08.jwtspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import scientist.v08.jwtspringsecurity.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
