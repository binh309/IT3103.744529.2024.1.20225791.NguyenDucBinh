package aim;

import java.util.ArrayList;

public class StoreScreen_test {
    public static void main(String[] args) {
        // Create a store instance with mock media items
        Store store = new Store();
        
        // Adding 9 mock media items to the store
        for (int i = 1; i <= 9; i++) {
        	Media cd5791 =  new CompactDisc("Greatest Hits", "Pop", 15.99f, 0, "Famous Director", "Popular Artist");
            store.addMedia(cd5791);
        }

        // Launch the StoreScreen GUI
        new StoreScreen(store);
    }
}