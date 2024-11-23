package garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class NoGarbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\manht\\eclipse-workspace\\garbage\\src\\garbage\\test.txt";
        byte[] inputBytes5791 = { 0 };
        long startTime5791, endTime5791;

        try {
            inputBytes5791 = Files.readAllBytes(Paths.get(filename));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        startTime5791 = System.currentTimeMillis();
        StringBuilder outpStringBuilder = new StringBuilder();
        for (byte b : inputBytes5791) {
            outpStringBuilder.append((char)b);
        }
        endTime5791 = System.currentTimeMillis();
        System.out.println(endTime5791 - startTime5791);
	}

}
