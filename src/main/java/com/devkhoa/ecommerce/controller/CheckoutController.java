package com.devkhoa.ecommerce.controller;

import com.devkhoa.ecommerce.dto.PurchaseDTO;
import com.devkhoa.ecommerce.dto.PurchaseResponse;
import com.devkhoa.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private final CheckoutService checkoutService;
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody PurchaseDTO purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }
}
