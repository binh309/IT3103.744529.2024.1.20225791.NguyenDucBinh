package aimProject;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder5791 = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1_5791 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
        anOrder5791.addDigitalVideoDisc(dvd1_5791);

        DigitalVideoDisc dvd2_5791 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
        anOrder5791.addDigitalVideoDisc(dvd2_5791);

        DigitalVideoDisc dvd3_5791 = new DigitalVideoDisc("Aladin","Animation", 18.99f);
        anOrder5791.addDigitalVideoDisc(dvd3_5791);

        // Print total cost of the items in the cart
        System.out.print("Total cost is: ");
        System.out.println(anOrder5791.totalCost());
        anOrder5791.removeDigitalVideoDisc(dvd3_5791);
        System.out.print("Total cost is: ");
        System.out.println(anOrder5791.totalCost());
    }
}
