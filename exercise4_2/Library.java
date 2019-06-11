package exercise4_2;

import java.util.ArrayList;

public class Library {
	private String title;
	private ArrayList<Reader> reader = new ArrayList<Reader>();
	private ArrayList<Book> book = new ArrayList<Book>();
	
	public Library(String title) {
		this.title=title;
	}
	
	public String toString() {
		return "Библиотека: " + title ;
	}
	
	public void addBook (Book bk){
		if (! book.contains(bk)) {
			book.add(bk);
		}
	}
	
	public void deleteBook (Book bk) {
		if (book.contains(bk)) {
			book.remove(bk);
		}
	}
	
	public void addReader (Reader read){
		if (! reader.contains(read)) {
			reader.add(read);
		}
	}
	
	public void deleteReader (Reader read) {
		if (reader.contains(read)) {
			reader.remove(read);
		}
	}
	
	public ArrayList<Reader> getReader() {
		return reader;
	}
	
	public ArrayList<Book> getBook() {
		return book ;
	}
	
}
