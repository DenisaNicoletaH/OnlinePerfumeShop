package com.denisa.onlineperfumeshop.productssubdomain.businesslayer;



import com.denisa.onlineperfumeshop.productssubdomain.datalayer.*;
import com.denisa.onlineperfumeshop.productssubdomain.datalayer.inventory.InventoryRepository;
import com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer.Inventory.InventoryRequestMapper;
import com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer.Inventory.InventoryResponseMapper;
import com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer.Product.ProductRequestMapper;
import com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer.Product.ProductResponseMapper;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    private ProductRepository productRepository;

    private ProductResponseMapper productResponseMapper;
    private ProductRequestMapper productRequestMapper;

    private InventoryRepository inventoryRepository;

    private InventoryResponseMapper inventoryResponseMapper;
    private InventoryRequestMapper inventoryRequestMapper;



    public InventoryServiceImpl(ProductRepository productRepository, ProductResponseMapper productResponseMapper, ProductRequestMapper productRequestMapper, InventoryRepository inventoryRepository, InventoryRequestMapper inventoryRequestMapper, InventoryResponseMapper inventoryResponseMapper) {
        this.productRepository = productRepository;
        this.productResponseMapper = productResponseMapper;
        this.productRequestMapper = productRequestMapper;
        this.inventoryResponseMapper=inventoryResponseMapper;
        this.inventoryRepository=inventoryRepository;
        this.inventoryRequestMapper=inventoryRequestMapper;

    }


    @Override
    public ProductResponseModel addProduct(ProductRequestModel productRequestModel, ProductIdentifier productIdentifier) {
    Product product=productRequestMapper.entityToRequestModel(productRequestModel);
    Perfume perfume=new Perfume(productRequestModel.getScentType(),productRequestModel.getDateProduced());
    product.setPerfume(perfume);

    Product newProduct=productRepository.save(product);
    ProductResponseModel productResponse=productResponseMapper.entityToResponseModel(newProduct);
    return  productResponse;
    }


    @Override
    public ProductResponseModel getProductByIdentifier(String productId) {
        return productResponseMapper.entityToResponseModel(productRepository.findByProductIdentifier_ProductId(productId));
    }

    @Override
    public List<ProductResponseModel> getProducts() {
        return productResponseMapper.entityListToResponseModelList(productRepository.findAll());
    }




    @Override
    public InventoryResponseModel addInventory(InventoryRequestModel inventoryRequestModel) {
        return inventoryResponseMapper.entityToResponseModel(inventoryRepository.save(inventoryRequestMapper.requestModelToEntity(inventoryRequestModel)));

    }

    @Override
    public List<InventoryResponseModel> getInventories() {
        return inventoryResponseMapper.entityListToResponseModelList(inventoryRepository.findAll());

    }

}
