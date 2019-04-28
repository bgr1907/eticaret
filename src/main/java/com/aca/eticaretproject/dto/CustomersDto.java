package com.aca.eticaretproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomersDto {

    private Long customerID;

    private String firstName;

    private String lastName;

    private String no;

    private String building;

    private String city;

    private String country;

    private int postalCode;

    private String eMail;

    private String userName;

}
