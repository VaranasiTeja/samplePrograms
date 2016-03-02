package practice;

import java.util.ArrayList;

public class PrimeNumberGenerator {

	public ArrayList<Integer> generatePrimeNumbersInRange(int startingNumber, int endingNumber) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		if (startingNumber > endingNumber) {
			int temp = startingNumber;
			startingNumber = endingNumber;
			endingNumber = temp;
		}
		startingNumber = startingNumber < 2 ? 2 : startingNumber;
		if (startingNumber <= 2)
			primeNumbers.add(0, 2);
		for (int i = startingNumber; i < endingNumber; i++) {
			boolean flag = true;
			double squareRoot = Math.sqrt(i);
			if (i % 2 == 0)
				flag = false;
			for (int j = 3; j <= squareRoot; j = j + 2) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}
}
