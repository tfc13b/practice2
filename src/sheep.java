
public class sheep {
	private String yourName;
	private int yourAge;
	private String yourAddress;
	
	public void setName(String name){
		
		yourName=name;
	}
	public String getName()
	{
	return yourName;			
	}
public void saying1(){
	System.out.printf("Your name is %s ", getName() );
	
}
public void setAge(int age){
	
	yourAge=age;
}
public int getAge()
{
return yourAge;			
}
public void saying2(){

	System.out.printf("Your age is %s ", getAge() );}

public void setAddress(String address){
	
	yourAddress = address;
}
public String getAddress()
{
return yourAddress;			
}
public void saying3(){

	System.out.printf("Your address is %s ", getAddress() );}

}
