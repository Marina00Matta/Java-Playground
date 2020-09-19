import java.util.StringTokenizer;
    
     public class Split
  {
         public static void main (String [] args)
       {  
        String str = args[0];
        String[] arrOfStr = str.split("\\."); 
         
         
         for (String s: arrOfStr)
         {
             System.out.println(s);
         }

       }
   
   }
