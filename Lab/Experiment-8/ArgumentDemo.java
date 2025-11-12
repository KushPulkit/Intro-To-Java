import java.util.Scanner;
import java.lang.Throwable;

class ArgumentDemo {
    void askUserInput(String msg){
    System.out.println(msg);
    Scanner sc=new Scanner(System.in);
    int ar[]=new int[5];
    for(int i=0;i<5;i++){
        ar[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<5;i++){
        sum = sum + ar[i];
    }
    System.out.println("Sum is "+sum);
    }
	public static void main(String args[]){
    ArgumentDemo ob = new ArgumentDemo();
    try{

    if(args.length!=5)
        throw new CheckArgumentException("Not equal to 5 arguments!");
    else{
    	System.out.println("5 arguments entered. Proceeding to sum...");
    } 
    int sum = 0;

    for(int i=0;i<args.length;i++){
        sum = sum + Integer.parseInt(args[i]);
    }

    System.out.println("Sum is "+sum);
    }
    catch(CheckArgumentException e){
        System.out.println(e);
        ob.askUserInput("Correctly enter 5 variables");
    }
    catch(NumberFormatException e){
        System.out.println("Only integers are accepted!");
    }
  }
}