package com.denisa.onlineperfumeshop.productssubdomain.presentationlayer;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductRequestModel {

    private String name;

    private String brand;

    private Double price;

    private String scentType;

    private Date dateProduced;



}


