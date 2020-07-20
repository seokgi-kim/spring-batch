package com.sak.batch.repository;

import com.sak.batch.domain.Member;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

  List<Member> findByMemberId(String memberId);
}
