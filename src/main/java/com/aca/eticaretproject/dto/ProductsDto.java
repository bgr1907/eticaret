package com.aca.eticaretproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDto {
    private Long productID;

    private CategoryDto categoryDto;

    private String productName;

    private String productDescription;

    private SuppliersDto suppliersDto;

    private float price;

    private boolean discountAvailable;

    private boolean productAvailable;

    private int stock;

    private String note;

    private int discount;

    private byte[] picture;

    private String color;

    private String size;
}
