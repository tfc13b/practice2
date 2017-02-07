import java.util.Scanner;
public class multiArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= new int[5][5];
		
		//System.out.println("Please enter the numbers for the first row of your matrix");
		for(int r=0;r<5;r++)
		{
			System.out.println("enter the row "+(r+1));
			for(int c=0;c<5;c++)
				b[r][c]= input.nextInt();
		}
		for(int r=0;r<5;r++)
		{
			System.out.println();
			for(int c=0;c<5;c++)
				System.out.print(b[r][c]+" ");
		}
	}

}
