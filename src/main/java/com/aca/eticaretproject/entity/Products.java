package com.aca.eticaretproject.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Blob;


@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long productID;

    /*@JoinColumn(name = "category_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)*/
    @Column
    private Long categoryID;

    @Column(name = "product_name", length = 300)
    private String productName;

    @Column(name = "product_description", length = 500)
    private String productDescription;

    @JoinColumn(name = "supplier_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Suppliers supplierID;

    @Column(name = "price")
    private float price;

    @Column(name = "discount_available")
    private boolean discountAvailable;

    @Column(name = "product_available")
    private boolean productAvailable;

    @Column(name = "stock")
    private int stock;

    @Column(name = "note")
    private String note;

    @Column(name = "discount")
    private int discount;

    @Column(name = "picture")
    private byte[] picture;

    @Column(name = "color", length = 50)
    private String color;

    @Column(name = "size")
    private String size;
}
