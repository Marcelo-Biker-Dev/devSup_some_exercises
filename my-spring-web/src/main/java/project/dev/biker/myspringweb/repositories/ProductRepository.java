package project.dev.biker.myspringweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.dev.biker.myspringweb.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}