package th.co.cdg.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
