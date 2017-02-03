
public class coffee {

	public static void main(String[] args) {
		
		
		beans beansObject = new beans();
		beans beansObject2 = new beans(1);
		beans beansObject3 = new beans(2,3);
		beans beansObject4 = new beans(4,5,6);
		
		System.out.printf("%s\n", beansObject.toMilitary());
		System.out.printf("%s\n", beansObject2.toMilitary());
		System.out.printf("%s\n", beansObject3.toMilitary());
		System.out.printf("%s\n", beansObject4.toMilitary());
		
		

	}

}
