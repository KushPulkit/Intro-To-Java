import java.io.File;

public class ChangeFilePermissions {
    public static void main(String[] args) {

        File file = new File("test.txt");

        if (file.exists()) {
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(false);

            System.out.println("File permissions changed successfully!");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
