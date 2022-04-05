package com.example.ecomrest.domains.shops.service.shopImpl;

import com.example.ecomrest.domains.employee.exception.ResourceNotFoundException;
import com.example.ecomrest.domains.shops.models.Shop;
import com.example.ecomrest.domains.shops.repository.ShopRepository;
import com.example.ecomrest.domains.shops.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    ShopRepository shopRepository;

    @Override
    public List<Shop> createShop(Shop shop) {
        shopRepository.save(shop);
        return shopRepository.findAll();
    }

    @Override
    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    @Override
    public Shop getParticularShop(Long id) {
        Optional<Shop> shop=shopRepository.findById(id);
        if (shop.isPresent()){
            return shop.get();
        }else {
           throw  new ResourceNotFoundException("Shop","location",id);
        }
    }

    @Override
    public Shop updateParticularShop(Shop shop, Long id) {
        return null;
    }

    @Override
    public Shop deleteParticularShop(Long id) {
        return null;
    }
}
