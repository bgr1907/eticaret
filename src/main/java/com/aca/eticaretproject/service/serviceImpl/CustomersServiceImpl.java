package com.aca.eticaretproject.service.serviceImpl;

import com.aca.eticaretproject.dto.CustomersDto;
import com.aca.eticaretproject.dto.ProductsDto;
import com.aca.eticaretproject.entity.Customers;
import com.aca.eticaretproject.entity.Products;
import com.aca.eticaretproject.repository.CustomersRepository;
import com.aca.eticaretproject.service.CustomersService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CustomersServiceImpl implements CustomersService {

    private final CustomersRepository customersRepository;
    private final ModelMapper modelMapper;

    public CustomersServiceImpl (CustomersRepository customersRepository, ModelMapper modelMapper){
        this.customersRepository = customersRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CustomersDto getById(Long id){
        Customers customers= customersRepository.getOne(id);

        CustomersDto customersDto = modelMapper.map(customers,CustomersDto.class);
        return customersDto;
    }

    @Override
    public CustomersDto update(Long id, CustomersDto customersDto) {
        return null;
    }

    @Override
    public CustomersDto save(CustomersDto customersDto) {

        Customers c = modelMapper.map(customersDto,Customers.class);
        c = customersRepository.save(c);
        customersDto.setCustomerID(c.getCustomerID());

        return customersDto;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
