package com.example.delivery.dto;

import com.example.delivery.domain.Member;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MemberDto {
    private String email;
    private String name;
    private String password;
    public Member toEntity(){
        return Member.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();
    }
}
