package in.kunal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.kunal.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	public List<Category> findAllByOrderByNameAsc();
}
