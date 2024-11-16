package org.example;

class OrderFactory {
    public static Order createOrder(String type, double price) {
        return switch (type) {
            case "Online" -> new OrderOnline(price);
            case "In-Store" -> new OrderInStore(price);
            case "Pickup" -> new OrderPickup(price);
            default -> throw new IllegalArgumentException("Invalid order type");
        };
    }
}