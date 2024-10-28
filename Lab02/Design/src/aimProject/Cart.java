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
}
