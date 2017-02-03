import java.util.Scanner;
public class Dogs {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	cats catsObject = new cats();
	System.out.println("enter name of first Gf here: ");
	String temp = input.nextLine();
	catsObject.setName(temp);
	catsObject.saying();
}
}