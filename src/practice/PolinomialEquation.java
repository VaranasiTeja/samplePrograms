package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PolinomialEquation {

	public List<Integer> getRootsOfPolinomialEquation(int[] coefficients) {
		PolinomialEquation polinomialEquation = new PolinomialEquation();
		List<Integer> factorsOfFirstElement = polinomialEquation.factors(coefficients[0]);
		List<Integer> factorsOfLastElement = polinomialEquation.factors(coefficients[coefficients.length - 1]);
		Set<Integer> rationalZeros = new LinkedHashSet<Integer>();
		for (int element1 : factorsOfLastElement) {
			for (int element2 : factorsOfFirstElement) {
				if (element1 % element2 == 0)
					rationalZeros.add(element1 / element2);
			}
		}
		List<Integer> result = new ArrayList<Integer>();
		for (int number : rationalZeros) {
			int positiveNumber = number;
			int negativeNumber = -positiveNumber;
			if (polinomialEquation.getResultOfEquation(positiveNumber, coefficients) == 0)
				result.add(positiveNumber);
			if (polinomialEquation.getResultOfEquation(negativeNumber, coefficients) == 0)
				result.add(negativeNumber);
		}
		System.out.println(factors(100));
		return result;
	}

	private int getResultOfEquation(int number, int[] coeffiecients) {
		int sum = 0;
		int position = 0;
		for (int i = coeffiecients.length - 1; i > 0; i--) {
			sum = (int) (sum + coeffiecients[position] * Math.pow(number, i));
			position++;
		}
		sum = sum + coeffiecients[coeffiecients.length - 1];
		return sum;
	}

	private List<Integer> factors(int num) {
		List<Integer> factorsOfNum = new ArrayList<Integer>();
		num = num < 0 ? -num : num;
		for (int div = 1; div <= Math.sqrt(num); div++) {
			if (num % div == 0) {
				if (div == Math.sqrt(num)) {
					factorsOfNum.add(div);
					break;
				} else {
					factorsOfNum.add(div);
					factorsOfNum.add(num / div);
				}
			}
		}
		return factorsOfNum;
	}
}
