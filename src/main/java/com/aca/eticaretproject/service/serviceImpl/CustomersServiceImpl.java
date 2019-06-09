package com.aca.eticaretproject.service.serviceImpl;

import com.aca.eticaretproject.dto.CustomersDto;
import com.aca.eticaretproject.dto.ProductsDto;
import com.aca.eticaretproject.dto.RegistrationRequest;
import com.aca.eticaretproject.entity.Customers;
import com.aca.eticaretproject.entity.Products;
import com.aca.eticaretproject.repository.CustomersRepository;
import com.aca.eticaretproject.service.CustomersService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class CustomersServiceImpl implements CustomersService {

    private final CustomersRepository customersRepository;
    private final ModelMapper modelMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public CustomersServiceImpl (CustomersRepository customersRepository, ModelMapper modelMapper, BCryptPasswordEncoder bCryptPasswordEncoder){
        this.customersRepository = customersRepository;
        this.modelMapper = modelMapper;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
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

    @Override
    public List<CustomersDto> getAll() {

        List<Customers> data = customersRepository.findAll();
        return Arrays.asList(modelMapper.map(data,CustomersDto[].class));
    }
    @Transactional
    public Boolean register(RegistrationRequest registrationRequest){
        try{
            Customers customer = new Customers();
            customer.setEmail(registrationRequest.getEmail());
            customer.setFirstName(registrationRequest.getFirstName());
            customer.setLastName(registrationRequest.getLastName());
            customer.setPassword(bCryptPasswordEncoder.encode(registrationRequest.getPassword()));
            customer.setUserName(registrationRequest.getUsername());
            customersRepository.save(customer);
            return Boolean.TRUE;
        }catch (Exception e){
            log.error("REGISTRATION=>", e);
            return Boolean.FALSE;
        }
    }
}
