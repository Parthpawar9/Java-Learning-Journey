import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter operator among +,-,*,/,% : ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        switch(operator) {
            case '+' : System.out.println("Addition of given numbers is: " + (num1 + num2) );
                        break;
            case '-' : System.out.println("Subtraction of given numbers is: " + (num1 - num2) );
                        break;
            case '*' : System.out.println("Multiplication of given numbers is: " + (num1 * num2) );
                        break;
            case '/' : System.out.println("Division of given numbers is: " + (num1 / num2) );
                        break;
            case '%' : System.out.println("Modulo of given numbers is: " + (num1 % num2) );
                        break; 
            default : System.out.println("padhe path kar lawdya");
                       
        }
       


    }
    
}
