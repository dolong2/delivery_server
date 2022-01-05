package com.example.delivery.service;

import com.example.delivery.domain.Member;
import com.example.delivery.dto.MemberDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {
    @Autowired
    private MemberService memberService;

    @AfterEach
    public void init(){
        memberService.delete();
    }

    @Test
    public void join(){
        MemberDto memberDto = new MemberDto("email@gmail.com", "test", "1234");
        Long join = memberService.join(memberDto);
        Assertions.assertThat(join).isEqualTo(1L);
    }
    @Test
    public void findOne(){
        //given
        MemberDto memberDto = new MemberDto("email@gmail.com", "test", "1234");
        Long join = memberService.join(memberDto);

        //when
        Member byId = memberService.findById(join);

        //then
        Assertions.assertThat(byId.getEmail()).isEqualTo("email@gmail.com");
    }
}