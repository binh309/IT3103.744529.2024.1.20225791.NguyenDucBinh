package aimProject;

public class TestCompactDisc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CompactDisc cd = new CompactDisc("Greatest Hits", "Pop", 15.99f, 0, "Famous Director", "Popular Artist");

	        // Create and add tracks
	        Track track1 = new Track("Song One", 300);
	        Track track2 = new Track("Song Two", 200);
	        Track track3 = new Track("Song One", 300); // Duplicate track

	        cd.addTrack(track1);
	        cd.addTrack(track2);
	        cd.addTrack(track3); // Should not add duplicate

	        // Remove a track
	        cd.removeTrack(track2);

	        // Print the CD information
	        System.out.println(cd);
	}

}
