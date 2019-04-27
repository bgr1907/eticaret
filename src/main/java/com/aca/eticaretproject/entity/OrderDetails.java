package com.aca.eticaretproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long orderID;

    @JoinColumn(name = "product_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Products productID;

    @Column(name = "order_number")
    private long orderNumber;

    @Column(name = "price")
    private long price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "discount")
    private int discount;

    @Column(name = "total")
    private float total;

    @Column(name = "size")
    private String size;

    @Column(name = "color", length = 50)
    private String color;

    @Column(name = "ship_date")
    private Date shipDate;

    @Column(name = "order_detail_id")
    private int orderDetailID;


}
