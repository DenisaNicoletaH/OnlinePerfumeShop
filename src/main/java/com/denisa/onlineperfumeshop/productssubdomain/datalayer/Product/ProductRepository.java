package com.denisa.onlineperfumeshop.productssubdomain.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    Product findByProductIdentifier_ProductId(String productId);

}
