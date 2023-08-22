package com.media.store.repository;

import com.media.store.entity.BaseProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<BaseProduct, Long> {

}

