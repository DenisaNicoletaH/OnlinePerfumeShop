package com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer;

import com.denisa.onlineperfumeshop.productssubdomain.datalayer.inventory.Inventory;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.InventoryRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InventoryRequestMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "inventoryIdentifier", ignore = true)


    Inventory requestModelToEntity(InventoryRequestModel requestModel);
}
