package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers,Long> {

    Customers getByCustomerID (Long id);
    List<Customers> getByFirstName (String firstName);
    Customers getByEmail (String email);
    Customers findByUserName (String userName);


}
