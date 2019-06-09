package com.aca.eticaretproject.service;

import com.aca.eticaretproject.dto.CustomersDto;

import java.util.List;


public interface CustomersService {

    CustomersDto getById(Long id);

    CustomersDto update(Long id,CustomersDto customersDto);

    CustomersDto save(CustomersDto customersDto);

    Boolean delete(Long id);

    List<CustomersDto> getAll();
}
