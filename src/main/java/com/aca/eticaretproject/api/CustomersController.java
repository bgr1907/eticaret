package com.aca.eticaretproject.api;

import com.aca.eticaretproject.dto.CustomersDto;
import com.aca.eticaretproject.service.serviceImpl.CustomersServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    private final CustomersServiceImpl customersServiceImpl;

    public CustomersController(CustomersServiceImpl customersServiceImpl){
        this.customersServiceImpl = customersServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomersDto> getById(@PathVariable(value = "id",required = true) Long id){

        CustomersDto customersDto = customersServiceImpl.getById(id);
        return ResponseEntity.ok(customersDto);
    }

    @GetMapping
    public ResponseEntity<List<CustomersDto>> getAll(){
        List<CustomersDto> customersDto = customersServiceImpl.getAll();
        return ResponseEntity.ok(customersDto);
    }

    @PostMapping
    public ResponseEntity<CustomersDto> createCustomers(@RequestBody CustomersDto customersDto){
        return ResponseEntity.ok(customersServiceImpl.save(customersDto));
    }


}
