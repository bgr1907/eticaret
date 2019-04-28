package com.aca.eticaretproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private Long categoryID;

    private List<ProductsDto> products;

    private Long parentID;

    private String categoryName;

    private String description;

    private byte[] picture;

    private boolean active;
}
