package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Shippers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippersRepository extends JpaRepository<Shippers,Long> {
    Shippers findByShipperID(Long id);
}
