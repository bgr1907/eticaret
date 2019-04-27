package com.aca.eticaretproject.dto;

import java.util.List;

public class CategoryDto {

    private Long categoryID;

    private List<ProductsDto> products;

    private Long parentID;

    private String categoryName;

    private String description;

    private byte[] picture;

    private boolean active;
}
