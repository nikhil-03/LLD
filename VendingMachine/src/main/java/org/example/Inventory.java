package org.example;

import java.util.List;

public class Inventory {
    ProductSelf[] productSelfList;

    public ProductSelf[] getProductSelfList() {
        return productSelfList;
    }

    public void setProductSelfList(ProductSelf[] productSelfList) {
        this.productSelfList = productSelfList;
    }

    Inventory(int size){
        productSelfList = new ProductSelf[size];
        initialiseInventory();
    }

    private void initialiseInventory() {
        int id=101;
        for(int i=0;i<productSelfList.length;i++){
            ProductSelf productSelf=new ProductSelf();
            productSelf.setProductSelfId(id++);
            productSelf.setAvailable(false);
            // product will not be added here
            productSelfList[i]=productSelf;
        }
    }
    public Product findProduct(int selfId){
        for (ProductSelf productSelf : productSelfList) {
            if (selfId == productSelf.getProductSelfId()) {
                return productSelf.getProduct();
            }
        }
        return null;
    }

    public void addProduct(Product product,int count,int selfId){
        for (ProductSelf productSelf : productSelfList) {
            if (selfId == productSelf.getProductSelfId()) {
                if (!productSelf.isAvailable) {
                    productSelf.setAvailable(true);
                }
                productSelf.setProduct(product);
            }
        }
    }
    void removeProduct(Product product,int count,int selfId){
  // similar code

    }

}
