package com.kodilla.ecommercee.controller;


import com.kodilla.ecommercee.domain.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {

    @GetMapping
    public List<ProductDto> getProducts() {
        List<ProductDto> productList = new ArrayList<>();
        productList.add(new ProductDto(1L, "testProduct1", new BigDecimal("12.3")));
        productList.add(new ProductDto(1L, "testProduct2", new BigDecimal("2.3")));
        return new ArrayList<>();
    }

    @GetMapping(value = "{productId}")
    public ProductDto getProduct(@PathVariable Long productId) {

        return new ProductDto(1L, "testproduct", new BigDecimal("12.3"));
    }

    @DeleteMapping(value = "{productId}")
    public void deleteProduct(@PathVariable Long productId) {

    }

    @PutMapping
    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
        return new ProductDto(1L, "testproduct", new BigDecimal("12.3"));
    }

    @PostMapping
    public void createProduct(@RequestBody ProductDto productDto) {

    }
}
