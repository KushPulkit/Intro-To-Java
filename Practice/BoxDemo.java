import java.util.Scanner;

class Box {
    double length;
    double breadth;
    double height;

    Scanner sc = new Scanner(System.in);

    Box() {
        length = 1;
        breadth = 1;
        height = 1;
        System.out.println("Non-parameterized constructor called: Default dimensions set (1,1,1)");
    }

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        System.out.println("Parameterized constructor called: Dimensions set (" + length + ", " + breadth + ", " + height + ")");
    }

    void setDim() {
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();    
    }

    void volume() {
        double v = length * breadth * height;
        System.out.println("Volume of Box: " + v);
    }
}

class BoxDemo {
    public static void main(String args[]) {
        Box b1 = new Box();
        b1.volume();

        Box b2 = new Box(5, 3, 2);
        b2.volume();

        Box b3 = new Box(); 
        b3.setDim();
        b3.volume();
    }
}