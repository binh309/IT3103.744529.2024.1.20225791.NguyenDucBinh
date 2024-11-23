package aimProject;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a new cart
        Cart cart = new Cart();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1_5791 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1_5791);

        DigitalVideoDisc dvd2_5791 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2_5791);

        DigitalVideoDisc dvd3_5791 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3_5791);

        // Test the print method
        cart.print5791(); 
        cart.searchById(2);
        cart.searchByTitle("The Lion King");
	}

}
