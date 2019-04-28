package com.aca.eticaretproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillingCustomerDto {

    private Long id;

    private CustomersDto customersDto;

    private String billingAddress;

    private String billingCity;

    private String billingRegion;

    private int billingPostalCode;

    private String billingCountry;
}
