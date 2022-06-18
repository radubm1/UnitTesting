import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UTest {
	Calculator c;
	@BeforeEach
	void setUp() throws Exception {
		c = new Calculator(2,3);
	}

	@SuppressWarnings("deprecation")
	@Test
	void testSum() {
		Assert.assertEquals(5.0, c.sum(),0.0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void testDif() {
		Assert.assertEquals(-1.0, c.dif(),0.0);
	}

}
