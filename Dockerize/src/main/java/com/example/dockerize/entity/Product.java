package com.example.dockerize.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Product")
public class Product {

    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "product_sequence"
    )
    private Long id;
    @Column(name="product_name")
    private String productName;
    @Column(name="price")
    private Double price;
    @Column(name="description")
    private String description;

    public Product(Long id, String productName, Double price, String description) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }
}