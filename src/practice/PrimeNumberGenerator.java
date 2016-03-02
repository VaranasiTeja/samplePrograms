package practice;

import java.util.ArrayList;
import java.util.Random;

public class PrimeNumberGenerator {


	Random r = new Random();
	public ArrayList<Integer> generatePrimeNumbersInRange(int startingNumber, int endingNumber) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.clear();
		if (startingNumber > endingNumber) {
			int temp = startingNumber;
			startingNumber = endingNumber;
			endingNumber = temp;
		}
		startingNumber = startingNumber < 2 ? 2 : startingNumber;
		for (int i = startingNumber; i < endingNumber; i++) {
			boolean flag = true;
			double squareRoot = Math.sqrt(i);
			for (int j = 2; j <= squareRoot; j++) {
				if (i % j == 0)
					flag = false;
				try {
					Thread.sleep(r.nextInt(1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (flag) {
				try {
					Thread.sleep(r.nextInt(1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

}
