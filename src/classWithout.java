
public class classWithout {
	public void simpleMessage(){
		System.out.println("Please enter a number you wish to factorialize:");
	}
	
	public void fact(int number){
		int result = 1;
		for (int i = 1; i <= number; i++) {
			   result = result * i;
			}
		System.out.println("Your answer will be: " + result);
	}
		public void fact(int number, int n){
			int result = 1;
			for (int i = 1; i <= number; i++) {
				   result = result * i;
				}
		System.out.println("Your second answer will be: " + result);
}
}
