package com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer;

import com.denisa.onlineperfumeshop.productssubdomain.datalayer.Product;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.ProductResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ProductResponseMapper {

    @Mapping(expression = "java(product.getProductIdentifier().getProductId())",  target = "productId")

    @Mapping(expression = "java(product.getPerfume().getScentType())", target = "scentType" )
    @Mapping(expression = "java(product.getPerfume().getDateProduced())", target = "dateProduced" )

    ProductResponseModel entityToResponseModel(Product product);


//getting multiple products
    List<ProductResponseModel> entityListToResponseModelList(List<Product> products);

}
