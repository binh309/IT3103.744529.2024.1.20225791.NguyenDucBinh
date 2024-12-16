//package aimProject;
package aim;

import java.util.Objects;
public class Track  implements Playable{
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the object is null or not an instance of Track
        if (obj == null || !(obj instanceof Track)) {
            return false;
        }

        // Cast the object to Track
        Track other = (Track) obj;

        // Compare the title and length attributes
        return Objects.equals(this.title, other.title) && this.length == other.length;
    }

    @Override
    public int hashCode() {
        // Generate hash code based on title and length
        return Objects.hash(title, length);
    }
    
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    
    @Override
    public String toString() {
        return "Track{" + "title='" + title + '\'' + ", length=" + length + '}';
    }
}

