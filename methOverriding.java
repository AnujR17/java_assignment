package assignment1java;

class adding{
	void toAdd(int a, int b) {
		
		int c = a + b;
		System.out.println("The addition of a " +a+ "and B " +b+ "is c " +c);
		 
	}
}

class sub extends adding{
	void toSub(int a, int b) {
		int c= a - b;
		System.out.println("The addition of " +a+ " and " +b+ " is " +c);
	}
}

public class methOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub f1= new sub();
		f1.toSub(222, 71);
		
	}

}
