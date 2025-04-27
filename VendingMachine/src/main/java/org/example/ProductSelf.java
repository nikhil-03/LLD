package org.example;

import java.util.List;

public class ProductSelf {
    int productSelfId;
    Product product;
    boolean isAvailable;

    public ProductSelf() {
    }
    public ProductSelf(boolean isAvailable, Product productList, int productSelfId) {
        this.isAvailable = isAvailable;
        this.product = productList;
        this.productSelfId = productSelfId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductSelfId() {
        return productSelfId;
    }

    public void setProductSelfId(int productSelfId) {
        this.productSelfId = productSelfId;
    }

    //addProduct
    //removeProduct
}
