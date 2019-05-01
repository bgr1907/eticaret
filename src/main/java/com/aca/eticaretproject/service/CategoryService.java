package com.aca.eticaretproject.service;

import com.aca.eticaretproject.dto.CategoryDto;
import com.aca.eticaretproject.entity.Category;

import java.util.List;

public interface CategoryService {

    CategoryDto save(CategoryDto categoryDto);

    CategoryDto getById(Long id);

    List<CategoryDto> getAllCategory();

    Boolean delete(Long id);

    CategoryDto update(Long id,CategoryDto categoryDto);
}
