package assignment1java;

public class callByReference {
	
	int a = 3 ;
	int reference(callByReference cr) {
		cr.a = --a + a++ - ++a;
		return cr.a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callByReference cr= new callByReference();
		System.out.println("Before decrement value "+cr.a);
		cr.reference(cr);
		System.out.println("After decrement value: "+cr.a);
			
	}

}
