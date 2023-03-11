package com.kodilla.ecommercee.domain;



import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class ProductDto {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
}
