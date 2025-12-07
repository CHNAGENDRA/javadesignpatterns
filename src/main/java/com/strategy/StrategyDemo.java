package com.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart(
                new CreditCardPayment("1234-5678-9876-5432",
                        "John Doe", "123", "12/25"));
        cart1.checkout(10000);

        ShoppingCart cart2 = new ShoppingCart(
                new UPIPayment("cnb@ybl"));
        cart2.checkout(15000);
    }
}
