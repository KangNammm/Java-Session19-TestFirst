package BT.BT4;

import org.junit.Assert;
import org.junit.Test;

import static BT.BT4.FindMax.findMax;
import static org.junit.Assert.*;

public class FindMaxTest {

    @Test
    public void testFindMax() {
        // Arrange
        int[] numbers = {5, 8, 2, 10, 3};

        // Act
        int result = findMax(numbers);

        // Assert
        Assert.assertEquals(10, result);
    }

    @Test
    public void testFindMax_EmptyArray() {
        // Arrange
        int[] numbers = {};

        // Act and Assert
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            findMax(numbers);
        });
    }

    @Test
    public void testFindMax_NullArray() {
        // Arrange
        int[] numbers = null;

        // Act and Assert
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            findMax(numbers);
        });
    }
}

