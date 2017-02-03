
public class cream {
	public static void main(String[] args){
		
		System.out.println(average(43,56,76,8,3,4,5,6));
		
	}
	
	public static int average(int...numbers) {
		int total=0;
		
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length;
}
	}
