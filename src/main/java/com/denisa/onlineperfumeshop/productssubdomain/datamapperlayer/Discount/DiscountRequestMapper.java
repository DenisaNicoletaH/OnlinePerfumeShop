package com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer;

import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.Discount;
import com.denisa.onlineperfumeshop.productssubdomain.datalayer.inventory.Inventory;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.DiscountRequestModel;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.InventoryRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DiscountRequestMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "discountIdentifier", ignore = true)
    Discount requestModelToEntity(DiscountRequestModel requestModel);
}

