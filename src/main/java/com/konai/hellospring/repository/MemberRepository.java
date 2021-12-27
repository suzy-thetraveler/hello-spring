package com.konai.hellospring.repository;

import com.konai.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findBYName(String name);
    List<Member> findAll();
}
