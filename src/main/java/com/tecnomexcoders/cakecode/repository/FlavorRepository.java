package com.tecnomexcoders.cakecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tecnomexcoders.cakecode.model.Flavor;

@Repository
public interface FlavorRepository extends JpaRepository<Flavor, Integer>{

}
