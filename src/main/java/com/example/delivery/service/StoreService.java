package com.example.delivery.service;

import com.example.delivery.domain.Store;
import com.example.delivery.dto.StoreDto;
import com.example.delivery.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;
    public Long join(StoreDto storeDto){
        Store store = storeDto.toEntity();
        storeRepository.save(store);
        return store.getId();
    }
    public List<Store> findByName(String storeName){
        return storeRepository.findByName(storeName);
    }
}
