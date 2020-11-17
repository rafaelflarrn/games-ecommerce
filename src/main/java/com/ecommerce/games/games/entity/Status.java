package com.ecommerce.games.games.entity;

public enum Status {
    PENDING(1),
    AWAITINGPAYMENT(2),
    AWAITINGFULFILLMENT(3),
    AWAITINGSHIPMENT(4),
    SHIPPED(5),
    COMPLETED(6),
    CANCELLED(7);

    Status(int i){

    }
}
