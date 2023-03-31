package com.denisa.onlineperfumeshop.productssubdomain.datalayer;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class ProductIdentifier {

    private String productId;

    public ProductIdentifier() {
        this.productId = UUID.randomUUID().toString();
    }
    public String getProductId() {return this.productId;}



}

