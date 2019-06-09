package com.aca.eticaretproject.service.serviceImpl;

import com.aca.eticaretproject.entity.Customers;
import com.aca.eticaretproject.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class CustomersDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private CustomersRepository customersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Customers customer = customersRepository.findByUserName(username);
        if(customer == null){
            throw new UsernameNotFoundException("Invalid username or password");
        }
        return new org.springframework.security.core.userdetails.User(customer.getUserName(),customer.getPassword(), Arrays.asList(new SimpleGrantedAuthority("USER")));
    }
}
