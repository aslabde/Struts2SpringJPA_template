package tk.ebalsa.strutsok.actions;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import tk.ebalsa.strutsok.bo.BookBo;
import tk.ebalsa.strutsok.model.Book;

import com.opensymphony.xwork2.ModelDriven;

public class BookAction  {
	
	Book book = new Book();
	List<Book> bookList = new ArrayList<Book>();
		
	BookBo bookBo;
	
	public Object getModel() {
		return book;
	}
	
	//DI with Spring
	
	@Autowired
	public void setBookBo(BookBo bookBo){
		this.bookBo=bookBo;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	
	
	//BUSINESS OPERATIONS:
	
	//Save book
	public String addBook() throws Exception{
		
		//save
		bookBo.addBook(book);
		
		//update list
		bookList=null;
		bookList=bookBo.listBooks();
		
		return "success";
		
	}
	
	
	//List books.
	public String listBooks() throws Exception{
		
		bookList=bookBo.listBooks();
		
		return "sucess";
	}

	


}
