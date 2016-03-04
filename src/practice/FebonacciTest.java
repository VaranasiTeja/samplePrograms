package practice;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

public class FebonacciTest {

	Febonacci febnaccci = new Febonacci();

	@Test
	public void testNthFibonacciNumber() {
		Assert.assertEquals(BigInteger.valueOf(4181), febnaccci.findNthFebonacci(20));
		Assert.assertEquals(BigInteger.valueOf(3), febnaccci.findNthFebonacci(5));
		Assert.assertEquals(BigInteger.valueOf(377), febnaccci.findNthFebonacci(15));
	}

}
