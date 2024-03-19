package assignment1java;

class base {
	  void debuggingInfo(){
	    System.out.println("Debug information");
	    
	  }
	  void debuggingPrint(String message) {
	    System.out.println("[DEBUG] " + message);
	  }
	}
	class derived extends base {
	    private String name;

	    public derived(String name) {
	        this.name = name;
	    }

	    public void doSomething() {
	        debuggingInfo();
	        debuggingPrint("Checking in " + name);
	    }
	}

public class Debuggerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 derived  m1 = new derived("Derived");
		 m1.doSomething();

	}

}
