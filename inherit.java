package assignment1java;
class A {
	A(){
		System.out.println("Home team is A.");
	}
	void scoreboard(int score) {
		System.out.println("This is score from A: " +score);
	}
	
	
}

class B extends A {
	B(){
		System.out.println("B is away team.");
		
	}
	int op_score;
	
	void scoreboard(int score, int op_score) {
		System.out.println("The updated score including B: " +score+ "-" +op_score);
	}
}

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B up= new B();
		up.scoreboard(2);
		up.scoreboard(2, 3);
		
		
	}

}

