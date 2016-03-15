package practice;

import org.junit.Assert;
import org.junit.Test;

public class QuadraticEquationRootsTest {

	QuadraticEquation qeRoots = new QuadraticEquation();

	@Test
	public void testRootsOfQuadEqnPositiveCases() {
		double[] actualResult = { -0.666666, -1.0 };
		Assert.assertArrayEquals(qeRoots.getRootsOfEquation(3, 5, 2), actualResult, 0.000001);
		actualResult[0] = 1;
		actualResult[1] = 1;
		Assert.assertArrayEquals(qeRoots.getRootsOfEquation(3, -6, 3), actualResult, 0);
		actualResult[0] = 2;
		actualResult[1] = 0;
		Assert.assertArrayEquals(qeRoots.getRootsOfEquation(3, -6, 0), actualResult, 0);
	}

	@Test(expected = RuntimeException.class)
	public void testRootsOfQuadEqnNegativeCases() {
		qeRoots.getRootsOfEquation(1, 2, 5);
	}

}
