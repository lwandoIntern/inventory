package com.google.manage.domain;

import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.util.Objects;

public class Orders {
    private String orderId;
    private String orderDesc;
    private String productId;
    private String customerId;

    public Orders(OrdersBuilder ordersBuilder) {
        this.orderId = ordersBuilder.orderId;
        this.orderDesc = ordersBuilder.orderDesc;
        this.productId = ordersBuilder.productId;
        this.customerId = ordersBuilder.customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public String getProductId() {
        return productId;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return orderId.equals(orders.orderId);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId='" + orderId + '\'' +
                ", orderDesc='" + orderDesc + '\'' +
                ", productId='" + productId + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
    public static class OrdersBuilder{
        private String orderId;
        private String orderDesc;
        private String productId;
        private String customerId;

        public OrdersBuilder orderId(String id){
            this.orderId = id;
            return this;
        }
        public OrdersBuilder orderDesc(String desc){
            this.orderDesc = desc;
            return this;
        }
        public OrdersBuilder productId(String prodId){
            this.productId = prodId;
            return this;
        }
        public OrdersBuilder customerId(String custId){
            this.customerId = custId;
            return this;
        }
        public Orders build(){
            return new Orders(this);
        }
    }
}
