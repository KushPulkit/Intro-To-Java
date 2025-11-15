import java.io.*;

public class StudentFile {
    public static void main(String[] args) {
        String fileName = "students.txt";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

            
            bw.write("SerialNo\tFirstName\tCGPA\tGrade");
            bw.newLine();
            bw.write("1\t\tPulkit\t\t8.7\tA");
            bw.newLine();
            bw.write("2\t\tRishika\t\t9.1\tA+");
            bw.newLine();
            bw.write("3\t\tBhavya\t\t9.0\tB");
            bw.newLine();

            bw.close();
            System.out.println("Data written successfully to " + fileName);

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("\nFile Contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
