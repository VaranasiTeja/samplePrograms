package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberGeneratorTest {

	PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();

	@Test
	public void testPositiveNumbersInRange() {
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		System.out.println("-------"+primeNumberGenerator.generatePrimeNumbersInRange(10, 30));

		Runnable test1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("1");
				System.out.println("TEst1 ResULT" + primeNumberGenerator.generatePrimeNumbersInRange(10, 15));
				Assert.assertTrue(false);
				Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(10, 15),
						new ArrayList<Integer>(Arrays.asList(11, 13)));
			}
		};

		Runnable test2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("2");
				System.out.println("TEst2 ResULT" + primeNumberGenerator.generatePrimeNumbersInRange(0, 15));
				Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(0, 15),
						new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13)));
			}
		};
		Runnable test3 = new Runnable() {
			@Override
			public void run() {
				System.out.println("3");
				Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(15, 15), new ArrayList<Integer>());
			}
		};

		Runnable test4 = new Runnable() {
			@Override
			public void run() {
				System.out.println("4");
				Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(0, 0), new ArrayList<Integer>());
			}
		};
		threadPool.submit(test1);
		threadPool.submit(test3);
		threadPool.submit(test4);
		threadPool.submit(test2);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadPool.shutdown();
	}

	@Test
	public void testNegativeNumbersInRange() {
		Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(10, -10),
				new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7)));
		Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(-10, 10),
				new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7)));
		Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(-15, -15), new ArrayList<Integer>());
		Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(-10, -30), new ArrayList<Integer>());
		Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(-30, -3), new ArrayList<Integer>());
	}
}
