import java.io.*;

public class SimpleReadWrite {
    public static void main(String[] args) {
        String fileName = "test.txt";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a simple file handling example.\n");
            writer.write("We are writing and then reading from the same file.");
            writer.close();
            System.out.println("Data written to " + fileName);

            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            System.out.println("\nFile contents:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();
        } 
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
