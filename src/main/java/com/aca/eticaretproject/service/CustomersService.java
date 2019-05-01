package com.aca.eticaretproject.service;

import com.aca.eticaretproject.dto.CustomersDto;
import com.aca.eticaretproject.entity.Customers;
import com.sun.org.apache.bcel.internal.generic.LNEG;

public interface CustomersService {

    CustomersDto getById(Long id);

    CustomersDto update(Long id,CustomersDto customersDto);

    CustomersDto save(CustomersDto customersDto);

    Boolean delete(Long id);
}
