package com.facade;

public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String userId, String productId, String address, String paymentMethod, double amount) {
        if (inventoryService.checkStock(productId)) {
            paymentService.makePayment(userId, paymentMethod, amount);
            shippingService.shipProduct(productId, address);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Product is out of stock.");
        }
    }
}
