package practice;

import org.junit.Test;

public class PowerTest {

	Power power = new Power();

	@Test
	public void testPower() {
		long startingTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			power.findPower(2, 62);
		}
		long endingTime = System.nanoTime();
		System.out.println("normal Way milli seconds:" + (endingTime - startingTime) / 1000);
		long stime = System.nanoTime();
		for (int k = 0; k < 100000; k++) {
			power.findPowerByExponentiationRecursiveWay(2, 62);
		}
		long etime = System.nanoTime();
		System.out.println("Exponentiation by Square milli seconds recursive way:" + (etime - stime) / 1000000);
		long strtime = System.nanoTime();
		for (int k = 0; k < 100000; k++) {
			power.expo(2, 62);
		}
		long entime = System.nanoTime();
		System.out.println("Exponentiation by Square milli seconds powersof2 way:" + (entime - strtime) / 1000000);
	}

	@Test
	public void t1() {
		System.out.println(power.findPowerByExponentiationBySquare(2, 62));
		long starttime = System.nanoTime();
		for (int k = 0; k < 100000; k++) {
			power.findPowerByExponentiationBySquare(2, 62);
		}
		long endTime = System.nanoTime();
		System.out.println("Exponentiation by Square milli seconds Iterative Approach:" + (endTime - starttime) / 1000);
	}

	@Test
	public void test() {
		long startingTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			Math.pow(2, 62);
		}
		long endingTime = System.nanoTime();
		System.out.println("Math.pow seconds:" + (endingTime - startingTime) / 1000);
	}

}
