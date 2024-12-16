//package aimProject;
package aim;

import java.util.ArrayList;
import java.util.List;
public class Media_test {

	public static void main(String[] args) {
		 List<Media> mediae = new ArrayList<>();

	        // Create some media
	   
	        Media book = new Book("Harry Potter", "Fantasy", 19.99f);
	        Media cd =  new CompactDisc("Greatest Hits", "Pop", 15.99f, 0, "Famous Director", "Popular Artist");
	        Media dvd = new DigitalVideoDisc("Tenet", "Action", "Christopher Nolan", 150, 24.99f);
	        mediae.add(book);
	        mediae.add(cd);
	        mediae.add(dvd);
	        //System.out.println(book.toString());
	        //System.out.println(cd.toString());
	        //System.out.println(dvd.toString());
	        // Iterate through the list and print details
	        for (Media m : mediae) {
	            System.out.println(m.toString());
	        }
	}
}

