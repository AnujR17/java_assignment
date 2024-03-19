package assignment1java;


class font{
	String name;
	String style;
	int size;

	  font(String name, String style, int size) {
	    this.name = name;
	    this.style = style;
	    this.size = size;
	  }
	  void display() {
	    System.out.println("Name: " +name);
	    System.out.println("Style: " +style);
	    System.out.println("Size: " +size);
	  }
	
}

public class CheckFonts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		font f = new font("TimesRoman", "Bold and Italic", 12);
	    f.display();
	}

}
