class Stars
{
  public static void main (String[] args)
  {   
     
    int lines=6;
    int spaces=(lines*6)-2;
    for(int i=1;i<=lines;i++)
    {
      //left side 
      for(int l=1;l<=i;l++)
      {   
        System.out.print("*");
         
         
      }
      // space
       for(int s=0;s<=spaces;s++)
      {   
        System.out.print(" ");
         
         
      }
       // right side
       for(int r=1;r<=i;r++)
      {   
        System.out.print("*");
        
         
      }
      // left side to complete pyramid shape
      for(int x=2;x<=i;x++)
      {   
        System.out.print("*");
         
         
      }
      spaces=spaces-2;  
      System.out.println();
     
    }
    	
    
    
   

  }







}
