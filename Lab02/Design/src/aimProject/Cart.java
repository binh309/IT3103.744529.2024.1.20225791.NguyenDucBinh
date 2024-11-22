package aimProject;

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
