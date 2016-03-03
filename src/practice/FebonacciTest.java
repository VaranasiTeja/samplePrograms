package practice;

import org.junit.Assert;
import org.junit.Test;

public class FebonacciTest {

	Febonacci febnaccci = new Febonacci();

	@Test
	public void testNthFibonacciNumber() {
		Assert.assertEquals(3, febnaccci.findNthFebonacci(5));
		Assert.assertEquals(-1, febnaccci.findNthFebonacci(0));
		Assert.assertEquals(-1, febnaccci.findNthFebonacci(-50));
		Assert.assertEquals(4181, febnaccci.findNthFebonacci(20));
		long startingTime = System.currentTimeMillis();
		febnaccci.findNthFebonacci(1000000000);
		long endingTime = System.currentTimeMillis();
		System.out.println((endingTime - startingTime) + "--->time");
		// System.out.println(febnaccci.findNthFebonacci(20));
		// System.out.println(febnaccci.findNthFebonacci(0));
	}

}
