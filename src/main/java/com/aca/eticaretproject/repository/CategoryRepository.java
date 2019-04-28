package com.aca.eticaretproject.repository;

import com.aca.eticaretproject.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    Category getByCategoryID (Long id);
    Category getByCategoryName (String categoryName);
    Page<Category> findAll (Pageable pageable);
    List<Category> findAll (Sort sort);
    List<Category> getByParentID (Category parentId);


}
