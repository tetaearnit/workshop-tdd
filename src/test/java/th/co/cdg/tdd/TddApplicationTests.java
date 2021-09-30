package th.co.cdg.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TddApplicationTests {

	@Test
	@DisplayName("เรากำลังทดสอบ JUnit 5")
	public void case1() {
		// Arrange = Given
		Hello hello = new Hello();
		// Act = When
		String result = hello.say("Arnit");
		// Assert = Then
		assertEquals("Hello Arnit", result);
	}

}
