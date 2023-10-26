package BT.BT2;

import BT.BT1.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyTest {
    private Multiply multiply;

    @Before
    public void setUp() throws Exception {
        System.out.println("Set up test");
        multiply = new Multiply();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Testing done");
    }

    @Test
    public void multiply() {
        double a = 3.0;
        double b = 1.5;
        Assert.assertEquals(4.5, multiply.multiply(a,b), 0);
    }
}