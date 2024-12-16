//package aimProject;
package aim;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();
    public List<String> getAuthors() {
        return authors;
    }
    // Constructor
    public Book( String title5791, String category5791, float cost5791) {
        super(title5791, category5791, cost5791);
    }
    // Add an author to the book
    public void addAuthor(String authorName5791) {
        if (!authors.contains(authorName5791)) {
            authors.add(authorName5791);
            System.out.println("Author added: " + authorName5791);
        } else {
            System.out.println("Author already exists: " + authorName5791);
        }
    }

    // Remove an author from the book
    public void removeAuthor(String authorName5791) {
        if (authors.contains(authorName5791)) {
            authors.remove(authorName5791);
            System.out.println("Author removed: " + authorName5791);
        } else {
            System.out.println("Author not found: " + authorName5791);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", authors=" + authors;
    }
}


/*
public class Book extends Media {
    private List<String> authors = new ArrayList<>();

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            System.out.println("Author added: " + authorName);
        } else {
            System.out.println("Author already exists: " + authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author removed: " + authorName);
        } else {
            System.out.println("Author does not exist: " + authorName);
        }
    }

    @Override
    public String toString() {
        return "Book [id=" + getId() + ", title=" + getTitle() + ", category=" + getCategory() + ", cost=" + getCost()
                + ", authors=" + authors + "]";
    }
}
*/