package assignment1java;

class Point{
	  private int x;
	  private int y;
	  public Point() {
	    x = 0;
	    y = 0;
	  }
	  public Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	  }
	  public void setX(int x) {
	    this.x = x;
	  }
	  public void setY(int y) {
	    this.y = y;
	  }
	  public void setXY(int x, int y) {
	    this.x = x;
	    this.y = y;
	  }
	  public String toString() {
	    return "Point(" + x + ", " + y + ")";
	  }

	}

public class CheckPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point();
	    System.out.println(p1);
	    p1.setXY(3, 4);
	    System.out.println(p1);

	}

}
