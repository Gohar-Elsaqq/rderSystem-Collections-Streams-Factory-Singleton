package org.example;


import java.util.ArrayList;
import java.util.List;

class OrdersList {
    private static OrdersList instance;
    private List<Order> orders;

    private OrdersList() {
        orders = new ArrayList<>();
    }

    public static synchronized OrdersList getInstance() {
        if (instance == null) {
            instance = new OrdersList();
        }
        return instance;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}