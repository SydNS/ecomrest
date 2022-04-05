package com.example.ecomrest.domains.shops.service;

import com.example.ecomrest.domains.shops.models.Shop;

import java.util.List;

public interface ShopService {
    List<Shop> createShop(Shop shop);
    List<Shop> getAllShops();
    Shop getParticularShop(Long id);
    Shop updateParticularShop(Shop shop,Long id);
    Shop deleteParticularShop(Long id);
}
