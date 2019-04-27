package com.aca.eticaretproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {

    private Long id;

    private CustomersDto customersDto;

    private SuppliersDto suppliersDto;

    private String address;

    private String city;

    private String region;

    private int postalCode;

    private String country;
}
