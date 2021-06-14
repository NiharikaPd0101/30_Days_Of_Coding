import java.util.Scanner;
public class Ques84 
   {    
      public static void main(String args[])   
        {    
    	  Scanner sc=new Scanner(System.in);
           int i, j;
           System.out.println("Enter the number of rows");
           int row = sc.nextInt();       

              for (i=1; i<row; i++)   
                 {  
     
                     for (j=row-i; j>1; j--)   
                    {  
 
                       System.out.print(" ");   
                    }   
 
                       for (j=1; j<=i; j++ )   
                        {   
   
                           System.out.print(j+" ");   
                        }   
  
System.out.println();   
}   
}   
}  
