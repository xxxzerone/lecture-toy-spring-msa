package com.example.catalogservice.repository;

import com.example.catalogservice.domain.CatalogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {

    CatalogEntity findByProductId(String productId);
}
