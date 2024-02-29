package com.tecnomexcoders.cakecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tecnomexcoders.cakecode.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
