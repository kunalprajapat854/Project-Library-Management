package in.kunal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.kunal.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	public List<Member> findAllByOrderByFirstNameAscMiddleNameAscLastNameAsc();
	public Long countByType(String type);
}
