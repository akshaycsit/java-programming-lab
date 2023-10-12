/*public class Automobile
{
	public void start() {
		System.out.println("Engine starts running");
	}
	public void stop(){
	    	System.out.println("Engine stops running");
	    	
	}
	public void seatings(){
}
class Car extends Automobile{
    public void No_Of_tyres()
    {
        	System.out.println("There are 4 tyres");
    }
    public void fuel()
    {
        	System.out.println("petrol");
    }
    public void fuel(String fuel){
        	System.out.println("Also runs on diesel");
        	}
        	public void seatings(){
        	    	System.out.println("4 seatings");
        	    	
        	}
}
class Bike extends Automobile{
    public void No_of_tyres()
    {
        	System.out.println("There are 2 tyres");
    }
    public void fuel(){
        	System.out.println("PETROL");
    }
    public void seatings()
    {
        	System.out.println("2 seatings");
    }
}
}

public interface Solution {
    public void Hello();
    public void Welcome();
}

public class A implements Solution {
    public void Hello() {
        System.out.println("Hello world");
    }

    public void Welcome() {
        System.out.println("Welcome to Edureka");
    }

    public static void main(String[] args) {
        A a = new A();
        a.Hello();
        a.Welcome();
    }
}*/



interface Calculator {
    void calculate(double num1, double num2, char operator);
}

public class BasicCalculator implements Calculator {

    public void calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();

        double num1 = 10.0;
        double num2 = 5.0;
        char operator = '+';

        calculator.calculate(num1, num2, operator);
    }
}




	
