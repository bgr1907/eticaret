package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.BillingCustomer;
import com.aca.eticaretproject.entity.Customers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BillingCustomerRepository extends JpaRepository<BillingCustomerRepository,Long> {

    BillingCustomer getById(Long id);
    BillingCustomer getByCustomerId (Customers customerId);

}
