import java.util.Scanner;
public class arrayPractice3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int[] a = new int[5];
	int[] b = new int[5];
	int[] c = new int[a.length];
	
	
	
	System.out.println("Please enter 5 numbers ");
	for (int i=0;i<5;i++)
		
	{
		
		a[i] =input.nextInt();
	}
	
	System.out.println("Please enter 5 more numbers ");
	for (int i=0;i<5;i++)
		
	{
		
		b[i] =input.nextInt();
	}

	System.out.println("The product of the numbers you entered is: ");
	for (int i=0;i<a.length;i++){

	c[i]= a[i]+b[i];
	
	System.out.println(c[i]);
	}

	}

}
