package tk.ebalsa.strutsok.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tk.ebalsa.strutsok.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByAuthor (String author);
	List<Book> findByEdit (String editor);
}
