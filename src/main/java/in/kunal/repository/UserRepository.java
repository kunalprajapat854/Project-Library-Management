package in.kunal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.kunal.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public List<User> findAllByOrderByDisplayNameAsc();
	public List<User> findAllByActiveOrderByDisplayNameAsc(Integer active);
	public User findByUsername(String username);
}
