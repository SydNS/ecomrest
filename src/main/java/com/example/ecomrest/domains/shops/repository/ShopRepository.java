package com.example.ecomrest.domains.shops.repository;

import com.example.ecomrest.domains.shops.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop,Long> {
}
