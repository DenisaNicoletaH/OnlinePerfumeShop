package com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer;

import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.Discount;
import com.denisa.onlineperfumeshop.productssubdomain.datalayer.inventory.Inventory;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.DiscountResponseModel;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.InventoryResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DiscountResponseMapper {


    @Mapping(expression = "java(discount.getDiscountIdentifier().getDiscountId())", target = "discountId")

    DiscountResponseModel entityToResponseModel(Discount discount);

    List<DiscountResponseModel> entityListToResponseModelList(List<Discount> discountsList);
}

