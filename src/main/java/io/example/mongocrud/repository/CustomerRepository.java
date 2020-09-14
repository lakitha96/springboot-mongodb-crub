package io.example.mongocrud.repository;

import io.example.mongocrud.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Lakitha Prabudh on 9/14/20
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByCustomerName(String customerName);
    Customer findByUuid(String customerName);
}
