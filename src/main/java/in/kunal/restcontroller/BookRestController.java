package in.kunal.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.kunal.Service.BookService;
import in.kunal.Service.CategoryService;
import in.kunal.model.Book;
import in.kunal.model.Category;

@RestController
@RequestMapping(value = "/rest/book")
public class BookRestController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(value = {"/", "/list"})
	public List<Book> all() {
		return bookService.getAll();
	}
	
	@GetMapping(value = "/{id}/list")
	public List<Book> get(@PathVariable(name = "id") Long id) {
		Category category = categoryService.get(id);
		return bookService.getByCategory( category );
	}
	
	@GetMapping(value = "/{id}/available")
	public List<Book> getAvailableBooks(@PathVariable(name = "id") Long id) {
		Category category = categoryService.get(id);
		return bookService.geAvailabletByCategory( category );
	}
	
}
