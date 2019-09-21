package com.google.manage.domain;

import java.util.Objects;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantitty;

    public Product(ProductBuilder builder) {
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.price = builder.price;
        this.quantitty = builder.quantitty;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantitty() {
        return quantitty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantitty=" + quantitty +
                '}';
    }
    public static class ProductBuilder{
        private String productId;
        private String productName;
        private double price;
        private int quantitty;

        public ProductBuilder productId(String id){
            this.productId = id;
            return this;
        }
        public ProductBuilder productName(String name){
            this.productName = name;
            return this;
        }
        public ProductBuilder price(double prc){
            this.price = prc;
            return this;
        }
        public ProductBuilder quantity(int qty){
            this.quantitty = qty;
            return this;
        }
        public Product build(){
            return new Product(this);
        }
    }
}
