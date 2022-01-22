import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator extends Operations {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String userInput = "";
            while (!"q".equals(userInput)) {
                try {
                    System.out.println("Please enter the first numbers:");
                    float firstNumber = scanner.nextFloat();
                    System.out.println("Please enter the operation :");
                    String operator = scanner.next();
                    System.out.println("Please enter the second numbers:");
                    float secondNumber = scanner.nextFloat();
                    userInput = scanner.nextLine();
                    double result;
                    switch (operator) {
                        case "+":
                            result = plusOperation(firstNumber, secondNumber);
                            break;
                        case "-":
                            result = minusOperation(firstNumber, secondNumber);
                            break;
                        case "*":
                            result = multiplyOperation(firstNumber, secondNumber);
                            break;
                        case "/":
                            if (secondNumber == 0) {
                                continue;
                            }
                            result = divisionOperation(firstNumber, secondNumber);
                            break;
                        case "!":
                            result = factorial(firstNumber);
                            break;
                        default:
                            result = 0;
                            break;
                    }

                    System.out.println( "This is the result of action " + result );
                    break;

                } catch (InputMismatchException ex) {
                    System.out.println("Something went wrong ");
                    break;
                }
            }
        }
}
