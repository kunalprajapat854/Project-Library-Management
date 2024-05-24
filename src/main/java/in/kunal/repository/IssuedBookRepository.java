package in.kunal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.kunal.model.Book;
import in.kunal.model.IssuedBook;

@Repository
public interface IssuedBookRepository extends JpaRepository<IssuedBook, Long> {
	public Long countByBookAndReturned(Book book, Integer returned);
}
