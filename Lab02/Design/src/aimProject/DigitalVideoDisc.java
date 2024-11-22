package aimProject;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost=0;
    private static int nbDigigtalVideoDiscs=0;
    private int id;
    public int getId() {
        return id;
    }
    // Constructor to create a DVD object by title
    public DigitalVideoDisc(String _title5791) {
        this.title = _title5791;
        nbDigigtalVideoDiscs++;
        this.id = nbDigigtalVideoDiscs;
    }
    
    // Constructor to create a DVD object by category, title, and cost
    public DigitalVideoDisc(String _category5791, String _title5791, float _cost5791) {
        this.category = _category5791;
        this.title = _title5791;
        this.cost = _cost5791;
        nbDigigtalVideoDiscs++;
        this.id = nbDigigtalVideoDiscs;
    }

    // Constructor to create a DVD object by director, category, title, and cost
    public DigitalVideoDisc(String _director5791, String _category5791, String _title5791, float _cost5791) {
        this.director = _director5791;
        this.category = _category5791;
        this.title = _title5791;
        this.cost = _cost5791;
        nbDigigtalVideoDiscs++;
        this.id = nbDigigtalVideoDiscs;
    }

    // Constructor to create a DVD object by all attributes: title, category, director, length, and cost
    public DigitalVideoDisc(String _title5791, String _category5791, String _director5791, int _length5791, float _cost5791) {
        this.title = _title5791;
        this.category = _category5791;
        this.director = _director5791;
        this.length = _length5791;
        this.cost = _cost5791;
        nbDigigtalVideoDiscs++;
        this.id = nbDigigtalVideoDiscs;
    }

    // Getters and setters for the fields (optional, if you need to access or modify the fields)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String toString() {
        return "DigitalVideoDisc{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", length=" + length +
                ", cost=" + cost +
                '}';
    }
}
