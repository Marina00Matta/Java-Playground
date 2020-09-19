
class Calc 

{ public static void main (String [] args)
  
  { float x = Float.parseFloat(args[0]);
    String op = args [1];
    float y = Float.parseFloat(args[2]);
    float z;
 
if(args.length==3)
  
  {
   switch(op)
    
    { case "+" : z = x + y;
        break;
  
      case "-" : z = x - y;
        break;

      case "*" : z = x * y;
        break;

      case "/" : z = x / y;
        break;

      default: System.out.printf("Enter one of those operators (+,-,*,/) please..");
        return;
    }
    
    System.out.println (x + " " + op + " " + y + "=" + z);
    
    }


else
    { 
         System.out.println("in valid calculator equation");
    }
 
}
}
