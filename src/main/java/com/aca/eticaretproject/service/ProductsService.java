package com.aca.eticaretproject.service;

import com.aca.eticaretproject.dto.ProductsDto;

import java.util.List;

public interface ProductsService {

    ProductsDto getById(Long id);

    List<ProductsDto> getAllProducts();

    ProductsDto save(ProductsDto productsDto);

    ProductsDto update(Long id, ProductsDto productsDto);

    Boolean delete(Long id);
}
