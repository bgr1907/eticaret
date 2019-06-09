package com.aca.eticaretproject.service.serviceImpl;

import com.aca.eticaretproject.dto.ProductsDto;
import com.aca.eticaretproject.entity.Products;
import com.aca.eticaretproject.repository.ProductsRepository;
import com.aca.eticaretproject.service.ProductsService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductsServiceImpl implements ProductsService {

    private  final ProductsRepository productsRepository;
    private  final ModelMapper modelMapper;
    public ProductsServiceImpl(ProductsRepository productsRepository, ModelMapper modelMapper){
        this.modelMapper=modelMapper;
        this.productsRepository=productsRepository;
    }

    @Override
    public ProductsDto getById(Long id) {
        Products products= productsRepository.getOne(id);

        ProductsDto productsDto=modelMapper.map(products,ProductsDto.class);
        return productsDto;
    }

    @Override
    public List<ProductsDto> getAllProducts() {

        List<Products> data = productsRepository.findAll();
        return Arrays.asList(modelMapper.map(data,ProductsDto[].class));
    }

    @Override
    public ProductsDto save(ProductsDto productsDto) {
        Products p=modelMapper.map(productsDto,Products.class);
        p=productsRepository.save(p);
        productsDto.setProductID(p.getProductID());
        return productsDto;
    }

    @Override
    public ProductsDto update(Long id, ProductsDto productsDto) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
