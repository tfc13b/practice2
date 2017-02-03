import java.util.Scanner;
public class cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		sheep sheepObjects = new sheep();
		
		System.out.println("Enter your name here: ");
		String temp = input.nextLine();
		sheepObjects.setName(temp);
		
		System.out.println("Enter your Address here: ");
		String location = input.nextLine();
		sheepObjects.setAddress(location);
	
		System.out.println("Enter your age here: ");
		int old = input.nextInt();
		sheepObjects.setAge(old);
		
	
		
		
		System.out.println("Your name is "+ temp + " you are "+ old + " years old, and your address is " + location);
	
	}

}
