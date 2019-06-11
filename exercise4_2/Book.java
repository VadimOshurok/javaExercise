package exercise4_2;

import java.util.ArrayList;

public class Book {
	private String title;
	private ArrayList<Reader> reader = new ArrayList<Reader>();

	public Book(String title) {
		this.title=title;
	} 
	
	public void addReader (Reader read){
		if (! reader.contains(read)) {
			reader.add(read);
			read.addBook(this);
		}
	}
	
	public void deleteReader (Reader read) {
		if (reader.contains(read)) {
			reader.remove(read);
			read.deleteBook(this);
		}
	}
	
	public String toString() {
		return "Книга: " + title + reader;
	}
	
	public ArrayList<Reader> getReader() {
		return reader;
	}
}
