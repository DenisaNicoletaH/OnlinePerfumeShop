package com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer;

import com.denisa.onlineperfumeshop.productssubdomain.datalayer.inventory.Inventory;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.ProductInventoryResponseModel;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.ProductResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductInventoryResponseMapper {



        @Mapping(expression = "java(inventory.getInventoryIdentifier().getInventoryId())", target = "inventoryId")
        @Mapping(expression = "java(inventory.getLastInventoryUpdate())", target = "lastUpdated")
        @Mapping(expression = "java(products)", target = "productsInStock")
        ProductInventoryResponseModel entitiesToResponseModel(Inventory inventory, List<ProductResponseModel> products);

    }


