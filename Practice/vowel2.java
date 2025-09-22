import java.util.*;
class test{
	public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   char ch=sc.next().toLower().charAt(0);
   switch(ch){
   case 'a' || 'e' || 'i' || 'o' || 'u':
    System.out.println("Vowel");
    break;
   case ch>'a' && ch<='z':
   	System.out.println("Consonant");
   	break;
   default:
   	System.out.println("Other Symbol");
    }
	}
}