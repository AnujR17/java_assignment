package assignment1java;

public class callByValue {

	int a ;
	int value(int a) {
		this.a=++a + ++a + --a;
		return this.a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callByValue cv = new callByValue();
		int aa=cv.value(3);
		System.out.println("Incremented value of a: " +aa);
		}

}
