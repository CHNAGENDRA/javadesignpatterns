package com.facade;

public class ShippingService {
    public void shipProduct(String productId, String address) {
        System.out.println("Shipping product " + productId + " to " + address);
    }
}
