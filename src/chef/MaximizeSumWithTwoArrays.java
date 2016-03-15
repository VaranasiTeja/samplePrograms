package chef;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class MaximizeSumWithTwoArrays {
	public static void main(String args[]) throws IOException {
		MaximizeSumWithTwoArrays maxSum = new MaximizeSumWithTwoArrays();
		Scanner input = new Scanner(System.in);
		int numTestCases = input.nextInt();
		int n, k;
		while (numTestCases > 0) {
			n = input.nextInt();
			k = input.nextInt();
			int[] arrayA = new int[n];
			for (int i = 0; i < n; i++) {
				arrayA[i] = input.nextInt();
			}
			int[] arrayB = new int[n];
			for (int i = 0; i < n; i++) {
				arrayB[i] = input.nextInt();
			}
			System.out.println(maxSum.maximumPossibleSum(k, arrayA, arrayB));
			numTestCases--;
		}
		input.close();
	}

	public BigInteger maximumPossibleSum(int k, int[] arrayA, int[] arrayB) {
		int max = 0, position = 0;
		BigInteger result = BigInteger.ZERO;
		for (int i = 0; i < arrayB.length; i++) {
			int var = arrayB[i];
			if (var < 0)
				var = -var;
			if (max < var) {
				max = var;
				position = i;
			}
		}
		if (arrayB[position] > 0)
			arrayA[position] += k;
		else
			arrayA[position] -= k;
		for (int i = 0; i < arrayA.length; i++) {
			result = result.add(BigInteger.valueOf(arrayA[i]).multiply(BigInteger.valueOf(arrayB[i])));
		}
		return result;
	}
}
