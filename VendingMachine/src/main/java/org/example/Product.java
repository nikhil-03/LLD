package org.example;

public class Product {
    int productId;
    String name;
    double price;
    int productCount;

    public Product(String name, double price, int productCount, int productId) {
        this.name = name;
        this.price = price;
        this.productCount = productCount;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


}
