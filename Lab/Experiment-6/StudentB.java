class StudentB extends Marks{
   double m1;
   double m2;
   double m3;
   double m4;

   StudentB(double m1,double m2,double m3,double m4){
   this.m1=m1;
   this.m2=m2;
   this.m3=m3;
   this.m4=m4;
   }

   double getPercentage(){
   return ((m1+m2+m3+m4)/400.0)*100.0;
   }
}