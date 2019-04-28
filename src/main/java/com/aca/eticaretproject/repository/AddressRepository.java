package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Address;
import com.aca.eticaretproject.entity.Customers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

    Address getById(Long id);
    Page<Address> findAll(Pageable pageable);
    List<Address> findAll(Sort sort);
    List<Address> getByCustomerID(Customers customerId);

}
