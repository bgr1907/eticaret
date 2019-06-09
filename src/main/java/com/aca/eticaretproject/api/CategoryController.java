package com.aca.eticaretproject.api;

import com.aca.eticaretproject.dto.CategoryDto;
import com.aca.eticaretproject.service.serviceImpl.CategoryServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {

    private final CategoryServiceImpl categoryServiceImpl;
    private final ModelMapper modelMapper;

    public CategoryController(CategoryServiceImpl categoryServiceImpl, ModelMapper modelMapper){
        this.categoryServiceImpl = categoryServiceImpl;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getById(@PathVariable(value = "id",required = true) Long id){

        CategoryDto customersDto = categoryServiceImpl.getById(id);
        return ResponseEntity.ok(customersDto);
    }

    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAll(){

        List<CategoryDto> categoryDto = categoryServiceImpl.getAllCategory();
        return ResponseEntity.ok(categoryDto);
    }

    @PostMapping
    public ResponseEntity<CategoryDto> createCustomers(@RequestBody CategoryDto categoryDto){
        return ResponseEntity.ok(categoryServiceImpl.save(categoryDto));
    }
}
