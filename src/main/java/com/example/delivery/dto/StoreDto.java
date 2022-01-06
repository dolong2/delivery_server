package com.example.delivery.dto;

import com.example.delivery.domain.Store;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class StoreDto {
    private String name;
    private String explanation;
    public Store toEntity(){
        return Store.builder()
                .name(name)
                .explanation(explanation)
                .build();
    }
}
