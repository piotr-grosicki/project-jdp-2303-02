package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID", unique = true)
    private long id;
    @Column(name = "PRODUCT_NAME")
    private long productName;
    @Column(name = "PRODUCT_PRICE")
    private BigDecimal productPrice;
    @ManyToOne
    @JoinColumn(name = "GROUP_ID")
    private Group productGroup;
}