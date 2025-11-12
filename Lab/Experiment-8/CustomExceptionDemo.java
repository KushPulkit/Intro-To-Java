public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyException("Something went wrong!");
        } 
        catch (MyException e) {
            e.printMessage();
            System.out.println("Pulkit Kush,24csu166");
        }
        }
    }