package com.aca.eticaretproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "suppliers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "supplier_id")
    private int supplierID;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_title")
    private String contactTitle;

    @Column(name = "fax")
    private String fax;

    @Column(name = "email")
    private String eMail;

    @Column(name = "url")
    private String url;

    @Column(name = "paymentMethods")
    private String paymentMethods;

    @Column(name = "discountType")
    private String discountType;

    @Column(name = "phone")
    private String phone;
}
