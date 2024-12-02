package aimProject;
public class Store_Test{
    public static void main(String[] args) {
    	Store store = new Store();

        // Create Media objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc( "The Lion King", "Animation","Roger Allers",  120,19.99f);
		Book book1 = new Book( "Harry Potter", "Fantasy", 10.99f);
		book1.addAuthor("J.K. Rowling");
		CompactDisc cd1 = new CompactDisc("Greatest Hits", "Pop", 15.99f, 60, "Roger Allers","Various Artists");

        // Add items to the store
        store.addMedia(dvd1);
        store.addMedia(book1);
        store.addMedia(cd1);

        // Display all items in the store
        store.viewStore();

        // Search for items in the store
        store.searchById(1);        // Should find "The Lion King"
        store.searchByTitle("Harry Potter"); // Should find "Harry Potter"

        // Remove an item from the store
        store.removeMedia(dvd1);

        // Display the store after removal
        store.viewStore();
 
    }
}
/*
public class Store_Test{
    public static void main(String[] args) {
        // Create a store with a capacity of 5 DVDs
        Store store = new Store(5);

        // Create some DVDs to add to the store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Avatar", "Sci-Fi", "James Cameron", 162, 22.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "Jon Favreau", 118, 12.99f);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);

        // Display all DVDs in the store
        System.out.println("\nDisplaying the store:");
        store.displayStore();

        // Remove a DVD by its title
        System.out.println("\nRemoving 'Avatar' from the store:");
        store.removeDVD("Avatar");

        // Display the store again to verify removal
        System.out.println("\nDisplaying the store after removal:");
        store.displayStore();

        // Try removing a DVD that doesn't exist
        System.out.println("\nTrying to remove a non-existent DVD:");
        store.removeDVD("NonExistentMovie");

        // Add a new DVD to check if the store works correctly after removal
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 9.99f);
        System.out.println("\nAdding 'Frozen' to the store:");
        store.addDVD(dvd5);

        // Display the store again
        System.out.println("\nDisplaying the store after adding 'Frozen':");
        store.displayStore();
    }
}
*/
