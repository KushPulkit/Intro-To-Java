import java.util.*;
class test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double min=sc.nextDouble();
		double year=0,month=0,day=0,hour=0;
		if(min>525960){
        year=min%525960;
		}
		if(min>43800){
        month=min%43800;
		}
		if(min>1440){
		day=min%1440;
		}
		if(min>60){
        hour=min%60;
		}
		System.out.println(year+" Years "+month+" months "+day+" days "+hour+" hours and "+min+" minutes");
		System.out.println("Pulkit Kush, 24csu166");
	}
}