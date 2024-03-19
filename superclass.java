package assignment1java;


class goals{
	int g;
	goals(int g){
		this.g=g;
		System.out.println("Goals scored this season: " +this.g);
	}
}

class assists extends goals{
	int a;
		assists(int g, int a) {
			super(g);
			this.a=a;
			System.out.println("Assists this season: " +this.a);
		}
}

public class superclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assists f= new assists(77,15);
		}

}
