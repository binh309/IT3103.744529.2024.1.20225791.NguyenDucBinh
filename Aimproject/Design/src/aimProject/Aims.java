package aimProject;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        //Cart anOrder5791 = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1_5791 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
        //anOrder5791.addDigitalVideoDisc(dvd1_5791);

        DigitalVideoDisc dvd2_5791 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
        //anOrder5791.addDigitalVideoDisc(dvd2_5791);

        DigitalVideoDisc dvd3_5791 = new DigitalVideoDisc("Aladin","Animation", 18.99f);
        //anOrder5791.addDigitalVideoDisc(dvd3_5791);
        //anOrder5791.addDigitalVideoDisc(dvd2_5791, dvd3_5791);
        // Print total cost of the items in the cart
        /*System.out.print("Total cost is: ");
        System.out.println(anOrder5791.totalCost());
        anOrder5791.removeDigitalVideoDisc(dvd3_5791);
        System.out.print("Total cost is: ");
        System.out.println(anOrder5791.totalCost());
        DigitalVideoDisc[] dvds_5791 = { dvd1_5791,dvd2_5791 ,dvd3_5791 };
        anOrder5791.addDigitalVideoDisc(dvds_5791);
        anOrder5791.printCart5791();*/
        Cart anOrder5791 = new Cart();
        DigitalVideoDisc disc1 = new DigitalVideoDisc("Movie A", "Action", "Director A", 120, 10.0f);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Movie B", "Comedy", "Director B", 90, 12.0f);

        // Add the discs to the cart using the method
        anOrder5791.addDigitalVideoDisc(disc1, disc2);
        System.out.println(disc2.getId());
    }
}
