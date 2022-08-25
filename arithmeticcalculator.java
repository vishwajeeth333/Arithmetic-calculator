import java.util.Scanner;

class Calculator {
	double n1, n2;
	Calculator(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	double add() {
		return n1 + n2;
	}
	double sub() {
		return n1 - n2;
	}
	double mul() {
		return n1 * n2;
	}
	double div() {
		return n1 / n2;
	}
}
public class arithmeticcalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter n1");
	    double n1 = input.nextDouble();

	    System.out.println("Enter n2");
		double n2 = input.nextDouble();
		    
		System.out.println("Choose an operator (+, -, *, /)");
		String op = input.next();
		
		double result = 0.0;
		Calculator obj = new Calculator(n1,n2);
	    switch (op) {
	      case "+": result = obj.add(); break;
	      
	      case "-": result = obj.sub(); break;

	      case "*": result = obj.mul(); break;

	      case "/": result = obj.div(); break;

	      default: System.out.println("Invalid operator!"); break;
	    }
	    System.out.println(n1 + op + n2 + "=" + result);
	    input.close();
	}
}