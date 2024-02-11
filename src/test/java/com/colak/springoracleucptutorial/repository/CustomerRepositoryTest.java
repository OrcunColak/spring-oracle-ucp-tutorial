package com.colak.springoracleucptutorial.repository;

import com.colak.springoracleucptutorial.jpa.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void testFindAll() {
        List<Customer> customerList = customerRepository.findAll();
        assertThat(customerList).isEmpty();
    }
}
