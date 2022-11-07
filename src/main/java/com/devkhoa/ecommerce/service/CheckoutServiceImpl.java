package com.devkhoa.ecommerce.service;

import com.devkhoa.ecommerce.dto.PurchaseDTO;
import com.devkhoa.ecommerce.dto.PurchaseResponse;
import com.devkhoa.ecommerce.entity.Customer;
import com.devkhoa.ecommerce.entity.OrderItem;
import com.devkhoa.ecommerce.entity.Orders;
import com.devkhoa.ecommerce.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;
import java.util.UUID;

@Service
@Transactional
public class CheckoutServiceImpl implements CheckoutService {
    private final CustomerRepository customerRepository;
    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public PurchaseResponse placeOrder(PurchaseDTO purchase) {
        Orders order = purchase.getOrder();
        String orderTrackingNumber = generateOrderTrackingNumber();

        order.setOrderTrackingNumber(orderTrackingNumber);
        order.setShippingAddress(purchase.getShippingAddress());
        order.setBillingAddress(purchase.getBillingAddress());

        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(item -> order.add(item));

        Customer customer = purchase.getCustomer();
        customer.add(order);
        customerRepository.save(customer);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        //generate a random UUID number
        return UUID.randomUUID().toString();

    }
}
