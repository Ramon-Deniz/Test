package Main;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testMethod() {		
		int result = Square.square(5);
		assertEquals(25, result);
		
		
		
		//  Test for 0^2
		int result1 = Square.square(0);
		assertEquals(0, result1);
	}
}
