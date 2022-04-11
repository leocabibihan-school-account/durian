package com.project.durian.repository;

import com.project.durian.model.Customer;
import com.project.durian.model.OrderDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long> {
    Set<OrderDetails> findAllByCustomerIs(Customer customer);
}
