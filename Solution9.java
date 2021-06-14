
public class Ques9 {

	public static void main(String[] args) {
		long n=100;
		long factorial=1;
		for(long i=n;i>=1;i--) {
			factorial=factorial*i;
		}
		long integer=factorial;
		System.out.println("The factorial is");
		System.out.println(integer);
		System.out.println("And its addition is");
		long addition=getSum(integer);
		System.out.println(addition);
		    }
	 static long getSum(long n)
	    {
	        long sum = 0;
	 
	        while (n != 0) {
	            sum = sum + n % 10;
	            n = n / 10;
	        }
	 
	        return sum;
	    }
	 
		 
	}


