package org.example;

class OrderInStore implements Order {
    private double price;

    public OrderInStore(double price) {
        this.price = price;
    }

    @Override
    public String getType() {
        return "In-Store";
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void displayOrder() {
        System.out.println("In-Store Order with price: " + price);
    }

}