package aimProject;

public class TestDigitalVideoDisc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Sci-Fi", "Interstellar", 19.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Christopher Nolan", "Drama", "Dunkirk", 14.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Tenet", "Action", "Christopher Nolan", 150, 24.99f);

        // Print out the DVDs
        System.out.println(dvd1);
        System.out.println(dvd2);
        System.out.println(dvd3);
        System.out.println(dvd4);
	}

}
