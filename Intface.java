package assignment1java;

interface a1{
	void meth1();
	void meth2();
}

class meth implements a1{
	public void meth1() {
		System.out.println("Hello from meth1");
	}
	public void meth2() {
		System.out.println("Hello from meth2");
	}
}

public class Intface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth m1 = new meth();
		m1.meth1();
	}

}
