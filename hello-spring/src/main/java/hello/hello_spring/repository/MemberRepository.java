package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    //    id를 가져오는 코드
    Optional<Member> findById(Long id);
    //    name 을 가져오는 코드
    Optional<Member> findByName(String name);
    //    모든 회원 리스트 반환 코드
    List<Member> findAll();
}
