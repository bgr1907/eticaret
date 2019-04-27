package com.aca.eticaretproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long customerID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "no")
    private String no;

    @Column(name = "building")
    private String building;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "postal_code")
    private int postalCode;

    @Column(name = "email")
    private String eMail;

    @Column(name = "password")
    private String password;

    @Column(name = "user_name")
    private String userName;


}
