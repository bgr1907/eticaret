package com.aca.eticaretproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "billing_customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BillingCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billingId;

    @JoinColumn(name = "customer_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Customers customerID;

    @Column(name = "billing_address")
    private String billingAddress;

    @Column(name = "billing_city")
    private String billingCity;

    @Column(name = "billing_region")
    private String billingRegion;

    @Column(name = "billing_postal_code")
    private int billingPostalCode;

    @Column(name = "billing_country")
    private String billingCountry;
}
