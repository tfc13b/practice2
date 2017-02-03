import java.util.Scanner;
public class arrayPractice4 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the length of your array: ");
	int n = input.nextInt();
	
	int[] a = new int[n];
	int[] b = new int[n];
	int[] c = new int[a.length];
	
	
	System.out.println("Please enter numbers for the first array: ");
	for (int i=0;i<n;i++)
		
	{
		
		a[i] =input.nextInt();
	}
	
	System.out.println("Please enter numbers for the second array: ");
	for (int i=0;i<n;i++)
		
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