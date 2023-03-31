package com.denisa.onlineperfumeshop.productssubdomain.presentationlayer;

import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.SalePrices;
import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.SaleStatus;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DiscountRequestModel {

    private Integer salePercent;// the sale percentage


    private SalePrices salePrices;


    private SaleStatus saleStatus;

}
