package com.tecnomexcoders.cakecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tecnomexcoders.cakecode.model.CustomCake;

@Repository
public interface CustomCakeRepository extends JpaRepository<CustomCake, Integer>{

}
