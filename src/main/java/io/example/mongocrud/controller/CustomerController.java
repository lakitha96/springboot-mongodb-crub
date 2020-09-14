package io.example.mongocrud.controller;

import io.example.mongocrud.model.Customer;
import io.example.mongocrud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lakitha Prabudh on 9/14/20
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/mongo-sample/customers")
    public void saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
    }

    @PutMapping("/mongo-sample/customers")
    public void getAllCustomers(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }

    @GetMapping("/mongo-sample/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/mongo-sample/customers/{customerName}")
    public Customer findByCustomerName(@PathVariable String customerName){
        return customerService.findByCustomerName(customerName);
    }

    @DeleteMapping("/mongo-sample/customers/{uuid}")
    public void deleteCustomer(@PathVariable String uuid){
        customerService.deleteCustomer(uuid);
    }
}
