package com.denisa.onlineperfumeshop.productssubdomain.presentationlayer;

import com.denisa.onlineperfumeshop.productssubdomain.businesslayer.DiscountService;
import com.denisa.onlineperfumeshop.productssubdomain.businesslayer.DiscountServiceImpl;
import com.denisa.onlineperfumeshop.productssubdomain.businesslayer.InventoryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/discounts")
public class DiscountController {
   DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }


    @GetMapping()
    public List<DiscountResponseModel> getDiscounts() {
        return discountService.getDiscounts();
    }




}


