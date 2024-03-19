package assignment1java;

public class thisclass {

	float a;
	float func(float a) {
		this.a= (3.14f)*a*a;
		return this.a;
	}
	
	public static void main(String[] args) {
		thisclass tc=new thisclass();
		System.out.println(tc.func(7f));
	}
}
