package com.devkhoa.ecommerce.service;

import com.devkhoa.ecommerce.dto.PurchaseDTO;
import com.devkhoa.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(PurchaseDTO purchase);
}
