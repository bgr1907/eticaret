package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products,Long> {
    Products findByProductID(Long id);
}
