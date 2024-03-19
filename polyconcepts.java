package assignment1java;

class shape{
	void draw() {
		System.out.println("Draw a shape.");
	}
	void erase() {
		System.out.println("Erase the create shape.");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("Draw a circle of desired radius.");
	}
	void erase() {
		System.out.println("Delete the exsisting circle.");
	}
}

class square extends shape{
	void draw() {
		System.out.println("Draw a square of desired length.");
	}
	void erase() {
		System.out.println("Delete the exsisting square.");
	}
}

class triangle extends shape {
	void draw() {
		System.out.println("Draw a triangle of desired height and base.");
	}
	void erase() {
		System.out.println("Delete the exsisting triangle.");
	}
}

public class polyconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape s=new circle();
		s.draw();
		
		shape t = new triangle();
		t.erase();
	}

}
