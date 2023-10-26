package BT.BT1;

import BT.BT1.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void setUp() throws Exception {
        System.out.println("Set up test");
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Testing done");
    }

    @Test
    public void add() {
        double a = 1.2;
        double b = 1.5;
        Assert.assertEquals(2.7,calculator.add(a,b), 0);
    }

    @Test
    public void minus(){
        double a = 6.0;
        double b = 4.0;
        Assert.assertEquals(2, calculator.minus(a,b), 0);
    }

}