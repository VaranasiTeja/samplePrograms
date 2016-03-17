package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PolinomialEquationRootsTest {

	PolinomialEquation polinomailEquation = new PolinomialEquation();

	@Test
	public void testRootsOfPolinomialPositiveCases() {
//		int[] coefficients = { 1, -4, -7, 14, -44, 120 };
//		Assert.assertEquals(new ArrayList<Integer>(Arrays.asList(2, -3, 5)),
//				polinomailEquation.getRootsOfPolinomialEquation(coefficients));
//		int[] coefficients2 = { 4, -3, -25, -6 };
//		Assert.assertEquals(new ArrayList<Integer>(Arrays.asList(-2, 3)),
//				polinomailEquation.getRootsOfPolinomialEquation(coefficients2));
//		int[] coefficients3 = { 1, 6, 11, 6 };
//		Assert.assertEquals(new ArrayList<Integer>(Arrays.asList(-1, -2, -3)),
//				polinomailEquation.getRootsOfPolinomialEquation(coefficients3));
		int[] coefficients4 = {1, 0, -13, 0, 36};
		Assert.assertEquals(getRootsOfPolinomialEquation(coefficients4),
				polinomailEquation.getRootsOfPolinomialEquation(coefficients4));
		
	}
	
	public List<Integer> getRootsOfPolinomialEquation(int[] coefficients) {
		List<Integer> result = new ArrayList<Integer>();
		int maxPower = coefficients.length - 1;
		for(int i = -1000; i< 1000; i++){
			int sum = 0;
			for(int k = maxPower; k>=0;k--){
				sum += coefficients[maxPower - k] * Math.pow(i, k);
			}
			if(sum == 0)
				result.add(i);
			
		}
		return result;
	}

}
