package calc;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class calTest {

	@Test
	public void testSum() {
Calculator calculator = new Calculator();
		
		int result = calculator.sum(2, 2);
		
		if (result != 4) {   
			Assert.fail();
	}

	}
}
