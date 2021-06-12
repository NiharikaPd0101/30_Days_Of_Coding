import java.util.Scanner;
public class Ques7 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter length of the sides of square");
	float side=sc.nextFloat();
	float pie=3.14f;
	float area=((pie/4)*side*side);
	System.out.println("The area of circle inscribed inside a square is "+area);
	}

}
