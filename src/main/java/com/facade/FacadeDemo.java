package com.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("user12",
                "product123", "Hyderabad, India", "UPI", 15000);


    }
}
