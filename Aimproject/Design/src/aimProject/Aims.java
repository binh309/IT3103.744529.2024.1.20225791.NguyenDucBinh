 package aimProject;
 import java.util.Scanner;
 public class Aims {
	 public static void main(String[] args) {
		 Store store = new Store();
		 Cart cart=new Cart();
		 DigitalVideoDisc dvd1 = new DigitalVideoDisc( "The Lion King", "Animation","Roger Allers",  120,19.99f);
			Book book1 = new Book( "Harry Potter", "Fantasy", 10.99f);
			book1.addAuthor("J.K. Rowling");
			CompactDisc cd1 = new CompactDisc("Greatest Hits", "Pop", 15.99f, 60, "Roger Allers","Various Artists");

	        // Add items to the store
	        store.addMedia(dvd1);
	        store.addMedia(book1);
	        store.addMedia(cd1);
	        //showMenu(store);
	        cart.addMedia(dvd1);
	        cart.addMedia(book1);
	        cart.addMedia(cd1);
	        cartMenu(cart);
	    }
	 
	 public static void showMenu(Store store) {
	        int choice;
	        Scanner scanner = new Scanner(System.in); // Initialize the scanner
	        do {
	            // Display the main menu
	            System.out.println("AIMS: ");
	            System.out.println("--------------------------------");
	            System.out.println("1. View store");
	            System.out.println("2. Update store");
	            System.out.println("3. See current cart");
	            System.out.println("0. Exit");
	            System.out.println("--------------------------------");
	            System.out.print("Please choose a number: 0-1-2-3: ");
	            
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline left by nextInt()

	            switch (choice) {
	                case 1:
	                	storeMenu(store);
	                    break;
	                case 2:
	                	updateStoreMenu(store);
	                    break;
	                case 3:
	                    //viewCart(cart, scanner);
	                    break;
	                case 0:
	                    System.out.println("Exiting AIMS. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 0); // Loop until the user chooses to exit
	        scanner.close();
	    }
	 public static void storeMenu(Store store) {
		 	Scanner scanner = new Scanner(System.in); // Initialize the scanner
	        System.out.println("\n--- Viewing Store ---");
	        store.viewStore(); // Assuming Store has a method to display its items

	        System.out.println("Options:");
	        System.out.println("--------------------------------");
	        System.out.println("1. See a media's details");
	        System.out.println("2. Add a media to cart");
	        System.out.println("3. Play a media");
	        System.out.println("4. See current cart");
	        System.out.println("0. Back");
	        System.out.println("--------------------------------");
	        System.out.print("Please choose a number: 0-1-2-3: ");
	        
	        int choice = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        switch (choice) {
	            case 1:
	                seeMediaDetails(store);
	                break;
	            case 2:
	                //addMediaToCart(store, cart, scanner);
	                break;
	            case 3:
	                //playMedia(store, scanner);
	                break;
	            case 4:
	            	//Seecurrentcart(store);
	            case 0:
	                System.out.println("Returning to the main menu.");
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }
	        scanner.close();
	    }
	 public static void seeMediaDetails(Store store) {
		 	Scanner scanner = new Scanner(System.in); // Initialize the scanner
		 	System.out.println("Enter the title of the media:");
		    String title = scanner.nextLine(); // Read the media title from the user
		    Media media = store.findMediaByTitle(title); // Assuming Store has a `findMediaByTitle` method

		    if (media != null) {
		        // Display media details
		        System.out.println("\n--- Media Details ---");
		        System.out.println(media.toString()); // Assuming Media overrides `toString` to print details

		        // Submenu for actions
		        System.out.println("\nOptions:");
		        System.out.println("1. Add to cart");
		        if (media instanceof Playable) {
		            System.out.println("2. Play media"); // Only show Play if the media is playable
		        }
		        System.out.println("0. Back");
		        System.out.println("--------------------------------");
		        System.out.print("Please choose a number: ");

		        int choice = scanner.nextInt();
		        scanner.nextLine(); // Consume newline left by nextInt()

		        switch (choice) {
		            case 1:
		                // Add media to cart
		                System.out.println("Adding media to cart...");
		                // Assuming Cart has an `addMedia` method
		                Cart cart = new Cart(); // Replace with the actual cart instance
		                cart.addMedia(media);
		                System.out.println("Media added to cart successfully.");
		                break;

		            case 2:
		                if (media instanceof Playable) {
		                    // Play the media (only for CDs and DVDs)
		                    System.out.println("Playing media...");
		                    ((Playable) media).play(); // Call play() method from the Playable interface
		                } else {
		                    System.out.println("Invalid option. Media is not playable.");
		                }
		                break;

		            case 0:
		                System.out.println("Returning to the store menu...");
		                break;

		            default:
		                System.out.println("Invalid choice.");
		        }
		    } else {
		        // If the title is invalid
		        System.out.println("Media not found. Please check the title and try again.");
		    }
		    scanner.close();
		}

	 public static void mediaDetailsMenu(Store store, Cart cart) {
		 	Scanner scanner = new Scanner(System.in); // Initialize the scanner
		    System.out.println("Enter the title of the media:");
		    String title = scanner.nextLine();
		    Media media = store.findMediaByTitle(title);

		    if (media != null) {
		        System.out.println("\n--- Media Details ---");
		        System.out.println(media.toString());

		        boolean stayInMenu = true;
		        while (stayInMenu) {
		            System.out.println("\nOptions: ");
		            System.out.println("--------------------------------");
		            System.out.println("1. Add to cart");
		            if (media instanceof Playable) {
		                System.out.println("2. Play");
		            }
		            System.out.println("0. Back");
		            System.out.println("--------------------------------");
		            System.out.print("Please choose a number: ");

		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline
		            switch (choice) {
		                case 1:
		                    cart.addMedia(media);
		                    System.out.println("Media added to cart.");
		                    if (media instanceof DigitalVideoDisc) {
		                        System.out.println("Number of DVDs in cart: " + cart.size_cart());
		                    }
		                    break;

		                case 2:
		                    if (media instanceof Playable) {
		                        ((Playable) media).play();
		                    } else {
		                        System.out.println("This media is not playable.");
		                    }
		                    break;

		                case 0:
		                    stayInMenu = false;
		                    break;

		                default:
		                    System.out.println("Invalid choice. Try again.");
		            }
		        }
		    } else {
		        System.out.println("Media not found. Please check the title and try again.");
		    }
		    scanner.close();
		}

	 private static void updateStoreMenu(Store store) {
		 Scanner scanner = new Scanner(System.in); // Initialize the scanner
		    boolean stayInMenu = true;

		    while (stayInMenu) {
		        System.out.println("\nOptions: ");
		        System.out.println("--------------------------------");
		        System.out.println("1. Add media to store");
		        System.out.println("2. Remove media from store");
		        System.out.println("0. Back");
		        System.out.println("--------------------------------");
		        System.out.print("Please choose a number: ");

		        int choice = scanner.nextInt();
		        scanner.nextLine(); // Consume newline
		        switch (choice) {
		            case 1:
		                System.out.println("Enter media details (title, category, cost):");
		                String title = scanner.nextLine();
		                String category = scanner.nextLine();
		                float cost = scanner.nextFloat();
		                scanner.nextLine(); // Consume newline
		                Book newMedia = new Book(title, category, cost); // Modify for specific media types
		                store.addMedia(newMedia);
		                System.out.println("Media added to store.");
		                break;

		            case 2:
		                System.out.println("Enter the title of the media to remove:");
		                String removeTitle = scanner.nextLine();
		                Media toRemove = store.findMediaByTitle(removeTitle);
		                if (toRemove != null) {
		                    store.removeMedia(toRemove);
		                    System.out.println("Media removed from store.");
		                } else {
		                    System.out.println("Media not found.");
		                }
		                break;

		            case 0:
		                stayInMenu = false;
		                break;

		            default:
		                System.out.println("Invalid choice. Try again.");
		        }
		    }
		    scanner.close();
		}
	 private static void cartMenu(Cart cart) {
		 	Scanner scanner = new Scanner(System.in); 
		    boolean stayInMenu = true;

		    while (stayInMenu) {
		        System.out.println("\nOptions: ");
		        System.out.println("--------------------------------");
		        System.out.println("1. Filter medias in cart");
		        System.out.println("2. Sort medias in cart");
		        System.out.println("3. Remove media from cart");
		        System.out.println("4. Play a media");
		        System.out.println("5. Place order");
		        System.out.println("0. Back");
		        System.out.println("--------------------------------");
		        System.out.print("Please choose a number: ");

		        int choice = scanner.nextInt();
		        scanner.nextLine(); // Consume newline
		        switch (choice) {
		            case 1:
		                System.out.println("Filter by: 1. ID 2. Title");
		                int filterChoice = scanner.nextInt();
		                scanner.nextLine(); // Consume newline
		                if (filterChoice == 1) {
		                    System.out.println("Enter ID:");
		                    int id = scanner.nextInt();
		                    scanner.nextLine();
		                    cart.searchById(id);
		                } else if (filterChoice == 2) {
		                    System.out.println("Enter Title:");
		                    String title = scanner.nextLine();
		                    cart.searchByTitle(title);
		                } else {
		                    System.out.println("Invalid choice.");
		                }
		                break;

		            case 2:
		                System.out.println("Sort by: 1. Title 2. Cost");
		                int sortChoice = scanner.nextInt();
		                scanner.nextLine(); // Consume newline
		                if (sortChoice == 1) {
		                    cart.sortByTitleThenCost();
		                    cart.displayCart();
		                    //System.out.println("Cart sorted by title.");
		                } else if (sortChoice == 2) {
		                    cart.sortByCostThenTitle();
		                    cart.displayCart();
		                } else {
		                    System.out.println("Invalid choice.");
		                }
		                break;

		            case 3:
		                /*System.out.println("Enter the title of the media to remove:");
		                String removeTitle = scanner.nextLine();
		                Media toRemove = cart.findMediaByTitle(removeTitle); // Assume cart has `findMediaByTitle`
		                if (toRemove != null) {
		                    cart.removeMedia(toRemove);
		                    System.out.println("Media removed from cart.");
		                } else {
		                    System.out.println("Media not found.");
		                }*/
		                break;

		            case 4:
		                /*System.out.println("Enter the title of the media to play:");
		                String playTitle = scanner.nextLine();
		                Media toPlay = cart.findMediaByTitle(playTitle); // Assume cart has `findMediaByTitle`
		                if (toPlay != null && toPlay instanceof Playable) {
		                    ((Playable) toPlay).play();
		                } else {
		                    System.out.println("Media not found or not playable.");
		                }
		                break;*/
		            case 5:
		            	break;
		            case 0:
		                stayInMenu = false;
		                break;

		            default:
		                System.out.println("Invalid choice. Try again.");
		        }
		    }
		    scanner.close();
		}
    
}
 
 
