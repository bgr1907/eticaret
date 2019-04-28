package com.aca.eticaretproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuppliersDto {

    private Long supplierID;

    private String companyName;

    private String contactName;

    private String contactTitle;

    private String fax;

    private String eMail;

    private String url;

    private String paymentMethods;

    private String discountType;

    private String phone;
}
