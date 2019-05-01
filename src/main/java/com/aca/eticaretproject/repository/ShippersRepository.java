package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Shippers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippersRepository extends JpaRepository<Shippers,Long> {
    Shippers findByShippersID(Long id);
}
