import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator  {

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
    public static float plusOperation(float firsNumber, float secondNumber){

        return firsNumber + secondNumber;
    }

    public static float  minusOperation(float firsNumber, float secondNumber){

        return firsNumber - secondNumber;
    }

    public static float multiplyOperation(float firsNumber, float secondNumber){

        return firsNumber * secondNumber;
    }

    public static float divisionOperation(float firsNumber, float secondNumber){

        return firsNumber/secondNumber;
    }

    public static float factorial(float firstNumber) {
        float res = 1;
        for (int i = 1; i < firstNumber; i++) {
            res *= i;
        }
        return res;
    }
}
