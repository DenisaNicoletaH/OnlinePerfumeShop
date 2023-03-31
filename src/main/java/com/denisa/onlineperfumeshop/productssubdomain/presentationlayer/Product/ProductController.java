package com.denisa.onlineperfumeshop.productssubdomain.presentationlayer;

import com.denisa.onlineperfumeshop.productssubdomain.businesslayer.InventoryService;
import com.denisa.onlineperfumeshop.productssubdomain.datalayer.ProductIdentifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

        InventoryService inventoryService;

        public ProductController(InventoryService inventoryService) {
                this.inventoryService = inventoryService;
        }


        @PostMapping()
        public ProductResponseModel addProduct(@RequestBody ProductRequestModel productRequestModel, @RequestBody ProductIdentifier productIdentifier){
                return inventoryService.addProduct(productRequestModel,productIdentifier);


        }


        @GetMapping("/{productId}")
        public ProductResponseModel getProductId(@PathVariable String productId) {
            return inventoryService.getProductByIdentifier(productId);
        }

        @GetMapping()
        public List<ProductResponseModel> getProducts() {
            return inventoryService.getProducts();
        }


}