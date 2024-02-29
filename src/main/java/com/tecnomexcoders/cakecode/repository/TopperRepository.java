package com.tecnomexcoders.cakecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tecnomexcoders.cakecode.model.Topper;

@Repository
public interface TopperRepository extends JpaRepository<Topper, Integer>{

}
