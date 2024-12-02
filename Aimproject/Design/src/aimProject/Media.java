package aimProject;
import java.util.Objects;
import java.util.Comparator;

public abstract class Media {
    // Common fields for both Book and DigitalVideoDisc
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbmedia=0 ;
    // Constructor
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public Media(String title, String category, float cost) {
        this.id = ++nbmedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category5791) {
        this.category = category5791;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost5791) {
        this.cost = cost5791;
    }
    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
    public boolean equals(Object obj) {
        // Check if the object is null or not an instance of Media
        if (obj == null || !(obj instanceof Media)) {
            return false;
        }

        // Cast the object to Media
        Media other = (Media) obj;

        // Compare the title attributes
        return Objects.equals(this.title, other.title);
    }

    @Override
    public int hashCode() {
        // Generate hash code based on title
        return Objects.hash(title);
    }
}
/*
public abstract class Media {

	private int id;
    private String title;
    private String category;
    private float cost;
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    

}*/
