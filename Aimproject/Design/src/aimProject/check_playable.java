package aimProject;

public class check_playable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DigitalVideoDisc dvd = new DigitalVideoDisc( "The Lion King", "Animation","Roger Allers", 120, 19.99f);
	        dvd.play();
	        
	        System.out.println("----------------------------");

	        // Test Track
	        Track track1 = new Track("Song 1", 200);
	        Track track2 = new Track("Song 2", 180);
	        track1.play();
	        track2.play();

	        System.out.println("----------------------------");

	        // Test CompactDisc
	        CompactDisc cd = new CompactDisc( "Greatest Hits", "Pop", 15.99f, 0, "Various Artists", "Various");
	        cd.addTrack(track1);
	        cd.addTrack(track2);
	        cd.play();

	        System.out.println("----------------------------");

	        // Test edge cases
	        System.out.println("Testing duplicate tracks:");
	        cd.addTrack(track1); // Should not add the duplicate
	        cd.removeTrack(new Track("Nonexistent Track", 150)); // Should print "Track does not exist in the CD."
	    }
	}

