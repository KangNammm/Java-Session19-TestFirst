package BT.BT5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinTest {
    @Test
    public void testFindMin() {
        // Arrange
        int[] numbers = {5, 8, 2, 10, 3};

        // Act
        int result = FindMin.findMin(numbers);

        // Assert
        Assert.assertEquals(2, result);
    }
}