package BT.BT3;

import BT.BT1.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTest {
    private Divide divide;

    @Before
    public void setUp() throws Exception {
        System.out.println("Set up test");
        divide = new Divide();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Testing done");
    }

    @Test
    public void divide() {
        double a = 5.2;
        double b = 2.0;
        Assert.assertTrue(divide.divide(a, b) == 2.6 );
    }
}