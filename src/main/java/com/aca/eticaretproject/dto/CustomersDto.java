package com.aca.eticaretproject.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomersDto {

    private Long customerID;

    private String firstName;

    private String lastName;

    private String role;

    private String no;

    private String building;

    private String city;

    private String country;

    private int postalCode;

    private String email;

    private String userName;

    private String password;

}
