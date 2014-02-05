package tk.ebalsa.strutsok.bo;

import java.util.List;

import tk.ebalsa.strutsok.model.Book;

public interface BookBo {

	void addBook (Book book);
	List<Book> listBooks();
}
