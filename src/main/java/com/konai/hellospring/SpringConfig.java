package com.konai.hellospring;

import com.konai.hellospring.repository.MemberRepository;
import com.konai.hellospring.repository.MemoryMemberRepository;
import com.konai.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

}
