import java.util.*;
class test{
	void sum(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum is "+(a+b));
	}
	void evenOdd(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	void factorial(){
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=sc.nextInt();
        int fac=1;
        while(a>0){
        fac=fac*a;
        a--;
        }
        System.out.println("Factorial Is "+fac);
	}
	void revStr(){
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter your string");
       String str=sc.nextLine();
       String wrd="";
       for(int i=str.length()-1;i>=0;i--){
    	char x=str.charAt(i);
    	wrd=wrd+x;
        }
        System.out.println("Reverse is "+wrd);
	}
	void arrMax(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Now enter elements");
		for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Max in array is "+max);
	}
	void palin(){
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number");
       int a=sc.nextInt();
       int temp=a,flag=0,d=0;
       while(a!=0){
       	d=a%10;
       	flag=flag*10+d;
       	a=a/10;
       }
       if(flag==temp)
       	System.out.println("Palindrome");
       else
       	System.out.println("Not Palindrome");
	}
	void prime(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int a=sc.nextInt();
		int check=0;
		for(int i=1;i<=a;i++){
			if(a%i==0)
				check++;
		}
		if(check==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		test ob=new test();
		int ch;
		do{
		System.out.println("Enter your choice as per the menu");
		System.out.println("1. sum of two\n2. even or odd\n3. factorial\n4. reverse a string\n5. maximum in an array\n6. check palindrome \n7. check prime\n8. exit function");
		ch=sc.nextInt();
			switch(ch){
        case 1:
        	ob.sum();
        	break;
        case 2:
        	ob.evenOdd();
        	break;
        case 3:
        	ob.factorial();
        	break;
        case 4:
            ob.revStr();
        	break;
       	case 5:
       		ob.arrMax();
        	break;
        case 6:
        	ob.palin();
        	break;
        case 7:
        	ob.prime();
        	break;
        case 8:
        	System.out.println("Exiting!!!");
        	break;
        default:
            System.out.println("Invalid");	
			}
		}while(ch!=8);
	}
}