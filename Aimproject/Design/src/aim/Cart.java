//package aimProject;
package aim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public void sortByTitleThenCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostThenTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
    // Method to add Media to the cart
    public void addMedia(Media media5791) {
        itemsOrdered.add(media5791);
    }
    
    // Method to remove Media from the cart
    public void removeMedia(Media media5791) {
        if (itemsOrdered.contains(media5791)) {
            itemsOrdered.remove(media5791);
        } else {
            System.out.println("The item is not in the cart.");
        }
    }
    public int size_cart() {
    	return itemsOrdered.size();
    }
    // Method to calculate the total cost of all items in the cart
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();  // Make sure Media has the getCost method.
        }
        return total;
    }
    
    public void searchById(int id) {
        boolean found = false;

        // Loop through itemsOrdered, which contains Media objects
        for (Media media : itemsOrdered) {
            if (media != null && media.getId() == id) {  // Check if media is not null and if the id matches
                System.out.println("Found: " + media);  // Assuming Media has a properly implemented toString() method
                found = true;
                break;  // Exit the loop after finding the first match
            }
        }

        if (!found) {
            System.out.println("No Media found with ID: " + id);  // Inform the user if no match is found
        }
    }
    // Method to search for Media by Title
    public void searchByTitle(String title) {
        boolean found = false;

        // Loop through itemsOrdered to search by title
        for (Media media : itemsOrdered) {
            if (media != null && media.getTitle().equalsIgnoreCase(title)) {  // Check for null and case-insensitive title comparison
                System.out.println("Found: " + media);  // Print media details if found
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Media found with title: " + title);  // Inform the user if no match is found
        }
    }
    // Method to display all items in the cart
    public void displayCart() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (Media media : itemsOrdered) {
                System.out.println(media.toString());  // Make sure Media has a toString() method
            }
        }
    }
    public Iterator<Media> iterator() {
        return itemsOrdered.iterator();
    }
    // Search DVDs by ID
    

    // Search DVDs by title
 

}
/*
public class Cart {
    public static final int MAX_NUMBER_ORDERED5791 = 20;
    private DigitalVideoDisc itemsOrdered5791[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED5791];
    private int qtyOrdered5791 = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered5791 < MAX_NUMBER_ORDERED5791) {
            itemsOrdered5791[qtyOrdered5791] = disc;
            qtyOrdered5791++;
            System.out.println("The disc has been added.");
            if (qtyOrdered5791 == MAX_NUMBER_ORDERED5791) {
                System.out.println("The cart is almost full");
            }
        } else {
            System.out.println("The cart is full. Cannot add more discs.");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] discs) {
        for (DigitalVideoDisc disc : discs) {
            if (qtyOrdered5791 < MAX_NUMBER_ORDERED5791) {
                itemsOrdered5791[qtyOrdered5791] = disc;
                qtyOrdered5791++;
                System.out.println("The disc has been added.");
                if (qtyOrdered5791 == MAX_NUMBER_ORDERED5791) {
                    System.out.println("The cart is almost full");
                }
            } else {
                System.out.println("The cart is full. Cannot add more discs.");
                break; // Stop adding if the cart is full
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered5791 < MAX_NUMBER_ORDERED5791) {
            // Add disc1
            itemsOrdered5791[qtyOrdered5791] = disc1;
            qtyOrdered5791++;
            System.out.println("The first disc has been added.");
            
            // Check if the cart is almost full after adding disc1
            if (qtyOrdered5791 == MAX_NUMBER_ORDERED5791 - 1) {
                System.out.println("The cart is almost full.");
            }

            // Add disc2
            if (qtyOrdered5791 < MAX_NUMBER_ORDERED5791) {
                itemsOrdered5791[qtyOrdered5791] = disc2;
                qtyOrdered5791++;
                System.out.println("The second disc has been added.");
            } else {
                System.out.println("The cart is full. Cannot add the second disc.");
            }
        } else {
            System.out.println("The cart is full. Cannot add more discs.");
        }
    }
    public void printCart5791() {
        if (qtyOrdered5791 == 0) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Cart contents:");
            for (int i = 0; i < qtyOrdered5791; i++) {
                System.out.println(itemsOrdered5791[i]);
            }
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered5791; i++) {
            if (itemsOrdered5791[i].equals(disc)) {
                found = true;
                // Shift the rest of the elements to the left
                for (int j = i; j < qtyOrdered5791 - 1; j++) {
                    itemsOrdered5791[j] = itemsOrdered5791[j + 1];
                }
                itemsOrdered5791[qtyOrdered5791 - 1] = null;
                qtyOrdered5791--;
                System.out.println("The disc has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not in the cart.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered5791; i++) {
            total += itemsOrdered5791[i].getCost();
        }
        return total;
    }
    public void print5791() {
        System.out.println("******************CART******************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (DigitalVideoDisc disc : itemsOrdered5791) {
            if (disc != null) { // Check for null before accessing properties
                System.out.println(disc); // Assumes toString() is properly implemented in DigitalVideoDisc
                totalCost += disc.getCost();
            }
        }
        System.out.println("****************************************");
        System.out.println("Total cost: " + totalCost + " $");
    }

    // Search DVDs by ID
    public void searchById(int id) {
        boolean found = false;

        for (DigitalVideoDisc disc : itemsOrdered5791) { // Loop through the list/array
            if (disc != null && disc.getId() == id) { // Add a null check before accessing getId()
                System.out.println("Found: " + disc); // Assumes toString() is implemented in DigitalVideoDisc
                found = true;
                break; // Exit loop after finding the match
            }
        }

        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }
    public void searchByTitle(String title) {
        boolean found = false;

        for (DigitalVideoDisc disc : itemsOrdered5791) { // Loop through the list/array
            if (disc != null && disc.getTitle().equalsIgnoreCase(title)) { // Check for null and compare titles (case-insensitive)
                System.out.println("Found: " + disc); // Print details of the matched DVD
                found = true;
            }
        }

        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }

    
    // Search DVDs by title
}
*/
