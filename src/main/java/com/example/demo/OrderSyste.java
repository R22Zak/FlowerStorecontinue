package com.example.demo;

public class OrderSyste {
    public static void main(String[] args) {
        Order order = new Order();

        // Add items
        order.addItem(new Item("Laptop", 1200.0));
        order.addItem(new Item("Mouse", 25.0));

        // Set payment and delivery strategies
        order.setPaymentStrategy(new CreditCardPaymentStrategy("1234567890123456"));
        // Process order
        order.processOrder();
    }
}
