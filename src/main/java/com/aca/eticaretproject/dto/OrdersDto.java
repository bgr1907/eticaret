package com.aca.eticaretproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDto {

    private Long orderID;

    private CustomersDto customersDto;

    private long orderNumber;

    private Date orderDate;

    private Date shipDate;

    private Date requiredDate;

    private ShippersDto shippersDto;

    private String salesText;

    private boolean transactionStatus;

    private String errorLoc;

    private String errorMsg;

    private boolean Deleted;

    private boolean paid;
}
