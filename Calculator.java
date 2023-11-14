//Author:Ramesh
public class Calculator {
    private int result;

    public Calculator() {
        result = 2;
    }

    // add
    public void add(int number) {
        result += number;
    }

    // subtract
    public void subtraction(int number) {
        result -= number;
    }

    // multiply
    public void multiplication(int number1, int number2) {
        result = number1 * number2;
    }

    // divide
    public void division(int number1, int number2) {
        result = number1 / number2;
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        // declare 2 numbers
        int num1 = 15, num2 = 10;

      System.out.println("The name of the author is:" + " Ramesh");

        // instantiate an object calculator
        Calculator cal = new Calculator();

        // add num1 and num2
        cal.add(num1+num2);
        System.out.println("The result of the calculator addition is:" + cal.getResult());

        // subtract num2
        cal.subtraction(num2-num1);
        System.out.println("The result of the calculator subtraction is:" + cal.getResult());

        // multiply num1 and num2
        cal.multiplication(num1, num2);
        System.out.println("The result of the calculator multiplication is: " + cal.getResult());

        // division of num1 and num2
        cal.division(num1, num2);
        System.out.println("The result of the calculator division is: " + cal.getResult());
    }
}
