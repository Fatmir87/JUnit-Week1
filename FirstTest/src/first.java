import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class first {

	second newClass = new second();

	@Test
	public void testingMinLong() {
		assertEquals(6, newClass.returnLowestLong(6, 9));
	}

	@Test
	public void testingMinFloat() {

		Assert.assertEquals(4.8f, newClass.returnLowestFloat(4.8f, 44.6f), 0);
	}

	@Test
	public void testingMinInt() {
		Assert.assertEquals(2, newClass.returnLowestInt(2, 55));
	}

	@Test
	public void testingMinDouble() {
		Assert.assertEquals(2.2, newClass.returnLowestDouble(2.2, 5.5), 7);
	}

	@Test
	public void testingMaxInt() {
		Assert.assertEquals(500, newClass.returnMaxInt(11, 500));
	}

	@Test
	public void testingMaxDouble() {
		Assert.assertEquals(8.8, newClass.returnMaxDouble(3.3, 8.8), 0);
	}

	@Test
	public void testingMaxLong() {
		Assert.assertEquals(50505, newClass.returnMaxLong(50505, 900));
	}

	@Test
	public void testingPow() {
		Assert.assertEquals(36, newClass.returnPow(6.0, 2.0), 0);
	}

	@Test
	public void testingPlusOneInt() {
		Assert.assertEquals(9, newClass.returnPlusOneInt(8));
	}

	@Test
	public void testingPlusOneLong() {
		Assert.assertEquals(5, newClass.returnPlusOneLong(4));
	}

	@Test
	public void testingMinOneInt() {
		Assert.assertEquals(8, newClass.returnMinOneInt(9));
	}

	@Test
	public void testingMinOneLong() {
		Assert.assertEquals(58, newClass.returnMinOneLong(59));
	}

	@Test
	public void testingSquareRootDouble() {
		Assert.assertEquals(6, newClass.returnSquareRootDouble(36.0), 0);
	}

	@Test
	public void testingCubeRootDouble() {
		Assert.assertEquals(2, newClass.returnCubeRootDouble(8.0), 0);
	}

}