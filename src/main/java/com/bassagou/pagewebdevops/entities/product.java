package com.bassagou.pagewebdevops.entities;

public class product {
    Long Id;
    String designation;
    int price;
    int quantity;

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public product(Long id, String designation, int price, int quantity) {
        Id = id;
        this.designation = designation;
        this.price = price;
        this.quantity = quantity;
    }

}
