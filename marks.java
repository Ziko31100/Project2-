package PrepareView;
/*
We have to calculate the average of marks obtained in three subjects by
        student A and by student B. Create class 'Marks' with an abstract method
        'getPercentage' that will return the average percentage of marks. Provide
        implementation of abstract methods in classes 'A' and 'B'. The constructor of
        student A takes the marks in three subjects as its parameters and the marks
        in four subjects as its parameters for student B. Test your code

 */
 abstract class marks {

           public abstract  double getPercentage();

}
 class A extends marks {
     double math;
     double history;
     double biology;

     A(double math, double history,double biology) {
         this.math = math;
         this.history = history;
         this.biology=biology;
     }
     public  double getPercentage(){
         double total=((math+history+biology)/3*(0.1));
         return total;
     }

 }

 class B extends marks{
     double math;
     double history;
     double biology;
     double s1;
     B(double math,double history,double biology,double s1){
         this.math=math;
         this.history=history;
         this.biology=biology;
         this.s1=s1;
     }
     public double getPercentage(){
         double total=(math+history+biology+s1)/4*(0.1);
         return total;
     }
 }

 class testMarks{
     public static void main(String[] args) {
         marks m=new A(80,70,90);
         System.out.println(m.getPercentage());

         marks m1=new B(70,60,84,55);
         System.out.println(m1.getPercentage());
     }

 }