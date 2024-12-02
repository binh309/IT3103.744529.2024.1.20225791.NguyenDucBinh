package aimProject;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        // Compare by cost first
        int costComparison = Float.compare(media2.getCost(), media1.getCost());
        
        // If costs are equal, compare by title
        if (costComparison == 0) {
            return media1.getTitle().compareTo(media2.getTitle());
        }
        
        return costComparison;
    }
}
