import java.util.*;
class test {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Pulkit Kush, 24csu166");
		System.out.println("Enter Your Letter");
		char input=sc.next().charAt(0);
		//in=in.toLowerCase();
		char in=Character.toLowerCase(input);
		if(in>='a' && in<='z'){
         if(in=='a' || in=='e' || in=='i' || in=='o'  || in=='u')
			System.out.println("Vowel");
		 else
			System.out.println("Consotant");
	    }
	    else 
		System.out.println("Other Symbol, not Alphabet");
    }
}