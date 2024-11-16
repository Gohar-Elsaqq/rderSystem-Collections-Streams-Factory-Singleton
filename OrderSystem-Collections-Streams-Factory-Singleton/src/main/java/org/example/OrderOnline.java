package org.example;

class OrderOnline implements Order {
    private double price;

    public OrderOnline(double price) {
        this.price = price;
    }

    @Override
    public String getType() {
        return "Online";
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void displayOrder() {
        System.out.println("Online Order with price: " + price);
    }
}