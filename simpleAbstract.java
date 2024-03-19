package assignment1java;

abstract class tactics{
	abstract void setPeices();
	
	void penaltiesList() {
		for (int i = 1; i<=5; i++) {
			System.out.println("Player " +i+ " will take " +i+ " penalty.");
		}
	}
}

class Barcelona extends tactics {
	void setPeices() {
		System.out.println("Roberto running behind the line, with an indirect free kick.");
	}
	
}

public class simpleAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barcelona l10 = new Barcelona();
		l10.penaltiesList();
		l10.setPeices();
	}

}
