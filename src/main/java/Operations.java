public class Operations {
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
