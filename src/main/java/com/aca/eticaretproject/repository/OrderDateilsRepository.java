package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.OrderDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDateilsRepository extends JpaRepository<OrderDetails,Long> {

    OrderDetails getByOrderDetailID (Long id);
    Page<OrderDetails> findAll (Pageable pageable);
    List<OrderDetails> findAll (Sort sort);
    List<OrderDetails> findByTotalGreaterThanEqual (Float total);
    List<OrderDetails> findByTotalLessThanEqual (Float total);
}
