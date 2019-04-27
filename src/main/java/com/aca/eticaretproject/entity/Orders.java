package com.aca.eticaretproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long orderID;

    @JoinColumn(name = "customer_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Customers customerID;

    @Column(name = "order_number")
    private long orderNumber;

    @Column(name = "order_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @Column(name = "ship_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shipDate;

    @Column(name = "required_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requiredDate;

    @JoinColumn(name = "shipper_id")
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    private Shippers shipperID;

    // db diyagramda tipi text olduğu için text'in max degeri length olarak verildi.
    @Column(name = "sales_text", length = 21844)
    private String salesText;

    @Column(name = "transaction_status")
    private boolean transactionStatus;

    @Column(name = "error_loc", length = 21844)
    private String errorLoc;

    @Column(name = "error_msg", length = 21844)
    private String errorMsg;

    @Column(name = "deleted")
    private boolean Deleted;

    @Column(name = "paid")
    private boolean paid;


}
