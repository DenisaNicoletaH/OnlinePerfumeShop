package com.denisa.onlineperfumeshop.productssubdomain.businesslayer;

import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.DiscountIdentifier;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.DiscountRequestModel;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.DiscountResponseModel;

import java.util.List;

public interface DiscountService {
    DiscountResponseModel addDiscount(DiscountRequestModel discountRequestModel, DiscountIdentifier discountIdentifier);

    DiscountResponseModel getDiscountByIdentifier(String discountId);

    List<DiscountResponseModel> getDiscounts();



}
