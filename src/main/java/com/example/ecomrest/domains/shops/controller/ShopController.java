package com.example.ecomrest.domains.shops.controller;

import com.example.ecomrest.domains.shops.models.Shop;
import com.example.ecomrest.domains.shops.service.shopImpl.ShopServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shop/v1/")
public class ShopController {
    private ShopServiceImpl shopService;

    public ShopController(ShopServiceImpl shopService) {
        super();
        this.shopService = shopService;
    }


    //    creating one
    @PostMapping
    public ResponseEntity<List<Shop>> saveShop(@RequestBody Shop shop) {
        return new ResponseEntity<List<Shop>>(shopService.createShop(shop), HttpStatus.CREATED);
    }
    //    getting all
    @GetMapping
    public ResponseEntity<List<Shop>> getAllShops() {
        return new ResponseEntity<List<Shop>>(shopService.getAllShops(), HttpStatus.CREATED);
    }

    //    getting one
    @GetMapping
    public ResponseEntity<List<Shop>> getParticularShop(Long id) {

        return new ResponseEntity<List<Shop>>(shopService.getAllShops(), HttpStatus.CREATED);
    }
}
