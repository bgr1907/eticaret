package com.aca.eticaretproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JoinColumn(name = "supplier_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Suppliers supplierID;

    @JoinColumn(name = "customer_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Customers customerID;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "region")
    private String region;

    @Column(name = "postal_code")
    private int postalCode;

    @Column(name = "country")
    private String country;
}
