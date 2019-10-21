package composition;
public class Composition {

	public static void main(String[] args) {
		Author author = new Author("Arpan Das", "arp14@yahoo.com", 'M');
		Book book = new Book("Java Fundamentals", author, 199.0, 500);
		
		System.out.println(book);
	}

}