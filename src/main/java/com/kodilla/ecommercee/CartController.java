package com.kodilla.ecommercee;

import com.kodilla.domain.CartDto;
import com.kodilla.domain.ProductDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carts")
@CrossOrigin("*")
public class CartController {

    @PostMapping
    public void createCart(@RequestBody CartDto cartDto) {

    }

    @GetMapping(value = "{cartId}")
    public List<CartDto> getProductsFromCart(@PathVariable Long cartId) {
        return new ArrayList<>();
    }

    @PutMapping
    public CartDto addProductsToCart(@RequestBody ProductDto productDto) {
        return new CartDto();
    }

    @DeleteMapping(value = "deleteProducts/{productId}/{cartId}")
    public void removeProductFromCart(@PathVariable Long productId, @PathVariable Long cartId) {

    }

    @PostMapping("{cartId}")
    public void createOrder(@PathVariable Long cartId) {

    }
}
