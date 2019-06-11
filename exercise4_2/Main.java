package exercise4_2;

public class Main {
	public static void main(String[] args) {
		Library minsk = new Library("Минск");
		Book pushkin = new Book("Сборник стихов А.С. Пушкин");
		Book lermontov = new Book("Сборник стихов М.Ю. Лермонтов");
		Reader alex = new Reader("А.Д. Алексей");
		Reader dima = new Reader("В.М. Дмитрий");
		
		minsk.addBook(lermontov);
		minsk.addBook(pushkin);
		minsk.addReader(alex);
		minsk.addReader(dima);
		
		alex.addBook(pushkin);
		alex.deleteBook(pushkin);
		alex.addBook(pushkin);
		dima.addBook(lermontov);
		
		System.out.println(alex.getBook());
		System.out.println(lermontov.toString());
		System.out.println(minsk.toString() + minsk.getBook());
		System.out.println(minsk.toString() + minsk.getReader());
	}
}
