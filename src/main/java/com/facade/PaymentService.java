package com.facade;

public class PaymentService {
    public boolean makePayment(String userId, String paymentMethod, double amount) {
        System.out.println("Processing payment of " + amount +
                " using payment method "+paymentMethod+" for user " + userId);
        return true;
    }
}
