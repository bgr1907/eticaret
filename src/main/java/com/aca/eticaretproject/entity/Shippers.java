package com.aca.eticaretproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "shippers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Shippers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipper_id")
    private Long shipperID;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "phone")
    private String phone;
}
