package assignment1java;

class outer{
	void display() {
		System.out.println("Hello from outer.");
	}
	class inner{
		void display() {
			System.out.println("Hello from inner.");
		}
	}

}

public class InOut {

	public static void main(String[] args) {
		
		outer ot = new outer();
		ot.display();
		outer.inner in = ot.new inner();
		in.display();
	}
}
