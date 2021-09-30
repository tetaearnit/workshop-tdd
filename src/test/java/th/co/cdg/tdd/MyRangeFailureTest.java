package th.co.cdg.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeFailureTest {

    @Test
    @DisplayName("ขึ้นต้นด้วย [, ( เท่านั้น input = 1,5]")
    public void case1() {
        try {
            MyRange range = new MyRange("1,5]");
            range.validate();
            fail("ไม่ผิด");
        } catch (InputInvalidException e) {
            // pass
            if (!"Input error".equals(e.getMessage())) {
                fail("Error message ผิด " + e.getMessage());
            }
        }
    }

    @Test
    @DisplayName("ขึ้นต้นด้วย [, ( เท่านั้น input = 1,5] with junit 5")
    public void case2() {
        MyRange range = new MyRange("1,5]");
        Exception e = assertThrows(InputInvalidException.class, range::validate);
        assertEquals("Input error", e.getMessage());
    }
}
