package exercise4_2;

import java.util.ArrayList;

public class Reader {
	private String name;
	private ArrayList<Book> book = new ArrayList<Book>();

	public Reader(String name) {
		this.name=name;
	} 
	
	public void addBook (Book bk){
		if (! book.contains(bk)) {
			book.add(bk);
			bk.addReader(this);
		}
	}
	
	public void deleteBook (Book bk) {
		if (book.contains(bk)) {
			book.remove(bk);
			bk.deleteReader(this);
		}
	}
	
	public String toString() {
		return "Читатель: " + name ;
	}

	public ArrayList<Book> getBook() {
		return book;
	}

}
