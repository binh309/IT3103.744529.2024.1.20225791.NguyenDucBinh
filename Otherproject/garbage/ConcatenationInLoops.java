package garbage;

import java.util.Random;

public class ConcatenationInLoops {

    public static void main(String[] args) {
        // Initialize Random object
        Random r5791 = new Random(123);

        // Measure time for string concatenation (inefficient)
        long start = System.currentTimeMillis();
        String s5791 = "";
        for (int i = 0; i < 65536; i++) {
            s5791 += r5791.nextInt(2);
        }
        System.out.println("Time taken with String concatenation: " + (System.currentTimeMillis() - start) + " ms");

        // Reset Random object
        r5791 = new Random(123);

        // Measure time for StringBuilder (efficient)
        start = System.currentTimeMillis();
        StringBuilder sb5791 = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb5791.append(r5791.nextInt(2));
        }
        String result5791 = sb5791.toString();
        System.out.println("Time taken with StringBuilder: " + (System.currentTimeMillis() - start) + " ms");
    }
}

