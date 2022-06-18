import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCalc {
	Calculator c;
	@BeforeEach
	void setUp() throws Exception {
		c = new Calculator(45,70);
	}

	@SuppressWarnings("deprecation")
	@Test
	void testSum() {
		Assert.assertEquals(68, c.sum());
	}
	@SuppressWarnings("deprecation")
	@Test
	void testDif() {
		Assert.assertEquals(25, c.dif());
	}

}
