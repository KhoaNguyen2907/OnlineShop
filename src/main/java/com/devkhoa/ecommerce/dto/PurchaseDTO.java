package com.devkhoa.ecommerce.dto;

import com.devkhoa.ecommerce.entity.Address;
import com.devkhoa.ecommerce.entity.Customer;
import com.devkhoa.ecommerce.entity.OrderItem;
import com.devkhoa.ecommerce.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseDTO {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Orders order;
    private Set<OrderItem> orderItems;
}
