package com.denisa.onlineperfumeshop.productssubdomain.businesslayer;


import com.denisa.onlineperfumeshop.productssubdomain.datalayer.ProductIdentifier;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.*;

import java.util.List;

public interface InventoryService {

    //Products--------------------------
    ProductResponseModel addProduct(ProductRequestModel productRequestModel, ProductIdentifier productIdentifier);

    ProductResponseModel getProductByIdentifier(String productId);


    List<ProductResponseModel> getProducts();
    //-------------------------------------



    //Inventory--------------------------

  InventoryResponseModel addInventory(InventoryRequestModel inventoryRequestModel);
   List<InventoryResponseModel> getInventories();



    /*
    List<InventoryResponseModel> getProductsInInventoryByFieldId(String inventoryId,
                                                             Map<String,String> querryParams);


    ProductInventoryResponseModel getInventoryDetails(String inventoryId);


    ProductResponseModel addProductToInventory(ProductRequestModel vehicleRequestModel,String inventoryId);

*/





}
