package com.pensionat.customer.service;


import com.pensionat.booking.model.BookingEntity;
import com.pensionat.booking.repository.BookingRepository;
import com.pensionat.customer.model.CustomerEntity;
import com.pensionat.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final BookingRepository bookingRepository;


    public CustomerService(CustomerRepository customerRepository, BookingRepository bookingRepository) {
        this.customerRepository = customerRepository;
        this.bookingRepository = bookingRepository;
    }
    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }
    public CustomerEntity getCustomerById(CreateCustomerRequest request) {
        CustomerEntity customer = new CustomerEntity(request.firstName(),request.lastName(),request.email(),request.phone());
        return customerRepository.save(customer);
    }
}
