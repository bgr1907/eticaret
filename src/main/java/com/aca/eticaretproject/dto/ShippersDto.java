package com.aca.eticaretproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippersDto {

    private Long shipperID;

    private String companyName;

    private String phone;
}
