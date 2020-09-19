import java.util.StringTokenizer;
    
     public class Substring
    {
     public static void main (String [] args)
    { String ip = "155.155.155.155";
      String Str = ip;
      
      for(int i=0; i<3;i++)
       {  Str = ip.substring(0,ip.indexOf("."));
          System.out.println(Str);
          ip = ip.substring(ip.indexOf(".") + 1);
       }
    
     System.out.println(ip);   
  }
  }
