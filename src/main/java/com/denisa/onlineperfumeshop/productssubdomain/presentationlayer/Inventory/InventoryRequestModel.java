package com.denisa.onlineperfumeshop.productssubdomain.presentationlayer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class InventoryRequestModel {
    Date lastInventoryUpdated;

 /*
    public InventoryRequestModel(String type) {
        this.lastInventoryUpdated = lastInventoryUpdated;
    }

    public Date getLastInventoryUpdated() {
        return lastInventoryUpdated;
    }

    public void setLastInventoryUpdated(Date lastInventoryUpdated ) {
        this.lastInventoryUpdated = lastInventoryUpdated;
    }

    */

}

