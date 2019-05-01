package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
    Orders getByOrderID(Long id);
}
