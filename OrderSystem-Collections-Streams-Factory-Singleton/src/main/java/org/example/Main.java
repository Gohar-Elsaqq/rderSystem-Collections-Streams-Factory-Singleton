package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        orders.add(OrderFactory.createOrder("Online", 150.0));
        orders.add(OrderFactory.createOrder("In-Store", 80.0));
        orders.add(OrderFactory.createOrder("Pickup", 100.0));
        orders.add(OrderFactory.createOrder("Online", 200.0));
        orders.add(OrderFactory.createOrder("In-Store", 120.0));

        List<Order> onlineOrders = orders.stream()
                .filter(order -> order.getType()
                        .equals("Online"))
//                        .equals("In-Store"))
//                        .equals("Pickup"))
                .collect(Collectors.toList());


        System.out.println("Online Orders:");
        onlineOrders.forEach(Order::displayOrder);

        double totalPrice = onlineOrders.stream()
                .mapToDouble(Order::getPrice)
                .sum();

        System.out.println("Total Price of Online Orders: $" + totalPrice);
    }
}