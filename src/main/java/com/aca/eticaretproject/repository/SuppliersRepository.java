package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuppliersRepository extends JpaRepository<Suppliers,Long> {
    Suppliers findBySuppliersID(Long id);
}
