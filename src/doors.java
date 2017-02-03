
public class doors {

	public static void main(String[] args) {
			int tim[]={3,4,5,6,7};
			change(tim);
		for(int y:tim)
			System.out.println(y);
}
	public static void change(int x[]){
		for(int counter=0;counter<x.length;counter++)
			x[counter]+=5;
	}
	
}