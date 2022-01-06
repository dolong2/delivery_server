package com.example.delivery.repository;

import com.example.delivery.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store,Long> {
    public List<Store> findByName(String name);
}
