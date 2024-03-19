package assignment1java;

import java.lang.reflect.Array;

interface Test {
	  int square(int x);
	}

	class Arithmetic implements Test {
	  public int square(int x) {
	    return x * x;
	  }
	}


class ToTestInt {

	 ToTestInt() {
		    Arithmetic a1 = new Arithmetic();
		    System.out.println(a1.square(4));
		  }
		
	}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToTestInt t = new ToTestInt();
	}

}
