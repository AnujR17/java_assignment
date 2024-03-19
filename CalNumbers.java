package assignment1java;
class Numbers{
	  private double number;
	  public Numbers(double number) {
	    this.number = number;
	  }
	  public boolean isZero() {
	    return number == 0;
	  }
	  public boolean isPositive() {
	    return number > 0;
	  }
	  public boolean isNegative() {
	    return number < 0;
	  }
	  public boolean isOdd() {
	    return number % 2 != 0;
	  }
	  public boolean isEven() {
	    return number % 2 == 0;
	  }
	  public boolean isPrime() {
	    if (number <= 1) {
	      return false;
	    }
	    for (int i = 2; i <= Math.sqrt(number); i++) {
	      if (number % i == 0) {
	        return false;
	      }
	    }
	    return true;
	  }
	  public boolean isAmstrong() {
	    int temp = (int) number;
	    int sum = 0;
	    while (temp != 0) {
	      int rem = temp % 10;
	      sum += rem * rem * rem;
	      temp /= 10;
	    }
	    return sum == number;
	  }
	  public double getFactorial() {
	    double fact = 1;
	    for (int i = 1; i <= number; i++) {
	      fact *= i;
	    }
	    return fact;
	  }
	  public double getSqrt() {
	    return Math.sqrt(number);
	  }
	  public double getSqr() {
	    return number * number;
	  }
	  public double sumDigits() {
	    int temp = (int) number;
	    int sum = 0;
	    while (temp != 0) {
	      sum += temp % 10;
	      temp /= 10;
	    }
	    return sum;
	  }
	  public double getReverse() {
	    int temp = (int) number;
	    int rev = 0;
	    while (temp != 0) {
	      rev = rev * 10 + temp % 10;
	      temp /= 10;
	    }
	    return rev;
	  }
	  public void listFactor() {
	    for (int i = 1; i <= number; i++) {
	      if (number % i == 0) {
	        System.out.println(i);
	      }
	    }
	  }
	  public void dispBinary() {
	    System.out.println(number);
	  }

	}

public class CalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers n = new Numbers(49);
	    System.out.println("Is the number zero: "+n.isZero());
	    System.out.println("Is the number positive: " +n.isPositive());
	    System.out.println("Is the number negative: "+n.isNegative());
	    System.out.println("Is the number odd: "+n.isOdd());
	    System.out.println("Is the number even: " +n.isEven());
	    System.out.println("Is it a prime number: "+n.isPrime());
	    System.out.println("Is it a armstrong number: " +n.isAmstrong());
	    System.out.println("Its factorial: " +n.getFactorial());
	    System.out.println("Its square root: " +n.getSqrt());
	    System.out.println("Square of the number: " +n.getSqr());
	    System.out.println("Sum of the digits: " +n.sumDigits());
	    System.out.println("Reverse of the numaber: " +n.getReverse());
	    n.listFactor();
	    n.dispBinary();
	}

}
