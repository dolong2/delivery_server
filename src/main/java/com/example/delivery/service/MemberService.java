package com.example.delivery.service;

import com.example.delivery.domain.Member;
import com.example.delivery.dto.MemberDto;
import com.example.delivery.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public Long join(MemberDto memberDto){
        Member member = memberDto.toEntity();
        memberRepository.save(member);
        return member.getId();
    }
    public Member findById(Long id){
        Optional<Member> byId = memberRepository.findById(id);
        Member member = byId.get();
        return member;
    }
    public List<Member> findAll(){
        return memberRepository.findAll();
    }
    public void deleteOne(Long memberIdx){
        memberRepository.deleteById(memberIdx);
    }
    public void deleteAll(){
        memberRepository.deleteAll();
    }
}
