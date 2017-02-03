import java.util.Scanner;

public class arrayPractice {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int tim[]= new int[3];
	
	
	
	for (int i=0;i<2;i++)
	
		{
			System.out.println("Please enter number " +(i+1));
			tim[i] =input.nextInt();
		}
	
/*System.out.println("Please enter a second number:");
	
	int y =input.nextInt();
	
System.out.println("Please enter a third number:");
	
	int z =input.nextInt();
System.out.println("Please enter a fourth number:");
	
	int a =input.nextInt();
System.out.println("Please enter a fifth number:");
	
	int b =input.nextInt();
	*/
int s=0;

for (int i=0;i<2;i++)
	s=s + tim[i];
System.out.println("The product of the numbers you entered is: ");
System.out.println(s);
	
	

}
}