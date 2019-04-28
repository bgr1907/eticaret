package com.aca.eticaretproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailsDto {

    private Long orderID;

    private ProductsDto productsDto;

    private long orderNumber;

    private long price;

    private int quantity;

    private int discount;

    private float total;

    private String size;

    private String color;

    private Date shipDate;

    private int orderDetailID;
}
