package aimProject;

import java.util.ArrayList;


public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    // Constructor
    public CompactDisc( String title5791, String category5791, float cost5791, int length5791, String director5791, String artist5791) {
        super( title5791, category5791,director5791, length5791,cost5791); // Call Disc constructor
        this.artist = artist5791;
    }

    // Getter for `artist`
    public String getArtist() {
        return artist;
    }

    // Add a track to the list
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists in the CD.");
        } else {
            tracks.add(track);
        }
    }

    // Remove a track from the list
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track not found in the CD.");
        }
    }

    // Calculate the total length of all tracks
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public String toString() {
        return super.toString() + ", artist='" + artist + "', tracks=" + tracks + ", totalLength=" + getLength();
    }
    
    public void play() {
        System.out.println("Playing CompactDisc: " + this.getTitle());
        System.out.println("Artist: " + this.getArtist());
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play(); // Calls play() for each track
        }
    }
}
/*public class CompactDisc extends Disc{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
    // Constructor
    public CompactDisc(String title, String category, float cost, String artist, String director) {
        super(title, category, cost, 0, director);
        this.artist = artist;
    }
    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Add a track
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track is already in the list: " + track.getTitle());
        } else {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        }
    }

    // Remove a track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("The track does not exist in the list: " + track.getTitle());
        }
    }

    // Get total length of the CD
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "artist='" + artist + '\'' +
                ", total length=" + getLength() +
                ", tracks=" + tracks +
                '}';
    }
}
*/