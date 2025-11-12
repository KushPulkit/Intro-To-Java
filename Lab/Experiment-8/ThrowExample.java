class ThrowExample {
    public static void main(String[] args) {
        try {
            throw new Exception("Exception Found, String argument passed!");
        }
        catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed.\nPulkit Kush 24csu166");
        }
    }
}