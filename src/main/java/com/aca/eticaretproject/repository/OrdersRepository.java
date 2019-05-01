package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
    Orders getByOrdersID(Long id);
}
