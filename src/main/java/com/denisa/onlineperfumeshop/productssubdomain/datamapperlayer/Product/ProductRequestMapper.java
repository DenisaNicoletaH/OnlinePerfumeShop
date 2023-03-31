package com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer;


import com.denisa.onlineperfumeshop.productssubdomain.datalayer.Product;
import com.denisa.onlineperfumeshop.productssubdomain.datalayer.ProductIdentifier;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.ProductRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductRequestMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "productIdentifier",ignore = true)
    @Mapping(target = "perfume",ignore = true)



    Product entityToRequestModel(ProductRequestModel productRequestModel);

}