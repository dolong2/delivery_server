package com.example.delivery.dto;

import com.example.delivery.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
@NoArgsConstructor @AllArgsConstructor
public class MemberDto {
    @NotBlank(message="email should be valid")
    private String email;
    @NotBlank(message="name should be valid")
    private String name;
    @NotBlank(message="password should be valid")
    private String password;
    public Member toEntity(){
        return Member.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();
    }
}
