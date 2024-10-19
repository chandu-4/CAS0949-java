import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int words = 0, chars = 0, lines = 0;
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();
                String[] wordArray = line.split("\\s+");
                words += wordArray.length;
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
