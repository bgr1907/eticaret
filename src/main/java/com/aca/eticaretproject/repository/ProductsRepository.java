package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Long> {
    Products findByProductsID(Long id);
}
