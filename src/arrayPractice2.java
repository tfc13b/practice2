
public class arrayPractice2 {

	public static void main(String[] args) {
		arrayPractice2 obj= new arrayPractice2();
		
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		
		obj.answer(a,b);
		
	}
	
    public void answer(int x[], int y[])
    {
    	int[] c = new int[x.length];
    	for (int i = 0; i< x.length; i++){
		c[i] = x[i] + y[i];
		System.out.println(c[i]);
	}
}
}