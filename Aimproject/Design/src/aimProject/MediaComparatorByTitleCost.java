package aimProject;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        // Compare by title first
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());
        
        // If titles are equal, compare by cost
        if (titleComparison == 0) {
            return Float.compare(media1.getCost(), media2.getCost());
        }
        
        return titleComparison;
    }
}
