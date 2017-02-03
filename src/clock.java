
public class clock {

	public static void main(String[] args) {
		
		time timeObject = new time();
		System.out.println(timeObject.toMilitary());
		
		System.out.println(timeObject.toNormal());
		
		timeObject.setTime(13, 27, 6);
		System.out.println(timeObject.toMilitary());
		
		System.out.println(timeObject.toNormal());

	}

}
