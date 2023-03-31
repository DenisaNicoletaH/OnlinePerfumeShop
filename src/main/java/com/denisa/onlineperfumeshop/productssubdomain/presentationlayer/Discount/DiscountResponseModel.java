package com.denisa.onlineperfumeshop.productssubdomain.presentationlayer;


import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.SalePrices;
import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.SaleStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DiscountResponseModel {

    private String discountId;


    private Integer salePercent;

    private SaleStatus saleStatus;

    private SalePrices salePrices;


}
