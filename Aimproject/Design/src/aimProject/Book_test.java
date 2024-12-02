package aimProject;

public class Book_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book( "Java Programming", "Programming", 30.5f);

        // Add authors
        book.addAuthor("Author 1");
        book.addAuthor("Author 2");
        book.addAuthor("Author 1"); // Should print "Author already exists"

        // Remove an author
        book.removeAuthor("Author 2");
        book.removeAuthor("Author 3"); // Should print "Author not found"

        // Print book details
        System.out.println(book);
	}

}
