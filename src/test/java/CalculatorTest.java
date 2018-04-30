import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator testCal;

    @Before
    public void before() {
        testCal = new Calculator(10, 2);
    }

    @Test
    public void hasNum1() {
        assertEquals(10, testCal.getNum1());
    }

    @Test
    public void hasNum2() {
        assertEquals(2, testCal.getNum2());
    }

    @Test
    public void addSum() {
        assertEquals(12, testCal.add());
    }

    @Test
    public void subtractSum() {
        assertEquals(8, testCal.subtract());
    }

    @Test
    public void multiplySum() {
        assertEquals(20, testCal.multiply());
    }

    @Test
    public void divideSum() {
        assertEquals(5, testCal.divide());
    }

}
