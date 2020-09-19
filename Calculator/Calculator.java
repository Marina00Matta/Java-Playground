import java.util.Scanner;
public class Calculator 

{ public static void main (String [] args)
   
   
  { int num1;
    int num2;
    int ans;
    char op;
    
    Scanner reader = new Scanner(System.in);
    System.out.print("enter two numbers: ");
    num1 = reader.nextInt();
   
       if (num1 == (int)num1)
          { System.out.print("The number you've entered \'"+num1+"\' is an intger.\n");  
        }  
        else{  
        System.out.print("The number you've entered \'"+num1+"\' is not a digit.\n");  
        }
    /*boolean check1 = Character.isDigit(num1);  
    

    if(check1){  
        System.out.print("The number you've entered \'"+num1+"\' is  a digit.\n");  
        }  
        else{  
        System.out.print("The number you've entered \'"+num1+"\' is all a digit.\n");  
        }*/  
    num2 = reader.nextInt();
    boolean check2 = Character.isDigit(num2);
        if(check2){  
        System.out.print("The number you've entered \'"+num2+"\' is  a digit.\n");  
        }  
        else{  
        System.out.print("The number you've entered  \'"+num2+"\' is all a digit.\n");  
        }    

    System.out.print("enter an operator: ");
    op = reader.next().charAt(0);
    
    switch(op)
    
    { case '+' : ans = num1 + num2;
        break;
  
      case '-' : ans = num1 - num2;
        break;

      case '*' : ans = num1 * num2;
        break;

      case '/' : ans = num1 / num2;
        break;

      default: System.out.printf("Enter one of those operators (+,-,*,/) please..");
         return;
    }
    
    System.out.print(num1 + " " + op + " " + num2 + " = " + ans );
  }
 


}
