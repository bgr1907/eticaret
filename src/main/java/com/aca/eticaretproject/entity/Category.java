package com.aca.eticaretproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private Long categoryID;

    @JoinColumn(name = "customer_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Products> products;

    @Column(name = "parent_id")
    private Long parentID;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description", length = 300)
    private String description;

    @Column(name = "picture")
    private byte[] picture;

    @Column(name = "active")
    private boolean active;
}
