package th.co.cdg.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeTest {

    @Test
    @DisplayName("ตัวแรกต้องเป็น [ โดยที่ input = [1,5] result = true")
    public void case1() {
        // Arrange
        String input = "[1,5]";
        MyRange range = new MyRange(input);
        // Act
        boolean result = range.startWithInclude();
        // Assert
        assertTrue(result, "ต้อง start ด้วย [");
    }

    @Test
    @DisplayName("ตัวแรกต้องเป็น [ โดยที่ input = (1,5] result = false")
    public void case2() {
        // Arrange
        String input = "(1,5]";
        MyRange range = new MyRange(input);
        // Act
        boolean result = range.startWithInclude();
        // Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("ตัวเลขเริ่มต้นเป็น 1 input = [1,5], result = 1")
    public void case3() {
        // Arrange
        String input = "[1,5]";
        MyRange range = new MyRange(input);
        // Act
        int result = range.getStart();
        // Assert
        assertEquals(1, result);
    }

}
