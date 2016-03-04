package practice;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	public List<Integer> generatePrimeNumbersInRange(int startingNumber, int endingNumber) {
		List<Integer> primeNumbers = new ArrayList<Integer>();
		if (startingNumber > endingNumber) {
			int temp = startingNumber;
			startingNumber = endingNumber;
			endingNumber = temp;
		}
		for (int i = startingNumber; i < endingNumber; i++) {
			if (isPrime(i))
				primeNumbers.add(i);
		}
		return primeNumbers;
	}

	public List<Integer> generatePrimeNumbersTillEndingNumber(int endingNumber) {
		return generatePrimeNumbersInRange(0, endingNumber);
	}

	public boolean isPrime(int num) {
		boolean isPrime = true;
		if (num < 2 || (num != 2 && num % 2 == 0))
			isPrime = false;
		double squareRoot = Math.sqrt(num);
		for (int j = 3; j <= squareRoot; j = j + 2) {
			if (num % j == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public List<Integer> generatePrimeNumbersBySeive(int endingNumber) {
		boolean[] booleanList = new boolean[endingNumber];
		double squareRoot = Math.sqrt(endingNumber);
		for (int num = 3; num < squareRoot; num += 2) {
			if (!booleanList[num]) {
				for (int j = num * num; j < endingNumber; j += (num)) {
					booleanList[j] = true;
				}
			}
		}
		List<Integer> primeNumbersList = new ArrayList<Integer>();
		primeNumbersList.add(2);
		for (int j = 3; j < endingNumber; j += 2) {
			if (!booleanList[j]) {
				primeNumbersList.add(j);
			}
		}
		return primeNumbersList;
	}
}
