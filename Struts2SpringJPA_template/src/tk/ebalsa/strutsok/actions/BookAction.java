package tk.ebalsa.strutsok.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tk.ebalsa.strutsok.bo.BookBo;
import tk.ebalsa.strutsok.model.Book;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class BookAction extends ActionSupport implements ModelDriven  {
	
	private Book book = new Book();
	private List<Book> bookList = new ArrayList<Book>();
		
	private BookBo bookBo;
	
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
	
	@Action(value="/addBook", results={
			@Result(name="success",location="pages/success.jsp")
		})	
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
