package io.example.mongocrud.service;

import io.example.mongocrud.model.Customer;
import io.example.mongocrud.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Lakitha Prabudh on 9/14/20
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public void saveCustomer(Customer customer) {
        customer.setUuid(UUID.randomUUID().toString());
        customerRepository.save(customer);
    }

    public void updateCustomer(Customer customer) {
        Customer byUuid = customerRepository.findByUuid(customer.getUuid());
        if (byUuid != null){
            customer.set_id(byUuid.get_id());
            customerRepository.save(customer);
        }
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer findByCustomerName(String customerName){
        return customerRepository.findByCustomerName(customerName);
    }

    public void deleteCustomer(String uuid) {
        Customer byUuid = customerRepository.findByUuid(uuid);
        if (byUuid != null){
            customerRepository.delete(byUuid);
        }
    }
}
