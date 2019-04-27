package com.aca.eticaretproject.dto;

import java.util.Date;

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
