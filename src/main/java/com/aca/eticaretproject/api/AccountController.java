package com.aca.eticaretproject.api;

import com.aca.eticaretproject.dto.LoginRequest;
import com.aca.eticaretproject.dto.RegistrationRequest;
import com.aca.eticaretproject.dto.TokenResponse;
import com.aca.eticaretproject.entity.Customers;
import com.aca.eticaretproject.repository.CustomersRepository;
import com.aca.eticaretproject.security.JwtTokenUtil;
import com.aca.eticaretproject.service.serviceImpl.CustomersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/token")
public class AccountController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private CustomersRepository customersRepository;

    @Autowired
    private CustomersServiceImpl customersService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<TokenResponse> login(@RequestBody LoginRequest request) throws AuthenticationException{
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        final Customers customer = customersRepository.findByUserName(request.getUsername());
        final String token = jwtTokenUtil.generateToken(customer);
        return ResponseEntity.ok(new TokenResponse(customer.getUserName(), token));

    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<Boolean> register(@RequestBody RegistrationRequest registrationRequest) throws AuthenticationException {
        Boolean response = customersService.register(registrationRequest);
        return ResponseEntity.ok(response);
    }



}
