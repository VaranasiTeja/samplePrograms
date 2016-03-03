package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberGeneratorTest {

	PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();

//	@Test
//	public void testPositiveNumbersInRange() {
//		ExecutorService threadPool = Executors.newFixedThreadPool(4);
//		Runnable test1 = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("1");
//				System.out.println("TEst1 ResULT" + primeNumberGenerator.generatePrimeNumbersInRange(10, 20));
//				Assert.assertTrue(false);
//				Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(10, 15),
//						new ArrayList<Integer>(Arrays.asList(11, 13)));
//			}
//		};
//
//		Runnable test2 = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("2");
//				System.out.println("TEst2 ResULT" + primeNumberGenerator.generatePrimeNumbersInRange(0, 15));
//				Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(0, 15),
//						new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13)));
//			}
//		};
//		Runnable test3 = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("3");
//				Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(15, 15), new ArrayList<Integer>());
//			}
//		};
//
//		Runnable test4 = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("4");
//				Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(0, 0), new ArrayList<Integer>());
//			}
//		};
//		threadPool.submit(test1);
//		threadPool.submit(test3);
//		threadPool.submit(test4);
//		threadPool.submit(test2);
//
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		threadPool.shutdown();
//	}
//
//	@Test
//	public void testNegativeNumbersInRange() {
//		Assert.assertEquals(new ArrayList<Integer>(), primeNumberGenerator.generatePrimeNumbersInRange(0, 1));
//		Assert.assertEquals(new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7)),
//				primeNumberGenerator.generatePrimeNumbersInRange(10, -10));
//		Assert.assertEquals(new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7)),
//				primeNumberGenerator.generatePrimeNumbersInRange(-10, 10));
//		Assert.assertEquals(new ArrayList<Integer>(), primeNumberGenerator.generatePrimeNumbersInRange(-15, -15));
//		Assert.assertEquals(new ArrayList<Integer>(), primeNumberGenerator.generatePrimeNumbersInRange(-10, -30));
//		Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersInRange(-30, -3), new ArrayList<Integer>());
//	}
//
//	@Test
//	public void testNumbersTillEndingNumber() {
//		Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersTillEndingNumber(-10), new ArrayList<Integer>());
//		Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersTillEndingNumber(0), new ArrayList<Integer>());
//		Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersTillEndingNumber(10),
//				new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7)));
//		Assert.assertEquals(primeNumberGenerator.generatePrimeNumbersTillEndingNumber(2), new ArrayList<Integer>());
//	}

//	@Test
//	public void testSpeed() {
//		long startingTime = System.nanoTime();
//		for (int i = 0; i < 10; i++) {
//			primeNumberGenerator.generatePrimeNumbersTillEndingNumber(1000000);
//			primeNumberGenerator.generatePrimeNumbersTillEndingNumber(5673356);
//			primeNumberGenerator.generatePrimeNumbersTillEndingNumber(100);
//			primeNumberGenerator.generatePrimeNumbersTillEndingNumber(10000);
//
//		}
//		long endingTime = System.nanoTime();
//		System.out.println("normal Way :" + (endingTime - startingTime) / 1000000000);
//	}

	@Test
	public void testPrimesUsingSieves() {
//		System.out.println("####" + primeNumberGenerator.generatePrimeNumbersBySeive(25));
		Assert.assertEquals(new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23)),
				primeNumberGenerator.generatePrimeNumbersBySeive(25));
		//Assert.assertEquals(new ArrayList<Integer>(), primeNumberGenerator.generatePrimeNumbersBySeive(2));
	}

//	@Test
//	public void testSpeedSeive() {
//		long startingTime = System.nanoTime();
//		for (int i = 0; i < 10; i++) {
//			primeNumberGenerator.generatePrimeNumbersBySeive(1000000);
//			primeNumberGenerator.generatePrimeNumbersBySeive(5673356);
//			primeNumberGenerator.generatePrimeNumbersBySeive(100);
//			primeNumberGenerator.generatePrimeNumbersBySeive(10000);
//		}
//		long endingTime = System.nanoTime();
//		System.out.println("Seive Way :" + (endingTime - startingTime) / 1000000000);
//	}
}
