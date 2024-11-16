package org.example;

class OrderPickup implements Order {
    private double price;

    public OrderPickup(double price) {
        this.price = price;
    }

    @Override
    public String getType() {
        return "Pickup";
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void displayOrder() {
        System.out.println("Pickup Order with price: " + price);
    }
}