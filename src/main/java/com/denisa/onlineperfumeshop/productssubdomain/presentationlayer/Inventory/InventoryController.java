package com.denisa.onlineperfumeshop.productssubdomain.presentationlayer;

import com.denisa.onlineperfumeshop.productssubdomain.businesslayer.InventoryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/inventories")
public class InventoryController {
    InventoryServiceImpl inventoryService;


    public InventoryController(InventoryServiceImpl inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping()
    public List<InventoryResponseModel> getInventories(){
        return inventoryService.getInventories();
    }
}
