package com.aca.eticaretproject.api;

import com.aca.eticaretproject.dto.ProductsDto;
import com.aca.eticaretproject.service.serviceImpl.ProductsServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductsController {
    private  final ProductsServiceImpl productsServiceImpl;

    public ProductsController(ProductsServiceImpl productsServiceImpl) {
        this.productsServiceImpl = productsServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductsDto> getById(@PathVariable(value = "id",required = true) Long id){
        ProductsDto productsDto=productsServiceImpl.getById(id);
        return ResponseEntity.ok(productsDto);
    }

    @PostMapping
    public ResponseEntity<ProductsDto> createProducts(@RequestBody ProductsDto productsDto){
        return ResponseEntity.ok(productsServiceImpl.save(productsDto));
    }
}
