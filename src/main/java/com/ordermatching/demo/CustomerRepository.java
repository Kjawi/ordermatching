package com.ordermatching.demo;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
    public Customer findByEmailAddress(String EmailAddress);
}
