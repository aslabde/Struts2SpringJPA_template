package tk.ebalsa.strutsok.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tk.ebalsa.strutsok.bo.BookBo;
import tk.ebalsa.strutsok.model.Book;
import tk.ebalsa.strutsok.persistence.BookRepository;

public class BookBoImpl implements BookBo {

	private BookRepository bookrepository;
	
		
	@Autowired
	public void setBookRepository(BookRepository bookrepository){
		this.bookrepository=bookrepository;
	}

	public void addBook(Book book){
		this.bookrepository.save(book);
	}

	public List<Book> listBooks(){
		return (List<Book>) this.bookrepository.findAll();
	}

	
}
