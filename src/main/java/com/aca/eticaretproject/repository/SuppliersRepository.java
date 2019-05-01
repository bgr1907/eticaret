package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuppliersRepository extends JpaRepository<Suppliers,Long> {
    Suppliers findBySupplierID(Long id);
}
