package com.tecnomexcoders.cakecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tecnomexcoders.cakecode.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
