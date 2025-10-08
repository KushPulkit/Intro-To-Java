class StudentA extends Marks{
   double m1;
   double m2;
   double m3;

   StudentA(double m1,double m2,double m3){
   this.m1=m1;
   this.m2=m2;
   this.m3=m3;
   }

   double getPercentage(){
   return ((m1+m2+m3)/300.0)*100.0;
   }
}
