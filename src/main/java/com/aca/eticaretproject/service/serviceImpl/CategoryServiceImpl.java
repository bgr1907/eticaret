package com.aca.eticaretproject.service.serviceImpl;

import com.aca.eticaretproject.dto.CategoryDto;
import com.aca.eticaretproject.entity.Category;
import com.aca.eticaretproject.repository.CategoryRepository;
import com.aca.eticaretproject.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper modelMapper){
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        Category c = modelMapper.map(categoryDto,Category.class);
        c=categoryRepository.save(c);
        categoryDto.setCategoryID(c.getCategoryID());
        return categoryDto;
    }

    @Override
    public CategoryDto getById(Long id) {
        Category category= categoryRepository.getOne(id);

        CategoryDto categoryDto = modelMapper.map(category,CategoryDto.class);
        return categoryDto;
    }

    @Override
    public List<CategoryDto> getAllCategory() {
        List<Category> data = categoryRepository.findAll();
        return Arrays.asList(modelMapper.map(data,CategoryDto[].class));
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public CategoryDto update(Long id, CategoryDto categoryDto) {
        return null;
    }
}
