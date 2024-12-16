//package aimProject;
package aim;

public class Disc extends Media {
    private int length;
    private String director;
    
    public Disc( String title5791, String category5791, String director5791, int length5791, float cost5791) {
        super( title5791, category5791, cost5791); // Call Media's constructor
        this.length = length5791;
        this.director = director5791;
    }

    // Getters
    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
    public void setLength(int length5791) {
        this.length = length5791;
    }
    public void setDirector(String director5791) {
        this.director = director5791;
    }
    public String toString() {
        return super.toString() + ", director='" + director + "', length=" + length;
    }
}

