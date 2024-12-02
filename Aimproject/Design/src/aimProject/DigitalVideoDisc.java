package aimProject;
public class DigitalVideoDisc extends Media implements Playable {
    private String director;
    private int length;
    
    // Constructor to create a DVD object by title
    public DigitalVideoDisc(String title) {
        super(title, null, 0); // Call Media constructor
    }

    // Constructor to create a DVD object by category, title, and cost
    public DigitalVideoDisc(String category, String title, float cost) {
        super(title, category, cost); // Call Media constructor
    }
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super( title, category, cost); // Call Media constructor
        this.director = director;
    }
    
    DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost); // Call Media constructor
        this.director = director;
        this.length = length;
    }
    // Getters and setters for the fields (optional, if you need to access or modify the fields)
  

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    
    public String toString() {
        return "DigitalVideoDisc{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", director='" + director + '\'' +
                ", length=" + length +
                ", cost=" + getCost() +
                '}';
    }
}
/*
public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    // Constructor to create a DVD object by title
    public DigitalVideoDisc(String _title5791) {
        super(++nbDigitalVideoDiscs, _title5791, null, null, 0, 0f); // Use superclass constructor
    }

    // Constructor to create a DVD object by category, title, and cost
    public DigitalVideoDisc(String _category5791, String _title5791, float _cost5791) {
        super(++nbDigitalVideoDiscs, _title5791, _category5791, null, 0, _cost5791f); // Use superclass constructor
    }

    // Constructor to create a DVD object by director, category, title, and cost
    public DigitalVideoDisc(String _director5791, String _category5791, String _title5791, float _cost5791) {
        super(++nbDigitalVideoDiscs, _title5791, _category5791, _director5791, 0, _cost5791); // Use superclass constructor
    }

    // Constructor to create a DVD object by all attributes: title, category, director, length, and cost
    public DigitalVideoDisc(String _title5791, String _category5791, String _director5791, int _length5791, float _cost5791) {
        super(++nbDigitalVideoDiscs, _title5791, _category5791, _director5791, _length5791, _cost5791); // Use superclass constructor
    }

    // Implementing the play() method from Playable interface
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength() + " minutes");
    }

    // toString method for debugging and display
    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", director='" + getDirector() + '\'' +
                ", length=" + getLength() +
                ", cost=" + getCost() +
                '}';
    }
}
*/
