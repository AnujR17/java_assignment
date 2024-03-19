package assignment1java;

/*
 19.Create class box and box3d. box3d is extended class of box. 
 The above two classes going to pull fill following requirement Include constructor. 
 set value of length, breadth, height Find out area and volume. 
 Note: Base class and sub classes have respective methods and instance variables.
 */

class Box{
	private double length, breadth, height;
	public Box(double length, double breadth, double height) {
		this.length = length;
  		this.breadth = breadth;
  		this.height = height;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		 return length;
	}
	public double getBreadth() {
		    return breadth;
	}
	public double getHeight() {
		    return height;
	}
	public double getVolume() {
		    return length * breadth * height;
	}
}
	

class Box3d extends Box {
	public Box3d(double length, double breadth, double height) {
		super(length, breadth, height);
	}
}

public class boxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3d b3 = new Box3d(2, 3, 4);
		  System.out.println("Volume of the box: " + b3.getVolume());
	}

}
