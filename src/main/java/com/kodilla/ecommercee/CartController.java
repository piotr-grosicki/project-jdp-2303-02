package com.kodilla.ecommercee;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "createNewCart")
    public void createCart() {

    }

    @GetMapping(value = "cartId={cartId}")
    public List<Object> getProductsFromCart(@PathVariable Long cartId) {
        return new ArrayList<>();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "addProducts")
    public void addProductsToCart() {

    }

    @DeleteMapping(value = "removeProduct={productId}?fromCart={cartId}")
    public void removeProductFromCart(@PathVariable Long productId, @PathVariable Long cartId) {

    }

    @PostMapping(value = "createOrderFromCart={id}")
    public void createOrder(@PathVariable Long id) {

    }
}
