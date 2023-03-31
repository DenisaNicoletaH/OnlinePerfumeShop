package com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer;

import com.denisa.onlineperfumeshop.productssubdomain.datalayer.inventory.Inventory;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.InventoryResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel ="spring")
public interface InventoryResponseMapper {

    @Mapping(expression = "java(inventory.getInventoryIdentifier().getInventoryId())", target = "inventoryId")

   InventoryResponseModel entityToResponseModel(Inventory inventory);

    List<InventoryResponseModel> entityListToResponseModelList(List<Inventory> inventories);
}



