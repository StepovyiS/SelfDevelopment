import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void FivePlusTwoEqualsSeven(){
        Calculator calculator = new Calculator();
        assertEquals(7, Calculator.plusOperation(5,2));
    }
    @Test
    void eightMinusTwoEqualsSix(){
        Calculator calculator = new Calculator();
        assertEquals(6, Calculator.minusOperation(8,2));
    }
    @Test
    void fourMultipleTwoEqualsEight(){
        Calculator calculator = new Calculator();
        assertEquals(8, Calculator.multiplyOperation(4,2));
    }
    @Test
    void TenDivideTwoEqualsFive(){
        Calculator calculator = new Calculator();
        assertEquals(5, Calculator.divisionOperation(10,2));
    }

}