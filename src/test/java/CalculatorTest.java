import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void twoPlusTwoEqualsFour(){
        Calculator calculator = new Calculator();
        assertEquals(4, Calculator.plusOperation(2,2));
    }
    @Test
    void fourMinusTwoEqualsTwo(){
        Calculator calculator = new Calculator();
        assertEquals(2, Calculator.minusOperation(4,2));
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