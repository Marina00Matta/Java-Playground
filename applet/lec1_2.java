import java.util.Scanner;    
class Complex
{
 
 public static void main(String[] args)
 {
   
   System.out.println("enter real of complex1");   
   Scanner sc = new Scanner(System.in);
   int r1=sc.nextInt();
   System.out.println("enter img of complex1");    
   Scanner sc1 = new Scanner(System.in);    
   int img1=sc1.nextInt();


   System.out.println("enter real of complex2");   
   Scanner sc2 = new Scanner(System.in);
   int r2=sc2.nextInt();
   System.out.println("enter img of complex2");    
   Scanner sc3 = new Scanner(System.in);    
   int img2=sc3.nextInt();

   System.out.println("press 1 to add the two numbers and press 2 to subtract two numbers");
   Scanner sc4=new Scanner(System.in);
   int option=sc4.nextInt();
   if(option==1)
   {
     AddComplex(r1,img1,r2,img2);
   }
   else if(option==2)
   {
     SubComplex(r1,img1,r2,img2);
    
   }
   else
   {
     System.out.println("input is not valid");
   }
 }
 static void AddComplex(int a,int b,int c, int d)
 {
  int x=a+c;
  int y=b+d;
  System.out.println("the Sum of two complex numbers is equal "+x+"+"+y+"i");

 }
 static void SubComplex(int a,int b,int c, int d)
 {
  int x=a-c;
  int y=b-d;
  System.out.println("the Subtraction of two complex numbers is equal "+x+"+"+"("+y+")"+"i");

 } 


}
