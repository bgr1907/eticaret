package com.aca.eticaretproject.service;

import com.aca.eticaretproject.dto.AddressDto;

import java.util.List;

public interface AddressService {

    AddressDto getById(Long id);

    List<AddressDto> getAllAddress();

    AddressDto save(AddressDto addressDto);

    AddressDto update(Long id,AddressDto addressDto);

    Boolean delete(Long id);
}
