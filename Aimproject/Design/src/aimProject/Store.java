package aimProject;

public class Store {
	private DigitalVideoDisc[] dvdsInStore5791; // Array to store DVDs in the store
    private int currentCount5791; // Tracks the current number of DVDs in the store
    private int maxCapacity5791;  // Maximum capacity of the store

    // Constructor: Initializes the store with the given maximum capacity
    public Store(int maxCapacity) {
        this.maxCapacity5791 = maxCapacity;
        this.dvdsInStore5791 = new DigitalVideoDisc[maxCapacity]; // Initialize the array
        this.currentCount5791 = 0; // Initially, the store is empty
    }

    // Add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (currentCount5791 < maxCapacity5791) {
            dvdsInStore5791[currentCount5791] = dvd;
            currentCount5791++;
            System.out.println("DVD added to the store: " + dvd.getTitle());
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    // Remove a DVD from the store by its title
    public void removeDVD(String title5791) {
        boolean removed = false;
        for (int i = 0; i < currentCount5791; i++) {
            if (dvdsInStore5791[i] != null && dvdsInStore5791[i].getTitle().equalsIgnoreCase(title5791)) {
                // Shift the remaining DVDs to fill the gap
                for (int j = i; j < currentCount5791 - 1; j++) {
                    dvdsInStore5791[j] = dvdsInStore5791[j + 1];
                }
                dvdsInStore5791[currentCount5791 - 1] = null; // Clear the last slot
                currentCount5791--;
                System.out.println("DVD removed from the store: " + title5791);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("No DVD found with title: " + title5791);
        }
    }

    // Display all DVDs in the store
    public void displayStore() {
        System.out.println("******************STORE******************");
        if (currentCount5791 == 0) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < currentCount5791; i++) {
                if (dvdsInStore5791[i] != null) {
                    System.out.println((i + 1) + ". " + dvdsInStore5791[i]); // Assumes toString() is implemented in DigitalVideoDisc
                }
            }
        }
        System.out.println("****************************************");
    }
}
