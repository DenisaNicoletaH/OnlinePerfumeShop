package com.denisa.onlineperfumeshop.productssubdomain.businesslayer;

import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.Discount;
import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.DiscountIdentifier;
import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.DiscountRepository;
import com.denisa.onlineperfumeshop.productssubdomain.datalayer.discount.SalePrices;
import com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer.Discount.DiscountRequestMapper;
import com.denisa.onlineperfumeshop.productssubdomain.datamapperlayer.Discount.DiscountResponseMapper;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.DiscountRequestModel;
import com.denisa.onlineperfumeshop.productssubdomain.presentationlayer.DiscountResponseModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService{


    private DiscountRepository discountRepository;

    private DiscountResponseMapper discountResponseMapper;
    private DiscountRequestMapper discountRequestMapper;


    public DiscountServiceImpl(DiscountRepository discountRepository, DiscountResponseMapper discountResponseMapper, DiscountRequestMapper discountRequestMapper) {
        this.discountRepository = discountRepository;
        this.discountResponseMapper = discountResponseMapper;
        this.discountRequestMapper = discountRequestMapper;
    }

    @Override
    public DiscountResponseModel addDiscount(DiscountRequestModel discountRequestModel, DiscountIdentifier discountIdentifier) {
        Discount discount=discountRequestMapper.requestModelToEntity(discountRequestModel);
        SalePrices salePrices=new SalePrices(discountRequestModel.getSalePrices().getNewPrices());
        discount.setSalePrices(salePrices);

        Discount newDiscount=discountRepository.save(discount);
        DiscountResponseModel discountResponse=discountResponseMapper.entityToResponseModel(newDiscount);
        return discountResponse;
    }

    @Override
    public DiscountResponseModel getDiscountByIdentifier(String discountId) {
        return discountResponseMapper.entityToResponseModel(discountRepository.findByDiscountIdentifier_DiscountId(discountId));
    }

    @Override
    public List<DiscountResponseModel> getDiscounts() {
        return discountResponseMapper.entityListToResponseModelList(discountRepository.findAll());


    }

}
