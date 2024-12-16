package aim;

public class CartTest {

    public static void main(String[] args) {
        // Create instances of Media
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 120, 19.99f);
        Book book1 = new Book("Harry Potter", "Fantasy", 10.99f);
        book1.addAuthor("J.K. Rowling");
        CompactDisc cd1 = new CompactDisc("Greatest Hits", "Pop", 15.99f, 60, "Roger Allers", "Various Artists");

        // Create a Cart and add items
        Cart cart = new Cart();
        cart.addMedia(dvd1);
        cart.addMedia(book1);
        cart.addMedia(cd1);

        // Display initial cart items
        System.out.println("Initial Cart:");
        cart.displayCart();

        // Search by ID
        System.out.println("\nSearching by ID (1):");
        cart.searchById(1);  // Should find "The Lion King" DVD

        // Search by Title
        System.out.println("\nSearching by Title (Harry Potter):");
        cart.searchByTitle("Harry Potter");  // Should find "Harry Potter" Book

        // Sort by Title then Cost
        cart.sortByTitleThenCost();
        System.out.println("\nSorted by Title then Cost:");
        cart.displayCart();

        // Sort by Cost then Title
        cart.sortByCostThenTitle();
        System.out.println("\nSorted by Cost then Title:");
        cart.displayCart();

        // Calculate the total cost of the cart
        System.out.println("\nTotal cost of items in the cart: $" + cart.totalCost());
        
    }
}

