package com.aca.eticaretproject.service;

import com.aca.eticaretproject.dto.BillingCustomerDto;

import java.util.List;

public interface BillingCustomerService {

    BillingCustomerDto getById(Long id);

    List<BillingCustomerDto> getAllBillingCustomer();

    BillingCustomerDto save(BillingCustomerDto billingCustomerDto);

    BillingCustomerDto update(Long id,BillingCustomerDto billingCustomerDto);

    Boolean delete(Long id);
}
