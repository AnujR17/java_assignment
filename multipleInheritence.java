package assignment1java;



interface container{
	void bags();
}
interface subcontainer extends container{
	void items();
}
class derivedContainer implements container, subcontainer {
	public void bags() {
		System.out.println("The derived-containers with bags. ");
	}
	public void items() {
		System.out.println("The derived-subcontainer with items");
	}
}

public class multipleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derivedContainer dc = new derivedContainer();
		dc.items();
	}

}
