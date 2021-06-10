import java.util.Scanner;
public class Ques1{
  public static void main (String[] args)
    {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter a positive integer");
        int n =in.nextInt();
        System.out.println( "the number of elements such hat no element appears in its original position " +total(n));                     
    }
    
    
    static int total(int num)
    {
        if (num == 1) 
        	return 0;
        else if (num == 2) 
        	return 1;
        else
            return (num - 1) * (total(num- 1) +  total(num - 2));
                         
    }
    }
    
    
