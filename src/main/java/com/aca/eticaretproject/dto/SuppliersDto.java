package com.aca.eticaretproject.dto;

import lombok.Data;

@Data
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
