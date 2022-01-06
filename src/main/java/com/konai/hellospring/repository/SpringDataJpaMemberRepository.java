package com.konai.hellospring.repository;

import com.konai.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//인터페이스가 상속받을 때는 implements가 아닌 extends를 씀
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JPQL select m from Member m where m where m.name =?
    @Override
    Optional<Member> findByName(String name);

}
